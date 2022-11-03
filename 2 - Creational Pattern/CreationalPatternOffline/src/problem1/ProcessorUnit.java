package problem1;

public class ProcessorUnit implements Item{

    private final String processorName;
    private final double price;

    public ProcessorUnit(String processorName, double price) {
        this.processorName = processorName;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return processorName;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
