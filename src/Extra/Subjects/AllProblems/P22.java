package Extra.Subjects.AllProblems;

abstract class A22 {
    public int proc(B22 p) { return 25; }
}
class B22 extends A22 {
    public int proc(C22 p) { return 96; }
}
class C22 extends B22 {
    public int proc(C22 p) { return 99; }
}
public class P22 {
    public static void main(String argv[]){
        A22 x = new C22();
        C22 y = new C22();
        C22 z = new C22();
        System.out.println(x.proc(z)+y.proc(z));
    }
}
