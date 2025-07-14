package Food;
public class FoodItem {
    private String name;
    private String category;
    private double price;
    private boolean availability;
    private int stockLevel; // Encapsulation: Stock levels are private

    public FoodItem(String name, String category, double price, boolean availability, int stockLevel) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.availability = availability;
        this.stockLevel = stockLevel;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getStockLevel() {
        return stockLevel;
    }

   public void reduceStock(int quantity) {
    if (quantity <= stockLevel) {
        stockLevel -= quantity;
    } else {
        throw new IllegalArgumentException("Insufficient stock for " + name);
    }

    // Automatically mark the item as unavailable if stock is 0
    if (stockLevel == 0) {
        setAvailability(false);
    }
}
}