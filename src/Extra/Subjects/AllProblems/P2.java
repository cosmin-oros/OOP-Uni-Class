package Extra.Subjects.AllProblems;

class Ex extends Exception{}

public class P2{
    public static void main(String args[]) throws Ex{
        int i = 0;
        int z = 0;
        while(i < 2){
            try{
                int k = 0;
                while (k < 1){
                    k++;
                    z = z+2;
                    System.out.println("z increased by 2 (in while k < 1)");
                    if(i == 0) throw new Ex();
                }
                System.out.println("z increased by 2 (outside while k < 1)");
                z = z+2;
            } catch(Ex e){
                System.out.println(e);
            }finally {
                System.out.println("finally block");
                z = z+1;
            }
            i++;
        }
        System.out.println(z);
    }
}