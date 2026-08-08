package phase3.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Subject{
    private String channelName;
    private List<Observer> subscribers = new ArrayList<>();

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
        for(Observer observer : subscribers){
            observer.update(videoTitle);
        }
    }

    public void uploadVideo(String title){
        System.out.println(channelName + " uploaded " + title);
        notifyObservers(title);
    }
}
