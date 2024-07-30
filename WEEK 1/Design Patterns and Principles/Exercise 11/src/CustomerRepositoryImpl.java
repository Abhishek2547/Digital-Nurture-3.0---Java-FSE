public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(int id) {
        // For demonstration purposes, return a dummy customer
        return new Customer(id, "John Doe", "john.doe@example.com");
    }
}
