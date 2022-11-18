package Extra;

class Product {

    // Method 1
    // Multiplying two integer values
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method 2
    // Multiplying three integer values
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Multiplying three double values.
    public double Prod(double a, double b, double c) {
        return a * b * c;
    }
}

class ExtraOverloading {
    public static void main(String[] args) {
        Product p = new Product();

        System.out.println(p.multiply(2, 3));
        System.out.println(p.multiply(4, 5, 6));
    }
}
