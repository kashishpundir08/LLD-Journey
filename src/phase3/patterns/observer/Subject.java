package phase3.patterns.observer;

public interface Subject {
    public void subscribe(Observer o);
    public void unsubscribe(Observer o);
    public void notifyObservers(String videoTitle);

}
