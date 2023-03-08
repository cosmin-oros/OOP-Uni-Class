package CO.testbench;

import CO.bench.DummyBenchmark;
import CO.bench.IBenchmark;
import CO.logging.ConsoleLogger;
import CO.logging.ILogger;
import CO.timing.ITimer;
import CO.timing.Timer;

import java.io.FileNotFoundException;
import java.util.Random;

public class SortingTestbench {
    public static void main(String[] args) throws FileNotFoundException {
        ITimer timer = new Timer();
        ILogger log = new ConsoleLogger();
        IBenchmark bench = new DummyBenchmark();
        Converter converter = new Converter();
        NanoConverter nanoConverter = new NanoConverter();

        final int workLoad = 100;
        bench.initialize(workLoad);
        for (int i = 0; i < 12; ++i) {
            timer.resume();
            bench.run();
            double time = timer.pause();
            double timeNano = time;

            // change to seconds
            time = converter.nanoToSeconds(time);

            double timeMicro = nanoConverter.nanoToMicro(timeNano);
            double timeMilli = nanoConverter.nanoToMilli(timeNano);
            double timeSeconds = nanoConverter.nanoToSeconds(timeNano);

            log.write("Run " + i + ":", timeMicro, " microsec");
            log.write("Run " + i + ":", timeMilli, " millisec");
            log.write("Run " + i + ":", timeSeconds, " sec");

            log.write("Run " + i + ":", time);
        }
        log.write("Finished in ", timer.stop());

        bench.initialize(10000);
        timer.start();
        bench.run();
        long time = timer.stop();

        log.write("Finished in ", time, " ns");
        log.close();
        bench.clean();
    }
}
