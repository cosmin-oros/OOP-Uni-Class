package Extra.Subjects.AllProblems;

abstract class A36 {
    public int proc(A36 p) { return 48; }
}
class B36 extends A36 {
    public int proc(A36 p) { return 12; }
}
class C36 extends B36 {
    public int proc(C36 p) { return 26; }
}
public class P36 {
    public static void main(String argv[]){
        A36 x = new C36();
        B36 y = new B36();
        C36 z = new C36();
        System.out.println(x.proc(z)+y.proc(z));
    }
}
