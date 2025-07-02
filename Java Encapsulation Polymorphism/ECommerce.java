abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }

    public abstract double calculateDiscount();
}

class Electronics extends Product {
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.1;
    }
}

class Clothing extends Product {
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.2;
    }
}


public class ECommerce{
    public static void main(String[] args) {
        Product p1 = new Electronics(1, "Laptop", 1000);
        Product p2 = new Clothing(2, "Shirt", 50);

        System.out.println("Final Price: " + (p1.getPrice() - p1.calculateDiscount()));
        System.out.println("Final Price: " + (p2.getPrice() - p2.calculateDiscount()));
    }
}