package Assignment1;

/*
    3. Write a Java program that will print the even numbers between 1 and
    100, compute and print the sum of the odd numbers between 1 and 100.
 */

class Assignment1Ex3 {
    public static void main(String[] args){
        int sumOdd = 0;

        System.out.print("Even numbers: ");
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }else{
                sumOdd += i;
            }
        }

        System.out.println("\nSum of odd numbers: " + sumOdd);
    }
}
