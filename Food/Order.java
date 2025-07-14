package Food;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<FoodItem> foodItems;
    private double totalAmount;

    public Order() {
        this.foodItems = new ArrayList<>();
        this.totalAmount = 0.0;
    }

    public void addFoodItem(FoodItem item) {
    if (!item.isAvailable()) {
        System.out.println("Sorry, " + item.getName() + " is not available.");
        return;
    }

    if (item.getStockLevel() > 0) {
        foodItems.add(item);
        totalAmount += item.getPrice();
        item.reduceStock(1); // Reduce stock by 1
    } else {
        System.out.println("Sorry, " + item.getName() + " is out of stock.");
    }
}

    public void removeFoodItem(FoodItem item) {
        if (foodItems.remove(item)) {
            totalAmount -= item.getPrice();
        }
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public List<FoodItem> getFoodItems() {
        return foodItems;
    }

    // Polymorphism: applyDiscount behaves differently based on total amount
    public double applyDiscount() {
        if (totalAmount > 1000) {
            return totalAmount * 0.9; // 10% discount for orders above ₹1000
        } else if (totalAmount > 500) {
            return totalAmount * 0.95; // 5% discount for orders above ₹500
        }
        return totalAmount; // No discount
    }
}