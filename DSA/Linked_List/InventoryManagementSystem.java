class Item {
    String name;
    int id, quantity;
    double price;
    Item next;

    public Item(String name, int id, int quantity, double price) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }
}

class Inventory {
    Item head = null;

    void addEnd(String name, int id, int quantity, double price) {
        Item item = new Item(name, id, quantity, price);
        if (head == null) {
            head = item;
        } else {
            Item temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = item;
        }
    }

    void displayItems() {
        Item temp = head;
        while (temp != null) {
            System.out.println(temp.name + " " + temp.id + " " + temp.quantity + " " + temp.price);
            temp = temp.next;
        }
    }

    void totalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }
}

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inv = new Inventory();
        inv.addEnd("Pen", 101, 100, 5.0);
        inv.addEnd("Notebook", 102, 50, 20.0);
        inv.displayItems();
        inv.totalValue();
    }
}
