package problem2;

public class Cheese extends FoodDecorator{
    public Cheese(FoodItem newFood) {
        super(newFood);
    }

    @Override
    public String prepareFood() {
        return super.prepareFood() + " + Cheese ";
    }

    @Override
    public double price() {
        return super.price() + PRICE_LIST.CHEESE;
    }
}
