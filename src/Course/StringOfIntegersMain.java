package Course;

class StringOfIntegers {
    private static final int MAX_LEN = 3;
    private int[] string = new int[MAX_LEN];
    private int counter = 0;

    public boolean add(int v) {
        if (counter == string.length) {
            return false;
        }

        string[counter++] = v;
        return true;
    }

    public int getValueAtPosition(int index) {
        if (index < 0 || index >= MAX_LEN) {
            return -1;
        }
        return string[index];
    }

    public String toString() {
        String s = "";

        for (int i = 0; i < counter; i++) {
            s += string[i] + " ";
        }
        return s;
    }
}

class FullStringOfIntegersException extends Exception {}

class StringOfIntegersMain {
    public static void main(String[] args) {
        StringOfIntegers myString = new StringOfIntegers();
        myString.add(1);
        myString.add(-1);
        myString.add(3);

        System.out.println(myString);
        System.out.println(myString.getValueAtPosition(1));
        System.out.println(myString.getValueAtPosition(3));

        Exception e = new FullStringOfIntegersException();

        System.out.println(e.getMessage());
        System.out.println(e.getLocalizedMessage());
        System.out.println(e.toString());
        e.printStackTrace();
        e.printStackTrace(System.out);
    }
}
