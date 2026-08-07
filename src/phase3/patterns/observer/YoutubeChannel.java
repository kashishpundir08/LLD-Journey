package phase3.patterns.observer;

import java.util.List;

public class YoutubeChannel implements Subject{
    private String channelName;
    private List<Observer> subscribers;

    public YoutubeChannel(){
    }
    public YoutubeChannel(String channelName){
        this.channelName = channelName;
    }
    public void subscribe(Observer o){
        subscribers.add(o);
    }
    public void unsubscribe(Observer o){
        subscribers.remove(o);

    }
    public void notifyObservers(String videoTitle ){
        for()

    }
}
