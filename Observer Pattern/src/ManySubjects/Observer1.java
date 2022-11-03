package ManySubjects;

public class Observer1 implements IObserver{
    @Override
    public void update(int state) {
        System.out.println("[Observer 1 Listening] Current state: " + state);
    }
}
