package Extra.Subjects.AllProblems;

abstract class A38 {
    public int proc(B38 p) { return 80; }
}
class B38 extends A38 {
    public int proc(C38 p) { return 58; }
}
class C38 extends B38 {
    public int proc(C38 p) { return 26; }
}
public class P38 {
    public static void main(String argv[]){
        A38 x = new C38();
        C38 y = new C38();
        C38 z = new C38();
        System.out.println(x.proc(z)+y.proc(z));
    }
}