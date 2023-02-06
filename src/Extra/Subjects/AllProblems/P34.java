package Extra.Subjects.AllProblems;

class Pair34{
    private int v;
    private int t[];
    public Pair34 (int x,int[] y){
        v=x;
        t=y;
    }
    public void setVT(int x, int[] y){
        v=x; t=y;
    }
    public void setVIT(int x, int i, int y){
        v=x; t[i]=y;
    }
    public int getV(){
        return v;
    }
    public int[] getT(){
        return t;
    }
}
public class P34{

    public static Pair34 call(Pair34 p,Pair34 q){
        q.setVT(100, p.getT());
        q=p;
        q.setVIT(53,1,34);
        int tz[]={88,81};
        return new Pair34(20,tz);
    }

    public static void main(String []args){
        int ta[]={71,59};
        int tb[]={11,61};
        Pair34 a=new Pair34(19,ta);
        Pair34 b=new Pair34(83,tb);
        Pair34 c=b;
        b=call(a,b);
        System.out.println(c.getT()[1]);
    }
}
