package ManySubjects;

public class Observer2 implements IObserver{
    @Override
    public void update(int state) {
        System.out.println("[Observer 2 Listening] Current state: " + state);
    }
}
