public class Item {
    int itemCode;
    String itemName;
    double price;

    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }



    public double totalCost(int quantity) {
        return price * quantity;
    }

    public void displayDetails(int quantity) {
        System.out.println("Item Details:");
        System.out.println("Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total cost for quantity " + quantity + ": " + totalCost(quantity));
    }

    public static void main(String[] args) {
        Item item1 = new Item(101, "Notebook", 50.0);
        Item item2 = new Item(102, "Pen", 10.0);
        int quantity1 = 3;
        int quantity2 = 5;
        item1.displayDetails(quantity1);
        System.out.println();
        item2.displayDetails(quantity2);
    }
}
