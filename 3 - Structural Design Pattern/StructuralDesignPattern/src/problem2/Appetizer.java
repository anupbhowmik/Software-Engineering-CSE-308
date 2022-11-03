package problem2;

public class Appetizer extends FoodDecorator{
    private final String appetizerName;
    private final double price;

    public Appetizer(FoodItem newFood, String appetizerName, double price) {
        super(newFood);
        this.appetizerName = appetizerName;
        this.price = price;
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " + " + appetizerName;
    }

    @Override
    public double price() {
        return super.price() + price;
    }
}
