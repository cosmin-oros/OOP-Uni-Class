package Extra.Subjects.AllProblems;

interface Cursant{
    String getNume();
}
class Student implements Cursant{
    private String nume;
    public Student (String n){
        nume=n;
    }
    public String getNume(){
        return nume;
    }
    public String getTip(){
        return "Student";
    }
}
class Elev implements Cursant{
    private String nume;
    public Elev(String n){
        nume=n;
    }
    public String getNume(){
        return nume;
    }
    public String getTip(){
        return "Elev";
    }
}
public class P14{
    public static  void main(String argv[]){
        Student c=new Student ("Eu");
        System.out.println(c.getTip());
    }
}
