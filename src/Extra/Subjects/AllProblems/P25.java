package Extra.Subjects.AllProblems;

class Pair25{
    private int v;
    private int t[];
    public Pair25 (int x,int[] y){
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
public class P25{

    public static Pair25 call(Pair25 p,Pair25 q){
        q.setVT(46, p.getT());
        q=p;
        q.setVIT(20,1,38);
        int tz[]={51,29};
        return new Pair25(79,tz);
    }

    public static void main(String []args){
        int ta[]={96,91};
        int tb[]={20,55};
        Pair25 a=new Pair25(3,ta);
        Pair25 b=new Pair25(29,tb);
        Pair25 c=b;
        b=call(a,b);
        System.out.println(c.getV());
    }
}
