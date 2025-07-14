package Food;
import java.util.Scanner;

public class FoodLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create food items
        VegItem vegBurger = new VegItem("Veg Burger", 120.0, true, 10);
        NonVegItem chickenBurger = new NonVegItem("Chicken Burger", 150.0, true, 5);
        VegItem fries = new VegItem("Fries", 80.0, true, 20);
        NonVegItem fishFry = new NonVegItem("Fish Fry", 200.0, true, 8);

        // Display menu
        System.out.println("Welcome to FoodLoop! Here's the menu:");
        System.out.println("1. Veg Burger - ₹120 (Stock: " + vegBurger.getStockLevel() + ")");
        System.out.println("2. Chicken Burger - ₹150 (Stock: " + chickenBurger.getStockLevel() + ")");
        System.out.println("3. Fries - ₹80 (Stock: " + fries.getStockLevel() + ")");
        System.out.println("4. Fish Fry - ₹200 (Stock: " + fishFry.getStockLevel() + ")");

        // Create an order
        Order order = new Order();

        while (true) {
            System.out.println("\nEnter the item number to add to your order (or 0 to finish):");
            try {
                int choice = scanner.nextInt();

                if (choice == 0) {
                    break; // Exit the loop when the user is done ordering
                }

                switch (choice) {
                    case 1:
                        if (vegBurger.getStockLevel() > 0) {
                            order.addFoodItem(vegBurger);
                            System.out.println("Added Veg Burger to your order.");
                            System.out.println("Remaining stock of Veg Burger: " + vegBurger.getStockLevel());
                        } else {
                            System.out.println("Sorry, Veg Burger is out of stock.");
                        }
                        break;
                    case 2:
                        if (chickenBurger.getStockLevel() > 0) {
                            order.addFoodItem(chickenBurger);
                            System.out.println("Added Chicken Burger to your order.");
                            System.out.println("Remaining stock of Chicken Burger: " + chickenBurger.getStockLevel());
                        } else {
                            System.out.println("Sorry, Chicken Burger is out of stock.");
                        }
                        break;
                    case 3:
                        if (fries.getStockLevel() > 0) {
                            order.addFoodItem(fries);
                            System.out.println("Added Fries to your order.");
                            System.out.println("Remaining stock of Fries: " + fries.getStockLevel());
                        } else {
                            System.out.println("Sorry, Fries are out of stock.");
                        }
                        break;
                    case 4:
                        if (fishFry.getStockLevel() > 0) {
                            order.addFoodItem(fishFry);
                            System.out.println("Added Fish Fry to your order.");
                            System.out.println("Remaining stock of Fish Fry: " + fishFry.getStockLevel());
                        } else {
                            System.out.println("Sorry, Fish Fry is out of stock.");
                        }
                        break;
                    default:
                        System.out.println("Invalid choice. Please select a valid item.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }

        // Display total amount before discount
        System.out.println("\nTotal Amount (before discount): ₹" + order.getTotalAmount());

        // Place the order
        OrderService orderService = new OrderService();

        System.out.println("\nDo you want to cancel the order? (yes/no):");
        String cancelChoice = scanner.next();
        if (cancelChoice.equalsIgnoreCase("yes")) {
            orderService.cancelOrder(order);
        } else {
            orderService.placeOrder(order);
        }

        scanner.close();
    }
}