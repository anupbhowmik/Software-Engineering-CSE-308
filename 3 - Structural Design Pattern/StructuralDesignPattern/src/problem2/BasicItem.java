package problem2;

public class BasicItem implements FoodItem{
    private final String basicItemName;
    private final double price;

    public BasicItem(String basicItemName, double price) {
        this.basicItemName = basicItemName;
        this.price = price;
    }

    @Override
    public String prepareFood() {
        return basicItemName;
    }

    @Override
    public double price() {
        return price;
    }
}
