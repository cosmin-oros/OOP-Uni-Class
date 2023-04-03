package CO.bench.cpu;

import CO.bench.IBenchmark;

public class CPUThreadedRoots implements IBenchmark {

    private double result;
    private int size;
    private boolean running;

    @Override
    public void initialize(Object... params) {
        size = (int) params[0];
    }

    @Override
    public void warmUp() {
        run();
    }

    @Override
    public void run() {
        run(Runtime.getRuntime().availableProcessors());
    }

    @Override
    public void run(Object... options) {
        int nThreads = (int) options[0];
        int jobsPerThread = size / nThreads;

        Thread[] threads = new Thread[nThreads];

        running = true;
        for (int i = 0; i < nThreads; ++i) {
            int from = i * jobsPerThread + 1;
            int to = (i + 1) * jobsPerThread;
            if (i == nThreads - 1) {
                to = size;
            }
            threads[i] = new Thread(new SquareRootTask(from, to));
            threads[i].start();
        }

        for (int i = 0; i < nThreads; ++i) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void cancel() {
        running = false;
    }

    @Override
    public void clean() {
        // no resources to clean up
    }

    @Override
    public String getResult() {
        return String.valueOf(result);
    }

    class SquareRootTask implements Runnable {

        private int from, to;
        private final double precision = 1e-4;
        private double result = 0.0;

        public SquareRootTask(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public void run() {
            for (int i = from; i <= to && running; ++i) {
                result += getNewtonian(i);
            }
            addResult(result);
        }

        private synchronized void addResult(double partialSum) {
            result += partialSum;
        }

        private double getNewtonian(double x) {
            double s = x;
            while (Math.abs(s * s - x) > precision && running) {
                s = (s + x / s) / 2.0;
            }
            return s;
        }

    }


}