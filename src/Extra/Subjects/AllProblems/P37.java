package Extra.Subjects.AllProblems;

class Pair37{
    private int v;
    private int t[];
    public Pair37 (int x,int[] y){
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
public class P37{

    public static Pair37 call(Pair37 p,Pair37 q){
        p.setVT(7, q.getT());
        p=q;
        p.setVIT(25,0,44);
        int tz[]={61,66};
        return new Pair37(57,tz);
    }

    public static void main(String []args){
        int ta[]={1,30};
        int tb[]={94,88};
        Pair37 a=new Pair37(79,ta);
        Pair37 b=new Pair37(16,tb);
        Pair37 c=b;
        b=call(a,c);
        System.out.println(a.getT()[1]);
    }
}