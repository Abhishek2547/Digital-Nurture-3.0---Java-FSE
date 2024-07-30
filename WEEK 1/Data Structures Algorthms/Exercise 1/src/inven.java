// Example using Java and HashMap
import java.util.HashMap;

class Product {
    int productId;
    String productName;
    int quantity;
    double price;

    // Constructor, getters, and setters
}
public class inven {

    public static void main(String[] args) {
      System.out.println("Hello, Inventory Management System!");
    }
  }
  

class InventoryManagementSystem {
    HashMap<Integer, Product> products = new HashMap<>();

    void addProduct(Product product) {
        products.put(product.productId, product);
    }

    void updateProduct(Product product) {
        products.put(product.productId, product);
    }

    void deleteProduct(int productId) {
        products.remove(productId);
    }

    // Other methods for searching, displaying inventory, etc.
}
