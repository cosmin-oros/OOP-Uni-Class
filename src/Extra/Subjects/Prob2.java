package Extra.Subjects;

class Pair{
    private int v;
    private int t[];
    public Pair (int x,int[] y){
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
public class Prob2{

    public static Pair call(Pair p,Pair q){
        p.setVT(76, q.getT());
        p=q;
        p.setVIT(87,0,74);
        int tz[]={97,93};
        return new Pair(19,tz);
    }

    public static void main(String []args){
        int ta[]={29,35};
        int tb[]={6,87};
        Pair a=new Pair(3,ta);
        Pair b=new Pair(50,tb);
        Pair c=b;
        b=call(a,c);
        System.out.println(c.getV());
    }
}