package notifier;

public class PushNotifier implements Notifier {

    @Override
    public void sendNotification(String message) {
        System.out.println("Send notification by PUSH method:  input secret cod = " + message);
    }

}
