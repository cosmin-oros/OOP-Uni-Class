package Extra;

import java.util.ArrayList;

class FigureAlreadyInFolderException extends Exception {
    FigureAlreadyInFolderException(String name) {
        super("Figure " + name + " has already been added");
    }
}

class Folder {
    private ArrayList<Figure> list = new ArrayList<Figure>();

    public void addFigure(Figure f) throws FigureAlreadyInFolderException{
        for (Figure fig: list) {
            if (fig.equals(f)) {
                throw new FigureAlreadyInFolderException(f.name);
            }
            list.add(f);
        }
    }

    public void printFigures() {
        for (Figure f: list) {
            System.out.println(f.toString());
        }
    }
}

abstract class Figure {
    String color;
    String name;

    protected Figure(String color, String name) {
        color = color;
        name = name;
    }

    public boolean equals(Figure f) {
        if ((f.color == color) && (f.name == name)) {
            return true;
        }else {
            return false;
        }
    }

    public String toString() {
        return name + " " + color + " " + getArea();
    }

    public abstract double getArea();
}

class Square extends Figure {
    private double area;

    public Square(double a, String color, String name) {
        super(color, name);
        area = a;
    }

    @Override
    public double getArea() {
        return area;
    }
}

class Rectanglee extends Figure {
    private double length;
    private double width;

    public Rectanglee(String color, String name) {
        super(color, name);
    }

    public void setLen(double l) {
        length = l;
    }

    public void setWid(double w) {
        width = w;
    }

    @Override
    public double getArea() {
        try {
            return length * width;
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            return 0;
        }
    }

}

class FolderMain {
    public static void main(String[] args) throws FigureAlreadyInFolderException {
        Folder folder = new Folder();
        Rectanglee f1 = new Rectanglee("red", "f1");
        Square f2 = new Square(40, "green", "f2");

        f1.setLen(12);
        f1.setWid(7);

        folder.addFigure(f1);
        folder.addFigure(f2);

        folder.printFigures();
    }
}
