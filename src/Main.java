import tasksOfclasses.Balalaika;
import block_initialisation.BlockInitialisation;
import tasksOfclasses.Cosmos;
import tasksOfclasses.Cow;

import java.time.LocalDateTime;
import java.util.Arrays;

/**
 * 3 Создайте классы Корова, Космос, Балалайка. Каждый класс должен иметь минимум 2 поля.
 * Переопределите метод toString() данных классов. Создайте экземпляры классов в методе main
 * и соберите их в один массив. Выведите массив в консоль.
 */

public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("Peggy", 253.63);
        Cosmos cosmos = new Cosmos(Math.pow(10, 53) * 1.67, LocalDateTime.now());
        Balalaika hotel = new Balalaika("Johannesburg", 235.55);
        Object[] objects = new Object[]{cow, cosmos, hotel};
        System.out.println(Arrays.toString(objects));


    }
}
