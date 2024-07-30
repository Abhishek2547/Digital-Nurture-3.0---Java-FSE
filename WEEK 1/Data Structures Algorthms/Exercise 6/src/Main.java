public class Main {
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();

        // Add books
        library.addBook(new Book(1, "The Catcher in the Rye", "J.D. Salinger"));
        library.addBook(new Book(2, "To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book(3, "1984", "George Orwell"));

        // Display all books
        System.out.println("All Books:");
        library.displayBooks();

        // Sort books by title for binary search
        library.sortBooksByTitle();

        // Linear search
        System.out.println("\nLinear Search for '1984':");
        Book book = library.linearSearchByTitle("1984");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }

        // Binary search
        System.out.println("\nBinary Search for '1984':");
        book = library.binarySearchByTitle("1984");
        if (book != null) {
            System.out.println(book);
        } else {
            System.out.println("Book not found.");
        }
    }
}
