package problem2;

public abstract class FoodDecorator implements FoodItem{
    private final FoodItem newFood;

    public FoodDecorator(FoodItem newFood) {
        this.newFood = newFood;
    }

    @Override
    public String prepareFood() {
        return newFood.prepareFood();
    }

    @Override
    public double price() {
        return newFood.price();
    }
}
