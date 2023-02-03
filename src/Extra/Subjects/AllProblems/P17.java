package Extra.Subjects.AllProblems;

class A17{
    public void ex(Object o){
        System.out.println("A");
    }
}
class B17 extends A17{
    public void ex(B17 o){
        System.out.println("B");
    }
}
public class P17{
    public static void main(String args[]){
        A17 x;
        x=new B17();
        x.ex(x);
    }
}