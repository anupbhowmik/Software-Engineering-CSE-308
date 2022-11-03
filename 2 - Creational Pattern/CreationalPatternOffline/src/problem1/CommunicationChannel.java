package problem1;

public class CommunicationChannel implements Item{
    private final String commChannelName;
    private final double price;
    private double yearlyCost;

    public CommunicationChannel(String commChannelName, double price, double yearlyCost) {
        this.commChannelName = commChannelName;
        this.price = price;
        this.yearlyCost = yearlyCost;
    }

    @Override
    public String getDescription() {
        return commChannelName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public double getYearlyCost() {
        return yearlyCost;
    }
}
