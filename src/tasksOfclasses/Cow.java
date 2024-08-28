package tasksOfclasses;

public class Cow {
    private String name;
    private double weight;

    public Cow(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
