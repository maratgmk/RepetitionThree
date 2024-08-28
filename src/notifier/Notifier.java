package notifier;

/**
 * Разработайте интерфейс Notifier с методом sendNotification(String message).
 * Создайте классы EmailNotifier, SMSNotifier, и PushNotifier, каждый из которых реализует
 * интерфейс Notifier и отправляет уведомление соответствующим способом
 * (достаточно вывести в консоль, как отправлено сообщение).
 * Создайте функцию, которая принимает Notifier и сообщение, и используйте эту функцию для отправки различных типов уведомлений.
 */
public interface Notifier {
    void sendNotification(String message);
}
