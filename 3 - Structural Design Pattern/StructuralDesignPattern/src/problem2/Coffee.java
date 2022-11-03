package problem2;

public class Coffee extends Drink implements FoodItem{
    public Coffee(FoodItem newFood) {
        super(newFood, "Coffee ", PRICE_LIST.COFFEE);
    }
}
