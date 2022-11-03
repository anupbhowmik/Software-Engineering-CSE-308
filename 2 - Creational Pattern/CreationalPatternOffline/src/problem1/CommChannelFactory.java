package problem1;

public class CommChannelFactory extends AbstractFactory {

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
        if (commChannelName.equalsIgnoreCase("MobileData"))
            return new MobileData();
        if (commChannelName.equalsIgnoreCase("Broadband"))
            return new Broadband();
        return null;
    }

    @Override
    CommunicationModule getCommModule(String commModuleName) {
        return null;
    }
}
