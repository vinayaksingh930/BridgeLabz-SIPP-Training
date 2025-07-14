package Food;
public interface IOrderable {
    void placeOrder(Order order);
    void cancelOrder(Order order);
}