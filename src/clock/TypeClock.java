package clock;

public enum TypeClock {
    ELECTRONIC("Пи-Пи-Пи"),
    CUCKOO("Ку-Ку"),
    MECHANIC("Дин-Дон");
    private final String sound;

    TypeClock(String sound) {
        this.sound = sound;
    }

    public String getSound() {
        return sound;
    }
}
