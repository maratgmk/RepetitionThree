package notifier;

public class SmsNotifier implements Notifier {

    @Override
    public void sendNotification(String message) {
        System.out.println("Send notification by Phone :  text = " + message);

    }
}
