package notifier;

/**
 * Разработайте интерфейс Notifier с методом sendNotification(String message).
 * Создайте классы EmailNotifier, SMSNotifier, и PushNotifier, каждый из которых реализует
 * интерфейс Notifier и отправляет уведомление соответствующим способом
 * (достаточно вывести в консоль, как отправлено сообщение).
 * Создайте функцию, которая принимает Notifier и сообщение, и используйте эту функцию для отправки различных типов уведомлений.
 */
public class Function {
    //TODO сложная функция, в качестве аргумента принимает другую функцию
//почему не было задач на такую сложную тему?
    public void function(Notifier notifier, String message) {
        notifier.sendNotification(message);
    }
}
