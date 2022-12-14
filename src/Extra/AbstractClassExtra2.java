package Extra;

/*
    In this example, the Shape class is an abstract class that defines two abstract methods:
    getArea and getPerimeter. These methods must be implemented by any non-abstract class that extends Shape.
    In this example, the Circle and Rectangle classes extend
    the Shape class and provide implementations for the abstract methods.

    Abstract classes are useful when you want to define a common behavior or interface
    for a group of related classes, but the classes may have different implementations for
    some of the methods. By using abstract classes, you can ensure that all the subclasses implement
    the required methods and avoid repeating code in the subclasses.
 */

abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class AbstractClassExtra2 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Perimeter of circle: " + circle.getPerimeter());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());
    }
}
