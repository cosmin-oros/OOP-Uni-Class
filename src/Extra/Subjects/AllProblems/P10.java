package Extra.Subjects.AllProblems;

class A10{
    protected static int x=0;
    public A10(){
        x-=6;
    }
    public int execut(B10 p){
        return 43;
    }
}
class B10 extends A10{
    public int execut(B10 p){
        return 37;
    }
}
class C10 extends B10{
    public C10(){
        x+=10;
    }
    public int execut(C10 p){
        return 69;
    }
    public static int getX(){
        return x;
    }
}
public class P10{

    public static void main(String []args){
        A10 x=new A10();
        A10 y=new C10();
        System.out.println(C10.getX());
        C10 z=new C10();
        System.out.println(y.execut(z));
    }
}
