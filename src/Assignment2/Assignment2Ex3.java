package Assignment2;

/*
    3. Define a class Complex useful for modelling complex numbers. The
    members of this class are:
    • two double attributes (re, im) for storing the real part, as well as the
    imaginary part of a complex number
    • one constructor for initialising the two double values
    • a method for computing the module of a complex number (use the static
    method sqrt(double) from the Math class for computing the positive
    square root of a double value)
    • a method for printing the value of the complex number (re + i * im)
    • a method for computing the sum between two complex numbers, the
    result being a new complex number
    • a method for counting and returning for how many times complex
    numbers have been printed
    Create a class ClientComplex with a main method where some complex
    numbers are instantiated and all the existing services provided by these
    objects are called.
 */

public class Assignment2Ex3 {
    public static void main(String[] args){
        Complex nr1 = new Complex(1.0, 2.0);
        double mod = nr1.calculateModule();
        System.out.println("Module of nr1: " + mod);

        nr1.printComplex();

    }

    // method to calculate the sum of two complex nrs
    public Complex sumOfComplex(Complex nr1, Complex nr2){
        double sumIm = nr1.im + nr2.im;
        double sumRe = nr1.re + nr2.re;
        Complex sum = new Complex(sumRe, sumIm);

        return sum;
    }
}
