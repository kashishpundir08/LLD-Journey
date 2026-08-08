package phase3.patterns.observer;

public class User implements Observer{
    private String username;

    public User(String username){
        this.username = username;
    }
    public void update(String videoTitle){
        System.out.println((username + " notified: " + videoTitle));
    }
}
