package Extra.Subjects.AllProblems;

class X30{
    protected int v=0;
    public X30(){
        v+=28;
    }
}
class Z30 extends Y30{
    public Z30(){
        v+=28;
    }
}
class Y30 extends X30{
    public Y30(){
        v-=29;
    }
    public int getV(){
        return v;
    }
}
public class P30{

    public static void main(String []args){
        X30 x=new Z30();
        Y30 y=new Y30();
        Z30 z=new Z30();
        System.out.println(y.getV());
    }
}