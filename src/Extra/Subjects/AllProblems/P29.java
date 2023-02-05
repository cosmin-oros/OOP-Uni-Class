package Extra.Subjects.AllProblems;

class X29{
    protected int v=0;
    public X29(){
        v+=87;
        System.out.println("X");
    }
}
class Y29 extends X29{
    public Y29(){
        v-=94;
        System.out.println("Y");
    }
    public int getV(){
        return v;
    }
}
class Z29 extends Y29{
    public Z29(){
        v+=46;
        System.out.println("Z");
    }
}
public class P29{

    public static void main(String []args){
        X29 x=new Z29();
        Y29 y=new Y29();
        Z29 z=new Z29();
        System.out.println(y.getV());
    }
}
