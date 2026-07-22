package phase2.solid.dip;

public class SmsSender implements MessageSender{
    public void send(String message){
        System.out.println("SMS Sending  " + message);
    }
}
