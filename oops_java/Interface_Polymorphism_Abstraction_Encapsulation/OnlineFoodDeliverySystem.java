import java.util.*;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getItemDetails() {
        return itemName + " x" + quantity + " @ " + price;
    }

    public abstract double calculateTotalPrice();
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }

    public String getDiscountDetails() {
        return "10% discount on Veg Item";
    }
}

class NonVegItem extends FoodItem {
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity() + 30;
    }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(List<FoodItem> items) {
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            double total = item.calculateTotalPrice();
            if (item instanceof Discountable) {
                double discount = ((Discountable) item).applyDiscount();
                System.out.println(((Discountable) item).getDiscountDetails());
                total -= discount;
            }
            System.out.println("Total Price: " + total);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Roll", 120, 2));
        order.add(new NonVegItem("Chicken Biryani", 250, 1));
        processOrder(order);
    }
}
