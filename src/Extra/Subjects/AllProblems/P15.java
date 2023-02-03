package Extra.Subjects.AllProblems;

class Except extends RuntimeException{}
public class P15{
    public static void execut (int x) throws Except{
        if(x==1)
            throw new Except();
    }
    public static void main(String argv[]){
        int a=0;
        try{
            for(int i=0;i<3;i++){
                execut(i);
                a++;
            }
        }catch (Except e){
            System.out.println(e);
        }finally{
            a++;
        }
        System.out.println(a);
    }
}
