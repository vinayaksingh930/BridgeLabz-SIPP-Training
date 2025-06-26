class Product {
    private static double discount = 10.0;

    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product product1 = new Product(101, "Laptop", 50000, 2);
        Product product2 = new Product(102, "Phone", 20000, 5);

        product1.displayDetails();
        product2.displayDetails();

        Product.updateDiscount(15.0);
        product1.displayDetails();
    }
}