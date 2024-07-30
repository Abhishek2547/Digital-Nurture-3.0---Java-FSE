public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        // Add employees
        ems.addEmployee(new Employee(1, "John Doe", "Developer", 60000));
        ems.addEmployee(new Employee(2, "Jane Smith", "Manager", 75000));
        ems.addEmployee(new Employee(3, "Alice Johnson", "Analyst", 55000));

        // Display all employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Search for an employee
        System.out.println("\nSearching for Employee ID 2:");
        Employee employee = ems.searchEmployee(2);
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("Employee not found.");
        }

        // Delete an employee
        System.out.println("\nDeleting Employee ID 1:");
        ems.deleteEmployee(1);

        // Display all employees after deletion
        System.out.println("\nAll Employees After Deletion:");
        ems.traverseEmployees();
    }
}
