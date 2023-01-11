package Extra;

interface Shape2 {
    public void draw();
}

abstract class AbstractShape {
    public void moveTo(int x, int y) {
        // implementation
    }
    public abstract void draw();
}

class Circle2 extends AbstractShape {
    public void draw() {
        // implementation
    }
}

class Square2 implements Shape2 {
    public void draw() {
        // implementation
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Shape2 square = new Square2();
        square.draw();
        AbstractShape circle = new Circle2();
        circle.draw();
        circle.moveTo(10,10);
    }
}
