package Extra.Subjects.AllProblems;

class Grup{
    private int z;
    private static int t;

    public void set(int a, int b){
        z=a; t=b;
    }

    public int getZ(){
        return z;
    }
    public int getT(){
        return t;
    }
}
public class P18{

    public static void call(Grup e,Grup f){
        e.set(56,0);
        f.set(77,33);
    }

    public static void main(String []args){
        Grup a=new Grup(); a.set(12,92);
        Grup b=new Grup();  b.set(23,44);
        call(a,b);
        System.out.println(a.getZ());
        System.out.println(a.getT());
    }
}
