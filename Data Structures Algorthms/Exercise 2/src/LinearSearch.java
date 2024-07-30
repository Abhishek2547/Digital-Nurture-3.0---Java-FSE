public class LinearSearch {
    public static int linearSearch(Product[] products, String productName) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equals(productName)) {
                return i; // Found
            }
        }
        return -1; // Not found
    }
}
