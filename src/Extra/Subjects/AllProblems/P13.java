package Extra.Subjects.AllProblems;

class ExA13 extends Exception{}
class ExB13 extends ExA13{}

class A13{
    public int make(int x)throws ExA13{
        return 1;
    }
}

class B13 extends A13{
    public int make(int x) throws ExA13{
        for(int k=0;k<2;k++){
            if(x==0) throw new ExA13();
            System.out.println("k=" + k);
            System.out.println("a="+x);
            x=x-4;
        }
        return x;
    }
}
public class P13{


    public static void main(String []args) {
        B13 b=new B13();
        int x=0;
        for(int i=0;i<3;i++){
            try{

                x=b.make(x);
                System.out.println("x="+x);
                System.out.println("i="+i);
            } catch (ExA13 e){
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
