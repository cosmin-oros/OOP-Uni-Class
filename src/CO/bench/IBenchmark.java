package CO.bench;

public interface IBenchmark {

    /**
     * Called to explicitly initialize benchmark data. <br>
     * This call should not be benchmarked.
     *
     * @param params variable list of arguments (of any type) needed to setup the benchmark
     */
    public void initialize(Object ... params);

    /**
     * Called right before running the algorithm itself to "warm-up" the task at
     * hand. <br>
     * The warm up should do the exact task as the run method, however it should not
     * be timed. <br>
     * The amount of warm-up data/time should be between 10-100% of the total time.
     * <br>
     * This call should not be benchmarked.
     */
    public void warmUp();

    /**
     * Calls the actual benchmarking algorithm, optionally after <b>initialize</b>
     * was called. <br>
     * This call should be benchmarked.
     */
    public void run();

    /**
     * Calls the actual benchmarking algorithm, optionally after <b>initialize</b>
     * was called. <br>
     * This call should be benchmarked.
     *
     * @param May pass a benchmark option defined by the benchmark class
     *               itself
     */
    public void run(Object... options);

    /**
     * Stops a benchmark during execution. <br>
     * Should be checked in the main for-loop, or main thread of the benchmark.
     */
    public void cancel();

    /**
     * Called to explicitly release allocated data. <br>
     * This call should not be benchmarked.
     */
    public void clean();

    /**
     * Return the result of the benchmark. <br>
     * This call should not be benchmarked.
     *
     * @return
     */
    public String getResult();
}
