package CO.timing;

public interface ITimer {
    void start();
    long stop();
    void resume();
    long pause();
}