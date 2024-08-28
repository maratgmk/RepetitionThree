package clock;

import java.util.Scanner;

public class WatchTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Включите звук на часах, нажав true  или false");
        String userPrint = scanner.next();
        boolean position = Boolean.parseBoolean(userPrint);

        Clock mechanic = new Clock(TypeClock.MECHANIC, position);
        Clock electric = new Clock(TypeClock.ELECTRONIC, position);
        Clock cuckoo = new Clock(TypeClock.CUCKOO, position);

        System.out.printf("Текущее время по часам %s показывает %s и бьёт %s%n", TypeClock.MECHANIC.name(), mechanic.getTime(), mechanic.getSound());
        System.out.printf("Текущее время по часам %s показывает %s и бьёт %s%n", TypeClock.ELECTRONIC.name(), electric.getTime(), electric.getSound());
        System.out.printf("Текущее время по часам %s показывает %s и бьёт %s%n", TypeClock.CUCKOO.name(), cuckoo.getTime(), cuckoo.getSound());

    }
}
