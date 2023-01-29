package Extra.Subjects;

interface I1 {
    public void g();
}
interface J1 extends I1{
    public void h();
}

abstract class A6 implements I1 {
    public void m() {}
}

class B6 extends A6 implements J1 {
    public void p() {}
    public void g() {}
    public void h() {}
}


public class Prob6 {
    public static void main(String args[]) {
        J1 j = new B6();
        A6 a = new B6();
        j.g();
        // a.p(); error
        a.g();
        // j.m(); error
        // a.h(); error
    }

}
