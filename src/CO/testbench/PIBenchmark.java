package CO.testbench;

import CO.bench.DummyBenchmark;
import CO.bench.IBenchmark;
import CO.bench.cpu.DigitsOfPi;
import CO.logging.ConsoleLogger;
import CO.logging.ILogger;
import CO.timing.ITimer;
import CO.timing.Timer;

import java.io.FileNotFoundException;

public class PIBenchmark {
    public static void main(String[] args) throws FileNotFoundException {

        ITimer timer = new Timer();
        ILogger log = new ConsoleLogger();
        IBenchmark bench = new DigitsOfPi();

        final int workload = 50000;
        String timeUnit = "ms";

        for (int i = 0; i < 20; i++){
            bench.initialize(workload);
            timer.resume();
            bench.run();
            long time = timer.pause();
            log.write("Run " + i + ": ", time, timeUnit);
            //log.write("\n");
            //log.write("\nRun " + i + ": ", time);
        }

        log.write(timer.stop(), timeUnit);

    }
}
