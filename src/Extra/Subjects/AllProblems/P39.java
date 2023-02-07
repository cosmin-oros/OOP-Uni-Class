package Extra.Subjects.AllProblems;

abstract class A39 {
    public int proc(A39 p) { return 89; }
}
class B39 extends A39 {
    public int proc(A39 p) { return 33; }
}
class C39 extends A39 {
    public int proc(C39 p) { return 79; }
}
public class P39 {
    public static void main(String argv[]){
        C39 x = new C39();
        A39 y = new B39();
        A39 z = new C39();
        System.out.println(y.proc(x)+z.proc(x));
    }
}
