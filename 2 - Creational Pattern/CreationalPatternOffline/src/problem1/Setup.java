package problem1;

public class Setup {
    protected AbstractFactory processorFactory = FactoryProducer.getFactory("Processor");
    protected AbstractFactory displayFactory = FactoryProducer.getFactory("Display");
    protected AbstractFactory appFactory = FactoryProducer.getFactory("App");
    protected AbstractFactory commModuleFactory = FactoryProducer.getFactory("CommModule");
    protected AbstractFactory commChannelFactory = FactoryProducer.getFactory("CommChannel");


    protected int numOfDisplayUnit;
    protected String commChannel;
    // the above two are user defined
    // user will select either mobile data or broadband and we will provide sim card or wifi module respectively

    public Setup(int n, String commChannel){
        numOfDisplayUnit = n;
        this.commChannel = commChannel;
    }
}
