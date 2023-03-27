package CO.testbench;

import CO.bench.IBenchmark;
import CO.bench.cpu.CPUFixedVsFloatingPoint;
import CO.bench.cpu.LoopUnrolling;
import CO.bench.cpu.NumberRepresentation;
import CO.logging.ConsoleLogger;
import CO.logging.ILogger;
import CO.logging.TimeUnit;
import CO.timing.ITimer;
import CO.timing.Timer;

public class LoopUnrollingBenchmark {
    public static void main(String[] args) {
        ITimer timer = new Timer();
        ILogger log = /* new FileLogger("bench.log"); */new ConsoleLogger();
        TimeUnit timeUnit = TimeUnit.Milli;

        IBenchmark bench = new LoopUnrolling();
        bench.initialize(10000000);
        bench.warmUp();

        timer.start();

        long time = timer.stop();
        log.writeTime("Finished in", time, timeUnit);
        log.write("Result is", bench.getResult());

        bench.clean();
        log.close();
    }
}
