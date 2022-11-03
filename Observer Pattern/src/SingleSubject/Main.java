package SingleSubject;

public class Main {
    public static void main(String[] args) {
        // single subject many observers
        Subject subject = new Subject();
        Observer hexOb = new HexObserver(subject);
        Observer binOb = new BinaryObserver(subject);

        subject.setState(15);
        subject.removeObserver(binOb);
        subject.setState(12);

    }
}