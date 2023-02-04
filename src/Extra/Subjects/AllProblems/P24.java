package Extra.Subjects.AllProblems;

abstract class A24 {
    public int proc(A24 p) { return 20; }
}
class B24 extends A24 {
    public int proc(A24 p) { return 100; }
}
class C24 extends A24 {
    public int proc(C24 p) { return 75; }
}
public class P24 {
    public static void main(String argv[]){
        C24 x = new C24();
        A24 y = new B24();
        C24 z = new C24();
        System.out.println(y.proc(x)+z.proc(x));
    }
}
