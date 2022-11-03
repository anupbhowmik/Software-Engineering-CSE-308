package ManySubjects;

public class Main {
    public static void main(String[] args) {
        // many subjects many observers

        Subject1 subject1 = new Subject1();
        Subject2 subject2 = new Subject2();

        Observer1 observer1 = new Observer1();
        Observer2 observer2 = new Observer2();
        Observer3 observer3 = new Observer3();

        subject1.register(observer1);
        subject1.register(observer2);

        subject2.register(observer2);
        subject2.register(observer3);

        subject2.setState(12);
        subject1.setState(132);
        subject2.unregister(observer2);
        subject2.setState(10);


    }
}