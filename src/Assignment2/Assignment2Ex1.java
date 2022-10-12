package Assignment2;

/*
    1. Create a class with a private constructor. What will happen if you
    instantiate the class within a main method if:
    (a) main is in the same class
    (b) main is in another class
 */

public class Assignment2Ex1 {

    private Assignment2Ex1(){
        System.out.println("class instantiated");
    }

    public static void main(String[] args){
        Assignment2Ex1 cl = new Assignment2Ex1();
        /*Planes plane1 = new Planes();*/
    }
}
