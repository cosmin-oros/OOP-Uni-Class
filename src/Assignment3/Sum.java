package Assignment3;

class Sum {
    // can only use one addition operator

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + sum(b, c);
    }

    public static int sum(int a, int b, int c, int d){
        return sum(a, b) + sum(c, d);
    }
}

class SumMain{
    public static void main(String[] args){
        System.out.println(Sum.sum(1, 2));
        System.out.println(Sum.sum(1, 2, 3));
        System.out.println(Sum.sum(1, 2, 3, 4));
    }
}
