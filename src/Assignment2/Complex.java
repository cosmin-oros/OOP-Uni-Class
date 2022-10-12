package Assignment2;

public class Complex {
    // real part
    double re;
    // imaginary part
    double im;
    // how many times it was printed
    static int printed = 0;

    // constructor for init the value
    Complex(double r, double i){
        this.re = r;
        this.im = i;
    }

    // method to calculate the module of the complex number
    public double calculateModule(){
        return Math.sqrt(re*re + im*im);
    }

    // method for printing the value of the complex number
    public void printComplex(){
        System.out.println(re + " i*" + im);
        System.out.println("A complex nr was printed " + complexPrinted() + " times");
    }

    // method for calculating how many times a complex nr was printed
    public int complexPrinted(){
        printed++;
        return printed;
    }
}
