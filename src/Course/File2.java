package Course;

import java.io.*;

class File2 {
    public static void main(String[] args){
        int[] myArray = new int[15];

        for (int i = 0; i < myArray.length; i++){
            myArray[i] = i;
        }

        try{
            PrintStream out = new PrintStream(new FileOutputStream("myFile.txt"));

            out.print(myArray.length);

            for (int i = 0; i < myArray.length; i++){
                out.println(myArray[i]);
            }

            out.close();
        }catch (IOException e){
            System.out.println("IOERROR" + e.getMessage());
        }
    }
}
