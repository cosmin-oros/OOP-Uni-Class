package Extra.Subjects.AllProblems;

class Pair28{
    private int v;
    private int t[];
    public Pair28 (int x,int[] y){
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
public class P28{

    public static Pair28 call(Pair28 p,Pair28 q){
        q.setVT(15, p.getT());
        q=p;
        q.setVIT(25,0,20);
        int tz[]={36,6};
        return new Pair28(12,tz);
    }

    public static void main(String []args){
        int ta[]={85,9};
        int tb[]={25,68};
        Pair28 a=new Pair28(18,ta);
        Pair28 b=new Pair28(9,tb);
        Pair28 c=b;
        b=call(a,b);
        System.out.println(c.getT()[0]);
    }
}