package problem2;

public abstract class AbstractFactory {
    abstract BasicItem getBasicItem(String basicItemName);
    abstract Appetizer getAppetizer(FoodItem newFood, String appetizerName);
    abstract Drink getDrink(FoodItem newFood, String drinkName);

}
