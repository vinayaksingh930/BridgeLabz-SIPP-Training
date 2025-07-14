package Food;
public class OrderService implements IOrderable {
    @Override
    public void placeOrder(Order order) {
        System.out.println("Order placed successfully!");
        System.out.println("Total Amount (after discount): ₹" + order.applyDiscount());
    }

    @Override
    public void cancelOrder(Order order) {
        System.out.println("Order canceled successfully!");
    }
}