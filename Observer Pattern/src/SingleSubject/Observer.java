package SingleSubject;

public abstract class Observer {
    // observers are the subscribers who wants updates from Subject
    protected Subject subject;
    public abstract void update();
}
