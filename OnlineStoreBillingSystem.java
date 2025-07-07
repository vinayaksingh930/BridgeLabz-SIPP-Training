abstract class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    double getFinalPrice() {
        return price - calculateDiscount();
    }

    void printBill() {
        System.out.println("Product: " + name + ", Price: " + price + ", Discount: " + calculateDiscount() + ", Final Price: " + getFinalPrice());
    }
}

class Electronics extends Product {
    Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return price * 0.20;
    }
}

class Grocery extends Product {
    Grocery(String name, double price) {
        super(name, price);
    }

    @Override
    double calculateDiscount() {
        return 0.0;
    }
}

public class OnlineStoreBillingSystem {
    public static void main(String[] args) {
        Product electronics = new Electronics("Laptop", 50000);
        Product clothing = new Clothing("T-Shirt", 1000);
        Product grocery = new Grocery("Rice", 500);

        electronics.printBill();
        clothing.printBill();
        grocery.printBill();
    }
}
