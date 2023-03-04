package CO.logging;

import java.io.FileNotFoundException;

public interface ILogger {
    void write(long a);
    void write(String a);
    void write(Object ... values) throws FileNotFoundException;
    void close();
}
