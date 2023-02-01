package Extra.Subjects.AllProblems;

abstract class A{
    public int proc(A p){
        return 20;
    }
}
class B extends A{
    public int proc (A p) {
        return 100;
    }
}
class C extends A {
    public int proc(C p){
        return 75;
    }
}


public class P1{

    public static void main(String []args){
        C x = new C();
        A y = new B();
        C z = new C();
        System.out.println(z.proc(z));
    }
}
