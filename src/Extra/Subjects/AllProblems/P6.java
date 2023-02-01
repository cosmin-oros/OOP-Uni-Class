package Extra.Subjects.AllProblems;

class SpecialCase extends Exception{}

public class P6{
    public static void execute (int y) throws Exception{
        if(y==3)
            throw new SpecialCase();
    }
    public static void main(String argv[]){
        int k=5;
        try{
            do{
                k--;
                execute(k);
            }while(k!=0);
        }catch (Exception e){
            System.out.println(e);
        }System.out.println(k);
    }
}