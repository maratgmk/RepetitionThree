package notifier;

public class EmailNotifier implements Notifier {


    @Override
    public void sendNotification(String message) {
        System.out.println("Send notification by Email : text concerning = " + message);

    }
}
