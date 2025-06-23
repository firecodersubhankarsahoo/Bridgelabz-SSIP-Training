import java.util.*;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> cart = new ArrayList<>();

    void addItem(String name, double price, int quantity) {
        cart.add(new CartItem(name, price, quantity));
    }

    void removeItem(String name) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).itemName.equalsIgnoreCase(name)) {
                cart.remove(i);
                return;
            }
        }
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : cart) {
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: ₹" + total);
    }

    void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        for (CartItem item : cart) {
            System.out.println(item.itemName + " | price" + item.price + " x " + item.quantity + " = price" + item.getTotalPrice());
        }
    }
}

public class simulateShoppingCart {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. Display Cart\n4. Display Total Cost\n5. Exit");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter item name: ");
                String name = sc.nextLine();
                System.out.print("Enter price: ");
                double price = sc.nextDouble();
                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();
                cart.addItem(name, price, quantity);
            } else if (choice == 2) {
                System.out.print("Enter item name to remove: ");
                String name = sc.nextLine();
                cart.removeItem(name);
            } else if (choice == 3) {
                cart.displayCart();
            } else if (choice == 4) {
                cart.displayTotalCost();
            } else if (choice == 5) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
