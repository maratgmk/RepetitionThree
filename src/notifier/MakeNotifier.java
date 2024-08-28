package notifier;

public class MakeNotifier {
    public static void main(String[] args) {
        Notifier method1 = new PushNotifier();
        Notifier method2 = new EmailNotifier();
        Notifier method3 = new SmsNotifier();
        method3.sendNotification("Hello!");
        method2.sendNotification("How much?");
        method1.sendNotification("65937");
        Function sending = new Function(); //TODO это тоже интерфейс? extends Notifier
        sending.function(method1, "53535");
        sending.function(method2, "Salary");
        sending.function(method3, "How are you?");


    }
}
