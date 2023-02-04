package Extra.Subjects.AllProblems;

abstract class A27 {
    public int proc(A27 p) { return 98; }
}
class B27 extends A27 {
    public int proc(A27 p) { return 17; }
}
class C27 extends B27 {
    public int proc(C27 p) { return 65; }
}
public class P27 {
    public static void main(String argv[]){
        A27 x = new C27();
        B27 y = new B27();
        C27 z = new C27();
        System.out.println(x.proc(z)+y.proc(z));
    }
}
