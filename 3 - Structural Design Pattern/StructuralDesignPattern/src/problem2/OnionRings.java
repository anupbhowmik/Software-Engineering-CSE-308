package problem2;

public class OnionRings extends Appetizer implements FoodItem{
    public OnionRings(FoodItem newFood) {
        super(newFood, "Onion Rings ", PRICE_LIST.ONION_RINGS);
    }
}
