package Extra.Subjects.AllProblems;

abstract class X{
    public int proc(X p){
        return 14;
    }
    public abstract void cucu();
}
class Y extends X{
    public int proc(X p){
        return 12;
    }
    public void cucu(){/*...*/}
}
class Z extends X{
    public int proc(Z p){
        return 34;
    }
    public void cucu(){/*...*/}
}

public class P8{
    public static void main(String []args){
        Z a=new Z();
        a.cucu();
        X y=new Y();
        y.cucu();
        X z=new Z();
        z.cucu();
        System.out.println(y.proc(a));
        System.out.println(z.proc(a));

    }

}