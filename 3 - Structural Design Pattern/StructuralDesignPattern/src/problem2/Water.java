package problem2;

public class Water extends Drink implements FoodItem{
    public Water(FoodItem newFood) {
        super(newFood, "Water ", PRICE_LIST.WATER);
    }
}
