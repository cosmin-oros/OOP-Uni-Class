package Extra.Subjects;

class A {
    private static int x;
    private int y;

    public A(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public void setXY(int x1, int y1) {
        x = x1;
        y = y1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

public class Client3 {
    public static void m(A z, A t) {
        z.setXY(3, 20);
        z = new A(2, 17);
    }

    public static void main(String[] args) {
        A a = new A(9, 50);
        A b = new A(7, 28);
        m(a, b);
        System.out.println(a.getY() + " " + b.getX());
    }
}
