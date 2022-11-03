package ManySubjects;

interface ISubject {
    void register(IObserver observer);
    void unregister(IObserver observer);
    void notifyObservers();
}
