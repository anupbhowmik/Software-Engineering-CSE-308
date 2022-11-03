package problem2;

public class Drink extends FoodDecorator{
    private final String drinkName;
    private final double price;

    public Drink(FoodItem newFood, String drinkName, double price) {
        super(newFood);
        this.drinkName = drinkName;
        this.price = price;

    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " + " + drinkName;
    }

    @Override
    public double price() {
        return super.price() + price;
    }
}
