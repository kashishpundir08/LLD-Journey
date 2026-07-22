package phase2.solid.dip;

public class NotificationService {
    private MessageSender sender;

    public NotificationService(MessageSender sender){
        this.sender = sender;
    }

    public void notify(String message){
        sender.send(message);
    }
}
