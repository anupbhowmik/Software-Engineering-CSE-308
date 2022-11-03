package problem2;

public class AppetizerFactory extends AbstractFactory {


    @Override
    BasicItem getBasicItem(String basicItemName) {
        return null;
    }

    @Override
    Appetizer getAppetizer(FoodItem newFood, String appetizerName) {
        if (appetizerName.equalsIgnoreCase("OnionRings"))
            return new OnionRings(newFood);
        if (appetizerName.equalsIgnoreCase("FrenchFries"))
            return new FrenchFries(newFood);
        return null;
    }

    @Override
    Drink getDrink(FoodItem newFood, String drinkName) {
        return null;
    }
}
