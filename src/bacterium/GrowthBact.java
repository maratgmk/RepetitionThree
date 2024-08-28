package bacterium;

import java.util.concurrent.ThreadLocalRandom;

public class GrowthBact {
    public static void main(String[] args) {
        Germ germ = new Germ("Cholerius", ThreadLocalRandom.current().nextDouble());
        System.out.println("Название бактерии " + germ.getName());
        System.out.println("Объём одной бациллы : " + germ.getVolume());
        System.out.println(germ);

        double totalVolume = 0.0;

        while (totalVolume <= Germ.PETRI) {
            Germ cloned = new Germ(germ);
            totalVolume = totalVolume + cloned.getVolume();
        }
        System.out.println("Бактерии размножились до объема : " + totalVolume);
    }


}
