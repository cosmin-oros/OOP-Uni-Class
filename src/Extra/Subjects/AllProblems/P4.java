package Extra.Subjects.AllProblems;

public class P4{

    public static Pair call(Pair p,Pair q){
        p.setVT(77, q.getT());      // a = 77, 76,54
        p=q;                           // a = c
        p.setVIT(46,1,58);
        /*  Any changes to a will change c
            System.out.println(p.getV());
            System.out.println(p.getT()[0] + " " + p.getT()[1]);
            System.out.println(q.getV());
            System.out.println(q.getT()[0] + " " + q.getT()[1]);
        */
        int tz[]={80,94};
        return new Pair(50,tz);
    }

    public static void main(String []args){
        int ta[]={16,55};
        int tb[]={76,54};
        Pair a=new Pair(86,ta);
        Pair b=new Pair(24,tb);
        Pair c=b;
        b=call(a,c);
        System.out.println(a.getT()[1]);
    }
}