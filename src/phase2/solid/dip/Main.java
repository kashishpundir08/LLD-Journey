package phase2.solid.dip;

public class Main {
    public static void main(String[] args) {
        NotificationService email = new NotificationService(new EmailSender());
        NotificationService sms = new NotificationService(new SmsSender());
        email.notify("Your otp is 1234");
        sms.notify("Your order has been placed");
    }
}
