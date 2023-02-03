package Extra.Subjects.AllProblems;

abstract class A19 {
    public int proc(B19 p) { return 5; }
}
class B19 extends A19 {
    public int proc(C19 p) { return 21; }
}
class C19 extends B19 {
    public int proc(C19 p) { return 45; }
}
public class P19 {
    public static void main(String argv[]){
        A19 x = new C19();
        C19 y = new C19();
        C19 z = new C19();
        System.out.println(x.proc(z)+y.proc(z));
    }
}
