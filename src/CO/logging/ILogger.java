package CO.logging;

import java.io.FileNotFoundException;

public interface ILogger {

    /**
     * Writes a given string to implementing output stream
     *
     * @param string
     */
    public void write(String string);

    /**
     * Writes a given long value to implementing output stream
     *
     * @param value
     */
    public void write(long value);

    /**
     * Writes an array of objects to the implementing output stream. <br>
     * Calls each object's toString method and delimits them with " ".
     *
     * @param values
     */
    public void write(Object... values);

    /**
     * Writes a long value representing elapsed time to the implementing output
     * stream. <br>
     * The time value is converted to the given time unit.
     *
     * @param value
     * @param unit
     */
    public void writeTime(long value, TimeUnit unit);

    /**
     * Writes a (descriptive) string followed by a long value representing elapsed
     * time to the implementing output stream. <br>
     * The time value is converted to the given time unit.
     *
     * @param string
     * @param value
     * @param unit
     */
    public void writeTime(String string, long value, TimeUnit unit);

    /**
     * Called to close the write stream
     */
    public void close();

}
