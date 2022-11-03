package problem1;

import java.util.LinkedList;

public class Product {
    private final LinkedList<Item> parts;

    public Product() {
        this.parts = new LinkedList<>();
    }

    public void addPart(Item partItem) {
        parts.addLast(partItem);
    }

    public void showFinalProduct() {
        System.out.println("Your package details" +
                "\n==============================================");
        double totalPrice = 0;
        int i = 1;
        // iterate and show
        for (Item part : parts) {
            System.out.println(i + ". " + part.getDescription() + " -> price: $" + part.getPrice());
            totalPrice += part.getPrice();
            i++;

            if (part instanceof CommunicationChannel){
                System.out.println("yearly communication cost: $" + ((CommunicationChannel) part).getYearlyCost());
                totalPrice += ((CommunicationChannel) part).getYearlyCost();
            }
        }
        System.out.println("Total cost: $" + totalPrice);

    }


}
