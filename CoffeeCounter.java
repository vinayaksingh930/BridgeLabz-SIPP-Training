import java.util.Scanner;

public class CoffeeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	double price1=0;
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Cappuccino - Rs. 80");
            System.out.println("2. Black Coffee - Rs. 60");
            System.out.println("3. Exit");
            int option = sc.nextInt();

            if (option == 3) break;

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            double price = 0;
            switch (option) {
                case 1: price = 80; break;
                case 2: price = 60; break;
                default: System.out.println("Invalid option."); continue;
            }

            double total = price * quantity;
            double gst = total * 0.05;
            double finalAmount = total + gst;
	    price1+=finalAmount;

            System.out.println("Total bill with GST: Rs. " + finalAmount);
	    System.out.println("Grand bill with GST: Rs. " + price1);
        }
    }
}
