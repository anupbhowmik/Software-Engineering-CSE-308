package problem1;

public class AppFactory extends AbstractFactory {

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
        if (appName.equalsIgnoreCase("DeluxeApp"))
            return new DeluxeApp();
        if (appName.equalsIgnoreCase("OptimalApp"))
            return new OptimalApp();
        if (appName.equalsIgnoreCase("PoorApp"))
            return new PoorApp();

        return null;
    }

    @Override
    CommunicationChannel getCommChannel(String commChannelName) {
        return null;
    }

    @Override
    CommunicationModule getCommModule(String commModuleName) {
        return null;
    }
}
