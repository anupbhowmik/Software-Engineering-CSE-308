package problem2;

public class Coke extends Drink implements FoodItem{
    public Coke(FoodItem newFood) {
        super(newFood, "Coke ", PRICE_LIST.COKE);
    }
}
