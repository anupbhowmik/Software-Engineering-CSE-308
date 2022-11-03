package ManySubjects;

public class Observer3 implements IObserver{
    @Override
    public void update(int state) {
        System.out.println("[Observer 3 Listening] Current state: " + state);
    }
}
