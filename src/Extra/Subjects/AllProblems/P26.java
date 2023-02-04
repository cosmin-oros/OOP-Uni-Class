package Extra.Subjects.AllProblems;

abstract class A26 {
    public int proc(A26 p) { return 76; }
}
class B26 extends A26 {
    public int proc(A26 p) { return 14; }
}
class C26 extends A26 {
    public int proc(C26 p) { return 88; }
}
public class P26 {
    public static void main(String argv[]){
        C26 x = new C26();
        A26 y = new B26();
        C26 z = new C26();
        System.out.println(y.proc(x)+z.proc(x));
    }
}