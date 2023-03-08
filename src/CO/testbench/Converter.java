package CO.testbench;

public class Converter {

    public double nanoToSeconds(double n) {
        return 1.0 * n / 1000000000;
    }

    public double milliToSeconds(double n) {
        return 1.0 * n / 1000;
    }

    public double microToSeconds(double n) {
        return 1.0 * n / 1000000;
    }

}
