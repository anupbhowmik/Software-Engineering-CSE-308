package problem1;

public class ProcessorFactory extends AbstractFactory {

    @Override
    DisplaySystem getDisplay(String displayName) {
        return null;
    }

    @Override
    ProcessorUnit getProcessor(String processorName) {
        if (processorName == null)
            return null;
        if (processorName.equalsIgnoreCase("ATMega32"))
            return new ATMega32();
        if (processorName.equalsIgnoreCase("ArduinoMega"))
            return new ArduinoMega();
        if (processorName.equalsIgnoreCase("RaspberryPi"))
            return new RaspberryPi();

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
