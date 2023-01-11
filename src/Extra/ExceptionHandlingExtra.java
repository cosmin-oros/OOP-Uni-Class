package Extra;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;

public class ExceptionHandlingExtra {
    public static void main(String[] args) {
        try {
            // This could throw a FileNotFoundException
            File file = new File("input.txt");
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            // This could throw a ParseException
            int number = Integer.parseInt(line);
            // This could throw an IOException
            System.out.println("Read from file: " + number);
        } catch (FileNotFoundException e) {
            System.out.println("Could not find file.");
        } catch (IOException e) {
            System.out.println("An IO error occurred.");
        } finally {
            System.out.println("The try-catch is finished.");
        }
    }
}
