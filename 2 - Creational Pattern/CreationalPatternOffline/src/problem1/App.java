package problem1;

public class App implements Item{
    private final String displayName;
    private final double price;

    public App(String processorName, double price) {
        this.displayName = processorName;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return displayName;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
