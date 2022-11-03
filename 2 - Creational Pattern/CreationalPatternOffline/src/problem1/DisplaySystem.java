package problem1;

public class DisplaySystem implements Item {
    private final String displayName;
    private final double price;

    public DisplaySystem(String displayName, double price) {
        this.displayName = displayName;
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
