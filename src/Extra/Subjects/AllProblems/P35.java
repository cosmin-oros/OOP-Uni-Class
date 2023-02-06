package Extra.Subjects.AllProblems;

class Pair35{
    private int v;
    private int t[];
    public Pair35 (int x,int[] y){
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
public class P35{

    public static Pair35 call(Pair35 p,Pair35 q){
        p.setVT(17, q.getT());
        p=q;
        p.setVIT(72,1,21);
        int tz[]={89,41};
        return new Pair35(94,tz);
    }

    public static void main(String []args){
        int ta[]={0,13};
        int tb[]={45,99};
        Pair35 a=new Pair35(66,ta);
        Pair35 b=new Pair35(55,tb);
        Pair35 c=b;
        b=call(a,c);
        System.out.println(a.getT()[0]);
    }
}
