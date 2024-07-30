public class Main {
    public static void main(String[] args) {
        Order[] orders = {
            new Order(1, "Alice", 250.0),
            new Order(2, "Bob", 150.0),
            new Order(3, "Charlie", 300.0),
            new Order(4, "Diana", 200.0)
        };

        // Bubble Sort
        System.out.println("Bubble Sort:");
        SortingAlgorithms.bubbleSort(orders);
        for (Order order : orders) {
            System.out.println(order);
        }

        // Quick Sort
        System.out.println("\nQuick Sort:");
        Order[] ordersForQuickSort = {
            new Order(1, "Alice", 250.0),
            new Order(2, "Bob", 150.0),
            new Order(3, "Charlie", 300.0),
            new Order(4, "Diana", 200.0)
        };
        SortingAlgorithms.quickSort(ordersForQuickSort, 0, ordersForQuickSort.length - 1);
        for (Order order : ordersForQuickSort) {
            System.out.println(order);
        }
    }
}
