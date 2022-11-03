package SingleSubject;

import java.util.LinkedList;
import java.util.List;

public class Subject {
    // this is the publisher class
    private List<Observer> observers = new LinkedList<>();
    private  int currState;

    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setState(int newState){
        // remember to notify all attached observers once state is changed
        currState = newState;
        notifyAllObservers();
    }

    public int getState(){
        return currState;
    }

    private void notifyAllObservers(){
        for(Observer observer: observers){
            observer.update();
        }
    }


}
