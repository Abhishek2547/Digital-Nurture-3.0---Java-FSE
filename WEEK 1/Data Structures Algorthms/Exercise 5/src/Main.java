public class Main {
    public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        // Add tasks
        taskList.addTask(new Task(1, "Design Database Schema", "Pending"));
        taskList.addTask(new Task(2, "Implement API", "In Progress"));
        taskList.addTask(new Task(3, "Write Documentation", "Completed"));

        // Display all tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Search for a task
        System.out.println("\nSearching for Task ID 2:");
        Task task = taskList.searchTask(2);
        if (task != null) {
            System.out.println(task);
        } else {
            System.out.println("Task not found.");
        }

        // Delete a task
        System.out.println("\nDeleting Task ID 1:");
        taskList.deleteTask(1);

        // Display all tasks after deletion
        System.out.println("\nAll Tasks After Deletion:");
        taskList.traverseTasks();
    }
}
