package Extra.Subjects.AllProblems;

class Pair16{
    private int x;
    private int y;

    public Pair16(int a,int b){
        x=a;
        y=b;
    }

    public void set(int a,int b){
        x=a; y=b;
    }

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
public class P16{

    public static Pair16 call(Pair16 a,Pair16 b){
        a.set(36,35);
        b=new Pair16(48,47);
        b.set(59, a.getX()+b.getY());
        return b;
    }

    public static void main(String []args){
        Pair16 p=new Pair16(12,11);
        Pair16 q=new Pair16(24,23);
        Pair16 s=p;
        p=call(p,q);

        System.out.println(s.getX());
        System.out.println(q.getY());
        System.out.println(q.getX());
        System.out.println(p.getY());
        System.out.println(p.getX());
    }
}
