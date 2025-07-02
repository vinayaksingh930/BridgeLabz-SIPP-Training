abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
    }
}

class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 10; // Additional charge for non-veg items
    }
}


public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem item1 = new VegItem("Salad", 5, 2);
        FoodItem item2 = new NonVegItem("Chicken", 10, 3);

        item1.getItemDetails();
        System.out.println("Total Price: " + item1.calculateTotalPrice());

        item2.getItemDetails();
        System.out.println("Total Price: " + item2.calculateTotalPrice());
    }
}