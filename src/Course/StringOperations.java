package Course;

import java.io.*;
import java.util.Locale;

class StringOperations {
    public static void main(String[] args) throws IOException {
        String s1 = "John";
        String s2 = s1.concat(" has apples");

        // check if the second string ends with "apples"
        System.out.println(s2.endsWith("apples"));
        // check if the first string start with 'b'
        System.out.println(s1.startsWith("b"));

        // check if the two strings are equal
        System.out.println(s1.equals(s2));

        System.out.println(s2.toUpperCase(Locale.ROOT));

        FileInputStream file_stream = new FileInputStream("myFile.txt");
        BufferedReader in_stream_char = new BufferedReader(new InputStreamReader(System.in));
        PrintStream out_stream = new PrintStream(new FileOutputStream("out.txt"));

        int n = Integer.parseInt(in_stream_char.readLine());

    }
}
