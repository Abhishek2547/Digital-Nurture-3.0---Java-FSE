import java.util.Arrays;

public class SearchTest {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "Product A", "Category 1"),
            new Product(2, "Product B", "Category 2"),
            // ... more products
        };
        

        // Sort the products for binary search
        Arrays.sort(products, (p1, p2) -> p1.productName.compareTo(p2.productName));

        String productNameToSearch = "Product B";

        // Linear search
        int index = LinearSearch.linearSearch(products, productNameToSearch);
        if (index != -1) {
            System.out.println("Product found at index: " + index);
        } else {
            System.out.println("Product not found");
        }

        // Binary search
        index = BinarySearch.binarySearch(products, productNameToSearch);
        if (index != -1) {
            System.out.println("Product found at index: " + index);
        } else {
            System.out.println("Product not found");
        }
    }
}
