package Course;

public class OverloadedMethods {

    public void print(String data, boolean print){
        if (print){
            System.out.println("Data " + data);
        }
    }

    public void print(boolean print, String data){
        if (print){
            System.out.println("Data " + data);
        }
    }

    public static void main(String[] args){
        OverloadedMethods obj = new OverloadedMethods();
        obj.print(true, "15");
        obj.print("15", true);
    }
}
