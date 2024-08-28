package clock;

import java.time.LocalTime;

/**
 * * 1 Создайте класс Часы. Класс хранит поле типа часов (электронные, с кукушкой, механические) и поле, включен ли звук часов.
 * * Класс содержит метод включения и отключения звука часов, а также метод, выводящий в консоль текущее время
 * * (используйте LocalTime.now().toString() для получения текущего времени в виде строки).
 * * Если звук часов включен, то при показе времени часы должны издавать звук: часы с кукушкой – «Ку-ку»,
 * * электронные – «Пи-пи-пи», а механические – «Дин-дон». Создайте разные экземпляры часов в методе main
 * * и узнайте время в тихом режиме, затем включите звук на всех часах и снова узнайте время.
 */
public class Clock {
    private TypeClock typeClock;
    private boolean isSound;

    public Clock(TypeClock typeClock, boolean isSound) {
        this.typeClock = typeClock;
        this.isSound = isSound;
    }

    public String getSound() {
        if (!isSound) return "Ничего";
        return typeClock.getSound();
    }

    public String getTime() {
        return LocalTime.now().toString();
    }
}
