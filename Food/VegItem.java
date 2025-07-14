package Food;
public class VegItem extends FoodItem {
    public VegItem(String name, double price, boolean availability, int stockLevel) {
        super(name, "Veg", price, availability, stockLevel);
    }
}