package Extra.Subjects;

abstract class A1{
    public int proc(A1 p){
        return 20;
    }
}
class B extends A1{
    public int proc (A1 p) {

        return 100;
    }
}
class C extends A1 {
    public int proc(C p){
        return 75;
    }
}

public class Prob1 {
    public static void main(String []args){
        C x=new C();
        A1 y=new B();
        C z=new C();
        System.out.println(z.proc(z));
    }
}
