package Extra.Subjects;

class ExA extends Exception {}
class ExB extends ExA {}

public class Prob7 {
    public static int make(int a) throws ExA {
        for(int k=0;k<3;k++){
            a = a - 1;
            if(a==-2) throw new ExB();
        }
        return a;
    }
    public static void main(String argv[]) throws ExA {
        int x = 0;
        for(int i=0;i<2;i++){
            try {
                x=x-1;
                x=make(x);
                x=x-1;
            }catch (ExB e){
                System.out.println(e);
            }finally{
                x=x-1;
            }
        }
        System.out.println(x);
    }
}