package Assignment2;

public class Assignment2Ex2 {
    public static void main(String[] args){
        Engine e1, e2;
        e1 = new Engine(5);
        e2 = e1;
        e2.setCapacity(10);
        e1.print();
    }
}
