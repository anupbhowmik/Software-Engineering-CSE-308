package SingleSubject;

public class HexObserver extends Observer{
    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attachObserver(this);
        // or we can call subject.attachObserver(observer1) in the main method
    }

    @Override
    public void update() {
        System.out.println("[Hex Observer Listening]" + "Hex string: " + Integer.toHexString(subject.getState()));

    }
}
