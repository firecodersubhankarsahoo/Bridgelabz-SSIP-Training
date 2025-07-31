// Smart Warehouse Management System
import java.util.*;

abstract class WarehouseItem {
    String name;
    public WarehouseItem(String name) { this.name = name; }
    public String getName() { return name; }
    public String toString() { return getClass().getSimpleName() + ": " + name; }
}

class Electronics extends WarehouseItem {
    public Electronics(String name) { super(name); }
}
class Groceries extends WarehouseItem {
    public Groceries(String name) { super(name); }
}
class Furniture extends WarehouseItem {
    public Furniture(String name) { super(name); }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();
    public void addItem(T item) { items.add(item); }
    public List<T> getItems() { return items; }
    public static void displayAll(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item);
        }
    }
}

public class SmartWarehouseDemo {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Smartphone"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Apple"));
        groceriesStorage.addItem(new Groceries("Milk"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));
        furnitureStorage.addItem(new Furniture("Table"));

        System.out.println("All Electronics:");
        Storage.displayAll(electronicsStorage.getItems());
        System.out.println("All Groceries:");
        Storage.displayAll(groceriesStorage.getItems());
        System.out.println("All Furniture:");
        Storage.displayAll(furnitureStorage.getItems());
    }
}

