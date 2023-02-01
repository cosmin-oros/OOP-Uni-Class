package Extra.Subjects.AllProblems;

class ExA extends Exception{}
class ExB extends ExA{}


public class P9{
    public static int make(int a) throws ExA{
        for(int k=0;k<1;k++){
            if(a==1) throw new ExB();
            System.out.println("k=" + k);
            System.out.println("a="+a);
            a=a+2;
        }
        return a;
    }

    public static void main(String []args) throws ExA{
        int x=0;
        for(int i=0;i<2;i++){
            try{
                x++;
                x=make(x);
                System.out.println("x="+x);
                System.out.println("i="+i);
                x++;
            } catch (ExB e){
                System.out.println(e);
            }finally{
                System.out.println("x="+x);
                System.out.println("i="+i);
                x++;
            }
        }

        System.out.println("x ultim="+x);
    }

}
