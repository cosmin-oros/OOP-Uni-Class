package Extra.Subjects.AllProblems;

class ExA40 extends Exception {}
class ExB40 extends ExA40 {}
public class P40 {
    public static int make(int a) throws ExA40 {
        for(int k=0;k<3;k++){
            a = a - 1;
            if(a==-2) throw new ExB40();
        }
        return a;
    }
    public static void main(String argv[]) throws ExA40 {
        int x = 0;
        for(int i=0;i<2;i++){
            try {
                x=x-1;
                x=make(x);
                x=x-1;
            }catch (ExB40 e){
                System.out.println(e);
            }finally{
                x=x-1;
            }
        }
        System.out.println(x);
    }
}