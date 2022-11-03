package problem1;

import java.util.Scanner;

public class Main {
    private static final String BROADBAND  = "Broadband";
    private static final String MOBILE_DATA  = "MobileData";
    private static final int DELUXE = 1;
    private static final int OPTIMAL = 2;
    private static final int POOR = 3;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println("Select a package:" +
                    "\n1. Deluxe" +
                    "\n2. Optimal" +
                    "\n3. Poor");
            int cmd;
            cmd = input.nextInt();
            switch (cmd){
                case DELUXE: {
                    int numOfDisplay;
                    int commChannelSelector;
                    String commChannel = "";
                    System.out.println("Enter number of display:");
                    numOfDisplay = input.nextInt();
                    System.out.println("Select Communication Channel:" +
                            "\n1. Broadband" +
                            "\n2. Mobile Data");
                    commChannelSelector = input.nextInt();
                    switch (commChannelSelector){
                        case 1:{
                            commChannel = BROADBAND;
                            break;

                        }
                        case 2:{
                            commChannel = MOBILE_DATA;
                            break;

                        }
                    }
                    Director director = new Director();
                    iBuilder deluxeBuilder = new DeluxeBuilder(numOfDisplay, commChannel);
                    director.buildSetup(deluxeBuilder);
                    Product p1 = deluxeBuilder.getFinalProduct();
                    p1.showFinalProduct();
                    break;
                }
                case OPTIMAL: {
                    int numOfDisplay;
                    int commChannelSelector;
                    String commChannel = "";
                    System.out.println("Enter number of display:");
                    numOfDisplay = input.nextInt();
                    System.out.println("Select Communication Channel:" +
                            "\n1. Broadband" +
                            "\n2. Mobile Data");
                    commChannelSelector = input.nextInt();
                    switch (commChannelSelector){
                        case 1:{
                            commChannel = BROADBAND;
                            break;

                        }
                        case 2:{
                            commChannel = MOBILE_DATA;
                            break;

                        }
                    }
                    Director director = new Director();
                    iBuilder optimalBuilder = new OptimalBuilder(numOfDisplay, commChannel);
                    director.buildSetup(optimalBuilder);
                    Product p1 = optimalBuilder.getFinalProduct();
                    p1.showFinalProduct();
                    break;
                }
                case POOR: {
                    int numOfDisplay;
                    int commChannelSelector;
                    String commChannel = "";
                    System.out.println("Enter number of display:");
                    numOfDisplay = input.nextInt();
                    System.out.println("Select Communication Channel:" +
                            "\n1. Broadband" +
                            "\n2. Mobile Data");
                    commChannelSelector = input.nextInt();
                    switch (commChannelSelector){
                        case 1:{
                            commChannel = BROADBAND;
                            break;

                        }
                        case 2:{
                            commChannel = MOBILE_DATA;
                            break;

                        }
                    }
                    Director director = new Director();
                    iBuilder poorBuilder = new PoorBuilder(numOfDisplay, commChannel);
                    director.buildSetup(poorBuilder);
                    Product p1 = poorBuilder.getFinalProduct();
                    p1.showFinalProduct();
                    break;
                } default:{
                    System.out.println("Invalid Choice, try again");
                }
            }
        }


    }
}