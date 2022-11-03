package problem1;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryName){
        if (factoryName.equalsIgnoreCase("Display"))
            return new DisplayFactory();
        if (factoryName.equalsIgnoreCase("Processor"))
            return new ProcessorFactory();
        if (factoryName.equalsIgnoreCase("App"))
            return new AppFactory();
        if (factoryName.equalsIgnoreCase("CommModule"))
            return new CommModuleFactory();
        if (factoryName.equalsIgnoreCase("CommChannel"))
            return new CommChannelFactory();

        return null;
    }
}
