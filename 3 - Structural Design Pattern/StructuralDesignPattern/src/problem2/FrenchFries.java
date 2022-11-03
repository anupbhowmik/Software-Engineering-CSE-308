package problem2;

public class FrenchFries extends Appetizer implements FoodItem{
    public FrenchFries(FoodItem newFood) {
        super(newFood, "French Fries ", PRICE_LIST.FRENCH_FRIES);
    }
}
