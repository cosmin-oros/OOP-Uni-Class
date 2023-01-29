package Extra.Subjects;

interface I {}
interface J {}
interface IJ extends I, J {}
class A5 implements I {}
class B5 extends A5 implements J {}
class C5 extends A5 {}
class D5 implements IJ {}


public class Prob5 {
    public void doSomething(I i, J j, IJ ij){
        A5 a = new A5();
        B5 b = new B5();
        C5 c = new C5();
        D5 d = new D5();
        //AICI
    }

    public static void main(String args[]) {

    }

}
