package problem1;

public class DisplayFactory extends AbstractFactory {


    @Override
    DisplaySystem getDisplay(String displayName) {
        if (displayName == null)
            return null;
        if (displayName.equalsIgnoreCase("LCD"))
            return new LCDdisplay();
        if (displayName.equalsIgnoreCase("LED"))
            return new LEDdisplay();

        return  null;

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
        return null;
    }
}
