package Course;

class ExceptionHandling2 {
    public static void main(String[] argv) {
        int[] tab = new int[10];
        int i = 0;
        try {
            while(true) {
                tab[i++] = 1;
            }
        } catch(IndexOutOfBoundsException e) {
            System.out.println("init");
        }
    }
}
