import java.time.LocalDate;
import java.util.Date;

public class DeliveredOrder extends ShippedOrder {
	private LocalDate deliveryDate;

    public DeliveredOrder(String orderId, LocalDate orderDate, String trackingNumber, LocalDate deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Date: " + deliveryDate);
    }
    public static void main(String[] args) {
    	Order order = new Order("ORD101", LocalDate.of(2025, 6, 25));
        ShippedOrder shipped = new ShippedOrder("ORD102", LocalDate.of(2025, 6, 26), "TRK98765");
        DeliveredOrder delivered = new DeliveredOrder("ORD103", LocalDate.of(2025, 6, 27), "TRK12345", LocalDate.of(2025, 6, 30));

        System.out.println("--- Base Order ---");
        order.displayInfo();

        System.out.println("\n--- Shipped Order ---");
        shipped.displayInfo();

        System.out.println("\n--- Delivered Order ---");
        delivered.displayInfo();
	}
}