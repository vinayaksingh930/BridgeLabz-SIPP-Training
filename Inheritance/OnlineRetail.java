class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}
public class OnlineRetail {
    public static void main(String[] args) {
        Order order1 = new Order(101, "2023-10-01");
        ShippedOrder order2 = new ShippedOrder(102, "2023-10-02", "TRK12345");
        DeliveredOrder order3 = new DeliveredOrder(103, "2023-10-03", "TRK67890", "2023-10-05");

        System.out.println("Order 1 Status: " + order1.getOrderStatus()); // Output: Order Placed
        System.out.println("Order 2 Status: " + order2.getOrderStatus()); // Output: Order Shipped
        System.out.println("Order 3 Status: " + order3.getOrderStatus()); // Output: Order Delivered
    }
}