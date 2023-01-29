package Extra.Subjects;

class A2 {}

class B2 extends A2 {}


public class Prob3 {
    public static void main(String args[]) {
        A2 a = new B2();
        B2 b = new B2();
        Object o = new A2();
        System.out.println(/*AICI*/);

        System.out.println(A2.class.equals(a.getClass()));
        System.out.println(A2.class.isInstance(b));
        System.out.println(o.getClass().equals(Object.class));
        System.out.println(a.getClass().equals(b.getClass()));
        System.out.println(B2.class.isInstance(a));
    }

}
