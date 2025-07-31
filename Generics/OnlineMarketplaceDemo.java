// Dynamic Online Marketplace
import java.util.*;

interface Category {
    String getCategoryName();
}
class BookCategory implements Category {
    public String getCategoryName() { return "Book"; }
}
class ClothingCategory implements Category {
    public String getCategoryName() { return "Clothing"; }
}
class GadgetCategory implements Category {
    public String getCategoryName() { return "Gadget"; }
}

class Product<T extends Category> {
    String name;
    double price;
    T category;
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String toString() {
        return name + " (" + category.getCategoryName() + ") - $" + price;
    }
}

class ProductCatalog {
    private List<Product<? extends Category>> products = new ArrayList<>();
    public void addProduct(Product<? extends Category> product) {
        products.add(product);
    }
    public <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.price -= product.price * (percentage / 100);
    }
    public void showCatalog() {
        for (Product<? extends Category> p : products) {
            System.out.println(p);
        }
    }
}

public class OnlineMarketplaceDemo {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog();
        Product<BookCategory> book = new Product<>("Java Basics", 500, new BookCategory());
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 300, new ClothingCategory());
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15000, new GadgetCategory());
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);
        catalog.applyDiscount(book, 10);
        catalog.applyDiscount(phone, 5);
        catalog.showCatalog();
    }
}

