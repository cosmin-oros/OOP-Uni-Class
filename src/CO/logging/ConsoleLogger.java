package CO.logging;

public class ConsoleLogger implements ILogger {

    @Override
    public void write(long a) {
        System.out.println(a);
    }

    @Override
    public void write(String a) {
        System.out.println(a);
    }

    @Override
    public void write(Object ... values) {
        for (Object val : values) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    @Override
    public void close() {

    }
}
