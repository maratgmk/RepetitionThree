package tasksOfclasses;

public class Balalaika {
    private String city;
    private double amount;

    public Balalaika(String city, double amount) {
        this.city = city;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Balalaika{" +
                "city='" + city + '\'' +
                ", amount=" + amount +
                '}';
    }
}
