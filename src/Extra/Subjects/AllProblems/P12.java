package Extra.Subjects.AllProblems;

class X12{
    protected int v=0;
    public X12(){
        v+=10;
        System.out.println("X");
    }
    public void proc(X12 p){
        System.out.println(12);
    }
}
class Y12 extends X12{
    public Y12(){
        v-=5;
        System.out.println("Y");
    }
    public void proc(X p){
        System.out.println(62);
    }
    public int getV(){
        return v;
    }
}
class Z12 extends Y12{
    public Z12(){
        v+=9;
        System.out.println("Z");
    }
    public void proc(Z12 p){
        System.out.println(34);
    }
}
public class P12{

    public static void main(String []args){
        X12 x=new Z12();
        System.out.println();
        Y12 y=new Z12();
        System.out.println();
        Z12 z=new Z12();
        System.out.println();
        x.proc(z);
        System.out.println(y.getV());
    }
}