package number_generation;

/**
 * 1 Создайте класс, который генерирует случайные целые чётные числа.
 * Добавьте методы для получения максимального и минимального чисел,
 * которые были сгенерированы экземплярами данного класса.
 */
public class InstanceOfGeneration {
    public static void main(String[] args) {
        NumberGeneration generation1 = new NumberGeneration();
        NumberGeneration generation2 = new NumberGeneration();
        NumberGeneration generation3 = new NumberGeneration();
        NumberGeneration generation4 = new NumberGeneration();
        NumberGeneration generation5 = new NumberGeneration();
        NumberGeneration generation6 = new NumberGeneration();
        NumberGeneration generation7 = new NumberGeneration();

        System.out.println(generation1.getNumber());
        System.out.println(generation2.getNumber());
        System.out.println(generation3.getNumber());

        generation1.getMaxOrMin();
        generation2.getMaxOrMin();
        generation3.getMaxOrMin();
        generation4.getMaxOrMin();
        generation5.getMaxOrMin();
        generation6.getMaxOrMin();
        generation7.getMaxOrMin();

        System.out.println(NumberGeneration.getMaxNumber());
        System.out.println(NumberGeneration.getMinNumber());


    }
}
