package number_generation;
/**
 * 1 Создайте класс, который генерирует случайные целые чётные числа.
 * Добавьте методы для получения максимального и минимального чисел,
 * которые были сгенерированы экземплярами данного класса.
 */

import java.util.Random;


public class NumberGeneration {
    static Random RND = new Random();
    private static int maxNumber = Integer.MIN_VALUE;
    private static int minNumber = Integer.MAX_VALUE;
    private final int number;


    public NumberGeneration() {
        this.number = RND.nextInt(0, 1000) * 2;
    }

    public int getNumber() {
        return number;
    }

    public void getMaxOrMin() {
        if (number > maxNumber) {
            maxNumber = number;
        }
        if (number < minNumber) {
            minNumber = number;
        }
    }

    public static Integer getMaxNumber() {
        return maxNumber;
    }

    public static Integer getMinNumber() {
        return minNumber;
    }
}
