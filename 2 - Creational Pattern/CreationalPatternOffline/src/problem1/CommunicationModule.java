package problem1;

public class CommunicationModule implements Item{
    private final String commModuleName;
    private final double price;

    public CommunicationModule(String commModuleName, double price) {
        this.commModuleName = commModuleName;
        this.price = price;
    }

    @Override
    public String getDescription() {
        return commModuleName;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
