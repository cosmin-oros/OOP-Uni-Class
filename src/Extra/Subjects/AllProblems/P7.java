package Extra.Subjects.AllProblems;

class Pair7{
    private int p;
    private int q;

    public void set(int a, int b){
        p=a; q=b;
    }

    public int getP(){
        return p;
    }
    public int getQ(){
        return q;
    }
}
public class P7{

    public static Pair7 call(Pair7 e,Pair7 f){
        e=f;
        e.set(14,15);
        return e;
    }

    public static void main(String []args){
        Pair7 x=new Pair7();
        x.set(12,13);
        Pair7 y=new Pair7();
        y.set(10,11);
        Pair7 z=y;
        // z.set(16,17);
        y=call(x,y);
        z.set(16,17);
        System.out.println(x.getP());
        System.out.println(y.getQ());
    }
}