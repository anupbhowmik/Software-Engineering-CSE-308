package ManySubjects;

import java.util.LinkedList;
import java.util.List;

public class Subject2 implements ISubject{
    // each subject(Publisher) has their own subscriber list and state to broadcast
    private List<IObserver> observers = new LinkedList<>();
    private int currState;
    @Override
    public void register(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(IObserver observer) {
        observers.remove(observer);
    }

    public void setState(int newState){
        currState = newState;
        notifyObservers();
    }
    public int getState(){
        return  currState;
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer: observers){
            observer.update(currState);
        }

    }
}
