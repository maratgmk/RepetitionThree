package bacterium;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 3 Создайте класс Бактерия, который имеет поле Название и Объём.
 * Для каждой бактерии объём задаётся случайно в пределах от 0,01 до 0,1.
 * В методе main создайте одну бактерию. С помощью клонирующего конструктора в цикле создавайте новые бактерии,
 * пока они не заполнят объём чаши Петри, равный 100.
 */
public class Germ {
    private String name;
    private double volume;
    public static final int PETRI = 100;

    public Germ(double volume) {
        this.volume = ThreadLocalRandom.current().nextDouble(0.01, 0.1);
    }

    public Germ(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public Germ(Germ original) {
        this(original.name, original.volume);
    }

    public String getName() {
        return name;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Germ{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                '}';
    }
}
