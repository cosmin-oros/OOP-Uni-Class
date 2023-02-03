package Extra.Subjects.AllProblems;

class Pair11{
    private int n;
    private Pair11 p;

    public Pair11(int a,Pair11 b){
        n=a;
        p=b;
    }

    public void set(int a,Pair11 b){
        n=a; p=b;
    }

    public int getN(){
        return n;
    }
    public Pair11 getP(){
        return p;
    }
}
public class P11{

    public static Pair11 call(Pair11 e,Pair11 f){
        f.set(10, e.getP());
        f=e;
        f.set(20,new Pair11(30,null));
        return new Pair11(50,new Pair11(60,null));
    }

    public static void main(String []args){
        Pair11 x=new Pair11(70,new Pair11(80,null));
        Pair11 y=new Pair11(90,new Pair11(100,null));
        Pair11 z=y;
        x=call(x,y);

        System.out.println(z.getN());
        System.out.println(y.getP().getN());
    }
}
