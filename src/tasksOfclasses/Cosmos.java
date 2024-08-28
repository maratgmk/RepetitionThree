package tasksOfclasses;

import java.time.LocalDateTime;

public class Cosmos {
    private double mass;
    private final LocalDateTime duration;

    public Cosmos(double mass, LocalDateTime duration) {
        this.mass = mass;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Cosmos{" +
                "mass=" + mass +
                ", duration=" + duration +
                '}';
    }
}
