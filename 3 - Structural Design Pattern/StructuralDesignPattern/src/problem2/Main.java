package problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AbstractFactory burgerFactory = FactoryProducer.getFactory("Burger");
        AbstractFactory appetizerFactory = FactoryProducer.getFactory("Appetizer");
        AbstractFactory drinkFactory = FactoryProducer.getFactory("Drink");

        while (true) {
            System.out.println("=========FOOD MENU============" +
                    "\n1. Beef burger with French fry and cheese" +
                    "\n2. Veggi Pizza with onion rings and Bottle of Water" +
                    "\n3. A combo meal with Veggi burger, French Fry and Coke" +
                    "\n4. A combo meal with Veggi burger, Onion Rings, Coffee and Water" +
                    "\n5. A Beef burger only" +
                    "\n Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    FoodItem beefBurger = burgerFactory.getBasicItem("Beef");

                    FoodItem addOn1 = appetizerFactory.getAppetizer(beefBurger, "FrenchFries");
                    FoodItem finalFood = new Cheese(addOn1);
                    System.out.println(finalFood.prepareFood());
                    System.out.println("Price: $" + finalFood.price());
                    break;

                }
                case 2: {
                    FoodItem veggiBurger = burgerFactory.getBasicItem("Veggi");
                    FoodItem finalFood = appetizerFactory.getAppetizer(veggiBurger, "OnionRings");

                    System.out.println("How many bottles of water do you need?");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        FoodItem drink = drinkFactory.getDrink(finalFood, "Water");
                        finalFood = drink;
                    }

                    System.out.println(finalFood.prepareFood());
                    System.out.println("Price: $" + finalFood.price());
                    break;
                }
                case 3: {
                    FoodItem veggiBurger = burgerFactory.getBasicItem("Veggi");
                    FoodItem finalFood = appetizerFactory.getAppetizer(veggiBurger, "FrenchFries");

                    System.out.println("How many bottles of coke do you need?");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        FoodItem drink = drinkFactory.getDrink(finalFood, "Coke");
                        finalFood = drink;
                    }

                    System.out.println(finalFood.prepareFood());
                    System.out.println("Price: $" + finalFood.price());
                    break;
                }
                case 4: {
                    FoodItem veggiBurger = burgerFactory.getBasicItem("Veggi");
                    FoodItem finalFood = appetizerFactory.getAppetizer(veggiBurger, "OnionRings");

                    System.out.println("How many bottles of water do you need?");
                    int n = scanner.nextInt();
                    for (int i = 0; i < n; i++) {
                        FoodItem drink = drinkFactory.getDrink(finalFood, "Water");
                        finalFood = drink;
                    }
                    System.out.println("How many cups of coffee do you need?");

                    int n2 = scanner.nextInt();
                    for (int i = 0; i < n2; i++) {
                        FoodItem drink = drinkFactory.getDrink(finalFood, "Coffee");
                        finalFood = drink;
                    }

                    System.out.println(finalFood.prepareFood());
                    System.out.println("Price: $" + finalFood.price());
                    break;
                }
                case 5: {
                    FoodItem finalFood = burgerFactory.getBasicItem("Beef");

                    System.out.println(finalFood.prepareFood());
                    System.out.println("Price: $" + finalFood.price());

                    break;
                }
            }

        }

    }
}