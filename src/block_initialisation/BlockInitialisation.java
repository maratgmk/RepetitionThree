package block_initialisation;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 2 Напишите класс, хранящий два поля: size и numbers. numbers – это массив, который хранит числа
 * от 1 до size по порядку. В классе создайте два конструктора – один по умолчанию, второй – принимает size.
 * При вызове конструктора по умолчанию должен создаваться объект класса, поле size которого задаётся случайно.
 * При этом поле numbers должно быть заполнено корректно.
 */
public class BlockInitialisation {
    private int size;
    public int[] numbers;

    {
        size = ThreadLocalRandom.current().nextInt(1, 12);
        numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = i;
        }
    }

    public BlockInitialisation() {
    }

    public BlockInitialisation(int size) {
        this.size = size;
    }
    //TODO конструктор BlockInitialisation(int size) вызывается или нет?
}



