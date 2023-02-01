package Extra.Subjects.AllProblems;

class Pair{
    private int v;
    private int t[];
    public Pair (int x, int[] y){
        v = x;
        t = y;
    }
    public void setVT(int x, int[] y){
        v = x; t = y;
    }
    public void setVIT(int x, int i, int y){
        v = x; t[i] = y;
    }
    public int getV(){
        return v;
    }
    public int[] getT(){
        return t;
    }
}
public class P3{

    public static Pair call(Pair p,Pair q){
        p.setVT(76, q.getT());  // 76, {6, 87}
        p=q;
        p.setVIT(87,0,74);
        int tz[]={97,93};
        return new Pair(19,tz);
    }

    public static void main(String []args){
        int ta[]={29,35};
        int tb[]={6,87};
        Pair a=new Pair(3,ta);      // 3, {29, 35}
        Pair b=new Pair(50,tb);     // 50, {6, 87}
        Pair c=b;                      // 50, {6, 87}
        b=call(a,c);                   // b = 19, {97, 93}
        System.out.println(c.getV());
    }
}