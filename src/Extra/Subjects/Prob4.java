package Extra.Subjects;

class A4{
    public int m(A4 p) {return 8;}
    public int n(A4 p) {return 7;}
}

class B4 extends A4{
    public int m(B4 p) {return 2;}
    public int n(A4 p) {return 44;}
}

class C4 extends A4{
    public int m(A4 p) {return 4;}
    public int n(A4 p) {return 4;}
}

class D4 extends A4{
    public int m(A4 p) {return 11;}
    public int n(D4 p) {return 30;}
}


public class Prob4 {
    public static void main(String args[]) {
        A4 x = new C4();
        A4 y = new D4();
        D4 z = new D4();

        System.out.println(x.n(z) + y.m(z));
    }

}
