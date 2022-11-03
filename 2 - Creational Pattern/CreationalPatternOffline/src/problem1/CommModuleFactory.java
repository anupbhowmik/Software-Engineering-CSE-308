package problem1;

public class CommModuleFactory extends AbstractFactory {

    @Override
    DisplaySystem getDisplay(String displayName) {
        return null;
    }

    @Override
    ProcessorUnit getProcessor(String processorName) {
        return null;
    }

    @Override
    App getApplication(String appName) {
        return null;
    }

    @Override
    CommunicationChannel getCommChannel(String commChannelName) {
        return null;
    }

    @Override
    CommunicationModule getCommModule(String commModuleName) {
        if (commModuleName.equalsIgnoreCase("SimCard"))
            return new SimCard();
        if (commModuleName.equalsIgnoreCase("WifiModule"))
            return new WifiModule();
        return null;
    }
}
