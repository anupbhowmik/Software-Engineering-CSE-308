package problem1;

public abstract class AbstractFactory {
    abstract DisplaySystem getDisplay(String displayName);
    abstract ProcessorUnit getProcessor(String processorName);
    abstract App getApplication(String appName);
    abstract CommunicationChannel getCommChannel(String commChannelName);
    abstract CommunicationModule getCommModule(String commModuleName);
}
