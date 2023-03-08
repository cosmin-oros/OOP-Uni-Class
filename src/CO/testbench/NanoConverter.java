package CO.testbench;

public class NanoConverter {
    public double nanoToSeconds(double n) {
        return 1.0 * n / 1000000000;
    }

    public double nanoToMicro(double n) {
        return 1.0 * n / 1000;
    }

    public double nanoToMilli(double n) {
        return 1.0 * n / 1000000;
    }
}
