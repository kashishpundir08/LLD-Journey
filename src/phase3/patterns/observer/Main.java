package phase3.patterns.observer;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel c1 = new YoutubeChannel("Bhakti Path");
        User u1 = new User("Kashish");
        User u2 = new User("Arjun");
        User u3 = new User("Madhav");

        c1.subscribe(u1);
        c1.subscribe(u2);
        c1.subscribe(u3);
        c1.uploadVideo("Hare Krishna");
        c1.unsubscribe(u1);
        c1.uploadVideo("Radha");
    }
}
