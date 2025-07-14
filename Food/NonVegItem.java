package Food;
public class NonVegItem extends FoodItem {
    public NonVegItem(String name, double price, boolean availability, int stockLevel) {
        super(name, "Non-Veg", price, availability, stockLevel);
    }
}