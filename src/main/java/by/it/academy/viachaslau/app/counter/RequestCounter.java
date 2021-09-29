package by.it.academy.viachaslau.app.counter;

public class RequestCounter {
    private long countAll;
    private long countGet;
    private long countPost;

    public void incrementCountAll() {
        countAll++;
    }

    public void incrementCountGet() {
        countGet++;
    }

    public void incrementCountPost() {
        countPost++;
    }

    public long getCountAll() {
        return countAll;
    }

    public long getCountGet() {
        return countGet;
    }

    public long getCountPost() {
        return countPost;
    }
}
