package Extra.Subjects.AllProblems;

interface A5{
    void name();
}
abstract class B5 implements A5{
    protected int x=0;
    public B5(){
        x=1;
    }
    public int sum(int a){
        x=x+a;
        return x;
    }
}

class C5 extends B5{
    public void name(){
        System.out.println(x);
    }
}
public class P5{
    public static void main(String argv[]){
        C5 c=new C5();
        ((B5)c).sum(10);
        System.out.println(((B5)c).sum(10));
    }
}
