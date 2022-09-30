package Assignment1;

/*
    4. Print the next sequence of characters using for.
    * * *
    * *
    *
 */

class Assignment1Ex4 {
    public static void main(String[] args){
        for (int i = 3; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
