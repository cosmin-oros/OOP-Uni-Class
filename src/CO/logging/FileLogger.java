package CO.logging;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileLogger implements ILogger {

    String arr = "5 2 7 9 2 4 0 10 5";

    File file;
    OutputStream os = null;

    public FileLogger() throws IOException {
        file = new File("myfile.txt");
        Desktop desktop = Desktop.getDesktop();

        if(file.exists()) desktop.open(file);
    }

    @Override
    public void write(long a) {

    }

    @Override
    public void write(String a) {

    }

    @Override
    public void write(Object... values) {
        try {
            os = new FileOutputStream(file);
            os.write(arr.getBytes(), 0, arr.length());
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void close() {
        try {
            os.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
