package problem2;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryName){
        if (factoryName.equalsIgnoreCase("Burger"))
            return new BasicItemFactory();
        if (factoryName.equalsIgnoreCase("Appetizer"))
            return new AppetizerFactory();
        if (factoryName.equalsIgnoreCase("Drink"))
            return new DrinkFactory();

        return null;
    }
}
