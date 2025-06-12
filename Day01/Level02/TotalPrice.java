

public class TotalPrice {
         java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.printf("The total purchase price is INR %.2f if the quantity %d and unit price is INR %.2f\n",
                totalPrice, quantity, unitPrice);
}
    public static void main(String[] args) {
        TotalPrice totalPrice = new TotalPrice();
    }
