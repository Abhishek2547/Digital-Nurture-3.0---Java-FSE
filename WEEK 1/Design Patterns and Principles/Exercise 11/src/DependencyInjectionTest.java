public class DependencyInjectionTest {
    public static void main(String[] args) {
        // Create the repository and inject it into the service
        CustomerRepository repository = new CustomerRepositoryImpl();
        CustomerService service = new CustomerService(repository);

        // Use the service to find a customer
        Customer customer = service.getCustomer(1);
        System.out.println(customer);
    }
}
