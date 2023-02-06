package Extra.Subjects.AllProblems;

abstract class A33 {
    public int proc(A33 p) { return 74; }
}
class B33 extends A33 {
    public int proc(A33 p) { return 33; }
}
class C33 extends A33 {
    public int proc(C33 p) { return 71; }
}
public class P33 {
    public static void main(String argv[]){
        C33 x = new C33();
        A33 y = new B33();
        C33 z = new C33();
        System.out.println(y.proc(x)+z.proc(x));
    }
}