package CO.testbench;

import CO.bench.DummyBenchmark;
import CO.bench.IBenchmark;
import CO.logging.ConsoleLogger;
import CO.logging.ILogger;
import CO.timing.ITimer;
import CO.timing.Timer;

import java.io.FileNotFoundException;

public class Test1 {
    public static void main(String[] args) throws FileNotFoundException {
        ITimer timer = new Timer();
        ILogger log = new ConsoleLogger();
        IBenchmark benchmark = new DummyBenchmark();

        benchmark.initialize(100000);
        timer.start();
        benchmark.run();
        log.write("Finished in ", timer.stop(), "ns");

        log.close();
    }
}
