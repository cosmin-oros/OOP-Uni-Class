package Extra.Subjects.AllProblems;

class Ex32 extends Exception{}
public class P32{
    public static void main(String args[]) throws Ex32{
        int i=0;
        int z=0;
        while(i<2){
            try{
                int k=0;
                while (k<3){
                    k++;
                    z=z+2;
                    System.out.println("+2");
                    if(i==0) throw new Ex32();
                }
                z=z+2;
                System.out.println("+ 2");
            } catch(Ex32 e){
                System.out.println(e);
            }finally {
                z=z+1;
                System.out.println("+1");
            }
            i++;
        }
        System.out.println(z);
    }
}
