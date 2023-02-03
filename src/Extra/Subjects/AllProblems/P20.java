package Extra.Subjects.AllProblems;

class ExA20 extends Exception {}
class ExB20 extends ExA20 {}
public class P20 {
    public static int make(int a) throws ExA20 {
        for(int k=0;k<3;k++){
            a = a + 2;
            if(a==3) throw new ExB20();
        }
        return a;
    }
    public static void main(String argv[]) throws ExA20 {
        int x = 0;
        for(int i=0;i<2;i++){
            try {
                x++;
                System.out.println(x + " 1");
                x=make(x);
                System.out.println(x + " 2");
                x++;
                System.out.println(x + " 3");
            }catch (ExB20 e){
                System.out.println(e);
            }finally{
                x++;
                System.out.println(x + " 4");
            }
        }
        System.out.println();
        System.out.println(x);
    }
}