package Extra;

abstract class Base {

    Base()
    {
        // Print statement
        System.out.println("Base Constructor Called");
    }

    // Abstract method inside class1
    abstract void fun();
}

class Derived extends Base {

    // Constructor of class2
    Derived()
    {
        System.out.println("Derived Constructor Called");
    }

    // Method of class2
    void fun()
    {
        System.out.println("Derived fun() called");
    }
}

class AbstractExtra {
    public static void main(String args[])
    {
        Derived d = new Derived();
        d.fun();
    }
}
