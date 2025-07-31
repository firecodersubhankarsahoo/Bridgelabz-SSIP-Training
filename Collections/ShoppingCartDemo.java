import java.util.*;

public class ShoppingCartDemo {
    // HashMap: Product -> Price
    private Map<String, Double> priceMap = new HashMap<>();
    // LinkedHashMap: maintains order of items added
    private Map<String, Double> orderedCart = new LinkedHashMap<>();
    // TreeMap: sorted by price
    private TreeMap<Double, List<String>> sortedCart = new TreeMap<>();

    // Add product to cart
    public void addProduct(String product, double price) {
        priceMap.put(product, price);
        orderedCart.put(product, price);
        sortedCart.computeIfAbsent(price, k -> new ArrayList<>()).add(product);
    }

    // Display items in order added
    public void displayOrderedCart() {
        System.out.println("Items in order added:");
        for (Map.Entry<String, Double> entry : orderedCart.entrySet()) {
            System.out.println(entry.getKey() + " - $" + entry.getValue());
        }
    }

    // Display items sorted by price
    public void displaySortedCart() {
        System.out.println("Items sorted by price:");
        for (Map.Entry<Double, List<String>> entry : sortedCart.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(product + " - $" + entry.getKey());
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCartDemo cart = new ShoppingCartDemo();
        cart.addProduct("Apple", 1.5);
        cart.addProduct("Banana", 1.2);
        cart.addProduct("Milk", 2.0);
        cart.addProduct("Bread", 1.2);
        cart.displayOrderedCart();
        cart.displaySortedCart();
    }
}

