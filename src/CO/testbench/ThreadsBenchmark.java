package CO.testbench;

import CO.bench.IBenchmark;
import CO.bench.cpu.CPUThreadedRoots;
import CO.logging.ConsoleLogger;
import CO.logging.ILogger;
import CO.logging.TimeUnit;
import CO.timing.ITimer;
import CO.timing.Timer;

public class ThreadsBenchmark {
    public static void main(String[] args) {
        IBenchmark bench = new CPUThreadedRoots();
        ITimer timer = new Timer();
        ILogger log = new ConsoleLogger();
        TimeUnit timeUnit = TimeUnit.Sec;

        bench.initialize(1000000);
        bench.warmUp();

        for (int i = 1; i <= 8; i *= 2) {
            timer.start();
            bench.run(i);
            long time = timer.stop();
            log.writeTime("[t=" + i + "] Finished in ", time, timeUnit);
        }

        bench.clean();
        log.close();
    }
}
