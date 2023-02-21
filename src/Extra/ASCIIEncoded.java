package Extra;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'decode' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING encoded as parameter.
     */

    public static String decode(String encoded) {
        String decoded = "";

        // first reversing the string
        String reversed = "";
        for(int i = encoded.length()-1; i >= 0; i--) {
            reversed += encoded.charAt(i);
        }

        // then decoding the reversed string
        String temp;
        for (int i = 0; i < encoded.length(); i += 2) {
            temp = String.valueOf(encoded.charAt(i) + encoded.charAt(i+1));
            if (temp.compareTo("90") <= 0) {

            } else if (temp.compareTo("122") <= 0) {

            }
        }

        return decoded;
    }

}

public class ASCIIEncoded {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String encoded = bufferedReader.readLine();

        String result = Result.decode(encoded);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
