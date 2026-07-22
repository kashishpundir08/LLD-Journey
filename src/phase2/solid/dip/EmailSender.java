package phase2.solid.dip;

public class EmailSender implements MessageSender{
    public void send(String message){
        System.out.println("Sending email " + message);
    }
}
