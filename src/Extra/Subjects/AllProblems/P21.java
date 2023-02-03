package Extra.Subjects.AllProblems;

class Pair21{
    private int v;
    private int t[];
    public Pair21 (int x,int[] y){
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
public class P21{

    public static Pair21 call(Pair21 p,Pair21 q){
        q.setVT(96, q.getT());
        q=p;
        q.setVIT(51,0,36);
        int tz[]={22,74};
        return new Pair21(31,tz);
    }

    public static void main(String []args){
        int ta[]={18,66};
        int tb[]={51,31};
        Pair21 a=new Pair21(83,ta);
        Pair21 b=new Pair21(26,tb);
        Pair21 c=b;
        b=call(a,b);
        System.out.println(a.getT()[0]);
    }
}
