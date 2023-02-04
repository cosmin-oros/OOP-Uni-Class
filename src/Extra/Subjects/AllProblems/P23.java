package Extra.Subjects.AllProblems;

class Ex23 extends Exception{}
public class P23{
    public static void main(String args[]) throws Ex23{
        int i=0;
        int z=0;
        while(i<2){
            try{
                int k=0;
                while (k<2){
                    k++;
                    z++;
                    if(i==0) throw new Ex23();
                }
                z++;
            } catch(Ex23 e){
                System.out.println(e);
            }finally {
                z++;
            }
            i++;
        }
        System.out.println(z);
    }
}