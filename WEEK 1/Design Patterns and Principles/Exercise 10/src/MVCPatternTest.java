public class MVCPatternTest {
    public static void main(String[] args) {
        // Create a model
        Student student = new Student("John Doe", 123, "A");

        // Create a view
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(student, view);

        // Display the current student details
        controller.updateView();

        // Update student details
        controller.setStudentName("Jane Smith");
        controller.setStudentId(456);
        controller.setStudentGrade("B");

        // Display the updated student details
        controller.updateView();
    }
}
