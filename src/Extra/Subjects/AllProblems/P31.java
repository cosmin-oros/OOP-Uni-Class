package Extra.Subjects.AllProblems;

class Pair31{
    private int v;
    private int t[];
    public Pair31 (int x,int[] y){
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
public class P31{

    public static Pair31 call(Pair31 p,Pair31 q){
        p.setVT(2, q.getT());
        p=q;
        p.setVIT(52,0,20);
        int tz[]={74,80};
        return new Pair31(50,tz);
    }

    public static void main(String []args){
        int ta[]={62,94};
        int tb[]={64,53};
        Pair31 a=new Pair31(50,ta);
        Pair31 b=new Pair31(61,tb);
        Pair31 c=b;
        b=call(a,c);
        System.out.println(a.getT()[0]);
    }
}
