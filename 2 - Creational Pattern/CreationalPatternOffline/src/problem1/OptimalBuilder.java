package problem1;

public class OptimalBuilder extends Setup implements iBuilder{
    ProcessorUnit processor;
    DisplaySystem display;
    App application;
    CommunicationChannel communicationChannel;
    CommunicationModule communicationModule;

    private final Product finalProduct = new Product();

    public OptimalBuilder(int n, String commChannel) {
        super(n, commChannel);  // setting user preferences here
    }


    @Override
    public void buildProcessor() {
        processor = processorFactory.getProcessor("ArduinoMega");
        finalProduct.addPart(processor);

    }

    @Override
    public void buildDisplay() {
        display = displayFactory.getDisplay("LED");
        for (int i = 0; i<numOfDisplayUnit; i++){
            finalProduct.addPart(display);
        }


    }

    @Override
    public void buildApp() {
        application = appFactory.getApplication("DeluxeApp");
        finalProduct.addPart(application);

    }

    @Override
    public void buildComChannel() {
        if (commChannel.equalsIgnoreCase("MobileData")){
            communicationChannel = commChannelFactory.getCommChannel("MobileData");
            communicationModule = commModuleFactory.getCommModule("SimCard");


        } else if (commChannel.equalsIgnoreCase("Broadband")){
            communicationChannel = commChannelFactory.getCommChannel("Broadband");
            communicationModule = commModuleFactory.getCommModule("WifiModule");
        } else {
            System.out.println("Invalid option");
        }
        finalProduct.addPart(communicationChannel);
        finalProduct.addPart(communicationModule);
    }


    @Override
    public Product getFinalProduct() {
        System.out.println("Your Optimal package is ready to deliver, enjoy!");
        return finalProduct;
    }
}
