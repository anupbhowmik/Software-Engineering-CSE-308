package problem2;

public class BasicItemFactory extends AbstractFactory {


    @Override
    BasicItem getBasicItem(String basicItemName) {
        if (basicItemName.equalsIgnoreCase("Veggi"))
            return new VeggiBurger();
        if (basicItemName.equalsIgnoreCase("Beef"))
            return new BeefBurger();
        if (basicItemName.equalsIgnoreCase("Chicken"))
            return new ChickenBurger();
        return null;
    }

    @Override
    Appetizer getAppetizer(FoodItem newFood,String appetizerName) {
        return null;
    }

    @Override
    Drink getDrink(FoodItem newFood,String drinkName) {
        return null;
    }
}
