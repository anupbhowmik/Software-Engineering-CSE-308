package problem2;

public class DrinkFactory extends AbstractFactory {


    @Override
    BasicItem getBasicItem(String basicItemName) {
        return null;
    }

    @Override
    Appetizer getAppetizer(FoodItem newFood,String appetizerName) {
        return null;
    }

    @Override
    Drink getDrink(FoodItem newFood, String drinkName) {
        if (drinkName.equalsIgnoreCase("Coffee"))
            return new Coffee(newFood);
        if (drinkName.equalsIgnoreCase("Water"))
            return new Water(newFood);
        if (drinkName.equalsIgnoreCase("Coke"))
            return new Coke(newFood);
        return null;
    }
}
