package SingleSubject;

public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
        // or we can call subject.attachObserver(observer1) in the main method
    }

    @Override
    public void update() {
        System.out.println("[Binary Observer Listening]" + "Binary string: " + Integer.toBinaryString(subject.getState()));

    }
}
