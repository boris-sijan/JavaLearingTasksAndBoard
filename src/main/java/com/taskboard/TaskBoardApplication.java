package com.taskboard;

import java.util.List;

/**
 * Simple demonstration of the Task Management system for Phase 1.
 * This class shows how to use the TaskManager and TaskApi classes.
 */
public class TaskBoardApplication {

    public static void main(String[] args) {
        System.out.println("=== Task Board Application - Phase 1 Demo ===\n");

        // Initialize the system
        TaskManager taskManager = new TaskManager();
        TaskApi taskApi = new TaskApi(taskManager);

        try {
            // Demonstrate task creation
            System.out.println("1. Creating tasks...");
            TaskApi.CreateTaskRequest request1 = new TaskApi.CreateTaskRequest(
                "Learn Java Basics", 
                "Study variables, methods, and classes"
            );
            Task task1 = taskApi.createTask(request1);
            System.out.println("Created: " + task1);

            TaskApi.CreateTaskRequest request2 = new TaskApi.CreateTaskRequest(
                "Write Unit Tests", 
                "Create comprehensive tests for Task class"
            );
            Task task2 = taskApi.createTask(request2);
            System.out.println("Created: " + task2);

            TaskApi.CreateTaskRequest request3 = new TaskApi.CreateTaskRequest(
                "Review Documentation", 
                "Read through the project README"
            );
            Task task3 = taskApi.createTask(request3);
            System.out.println("Created: " + task3);
            System.out.println();

            // Demonstrate listing all tasks
            System.out.println("2. All tasks:");
            List<Task> allTasks = taskApi.getAllTasks();
            allTasks.forEach(System.out::println);
            System.out.println();

            // Demonstrate task completion
            System.out.println("3. Completing a task...");
            Task completed = taskApi.completeTask(task1.getId());
            System.out.println("Completed: " + completed);
            System.out.println();

            // Demonstrate task updates
            System.out.println("4. Updating a task...");
            TaskApi.UpdateTaskRequest updateRequest = new TaskApi.UpdateTaskRequest(
                "Write Comprehensive Unit Tests", 
                "Create tests for Task, TaskManager, and TaskApi classes", 
                true
            );
            Task updated = taskApi.updateTask(task2.getId(), updateRequest);
            System.out.println("Updated: " + updated);
            System.out.println();

            // Demonstrate filtering
            System.out.println("5. Completed tasks:");
            List<Task> completedTasks = taskApi.getCompletedTasks();
            completedTasks.forEach(System.out::println);
            System.out.println();

            System.out.println("6. Pending tasks:");
            List<Task> pendingTasks = taskApi.getPendingTasks();
            pendingTasks.forEach(System.out::println);
            System.out.println();

            // Demonstrate individual task retrieval
            System.out.println("7. Getting specific task by ID:");
            Task specificTask = taskApi.getTaskById(task3.getId());
            System.out.println("Retrieved: " + specificTask);
            System.out.println();

            // Demonstrate task deletion
            System.out.println("8. Deleting a task...");
            taskApi.deleteTask(task3.getId());
            System.out.println("Deleted task with ID: " + task3.getId());
            
            System.out.println("Remaining tasks:");
            taskApi.getAllTasks().forEach(System.out::println);
            System.out.println();

            // Show summary statistics
            System.out.println("9. Summary Statistics:");
            System.out.println("Total tasks: " + taskManager.getTaskCount());
            System.out.println("Completed tasks: " + taskManager.getCompletedTaskCount());
            System.out.println("Pending tasks: " + (taskManager.getTaskCount() - taskManager.getCompletedTaskCount()));

        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n=== Demo completed successfully! ===");
    }

    /**
     * Demonstrates error handling scenarios
     */
    public static void demonstrateErrorHandling() {
        System.out.println("\n=== Error Handling Demo ===");
        
        TaskManager taskManager = new TaskManager();
        TaskApi taskApi = new TaskApi(taskManager);

        // Test 1: Invalid task creation
        try {
            TaskApi.CreateTaskRequest invalidRequest = new TaskApi.CreateTaskRequest(null, "Description");
            taskApi.createTask(invalidRequest);
        } catch (IllegalArgumentException e) {
            System.out.println("✓ Caught expected error for null title: " + e.getMessage());
        }

        // Test 2: Task not found
        try {
            taskApi.getTaskById(999);
        } catch (TaskNotFoundException e) {
            System.out.println("✓ Caught expected error for non-existent task: " + e.getMessage());
        }

        // Test 3: Delete non-existent task
        try {
            taskApi.deleteTask(999);
        } catch (TaskNotFoundException e) {
            System.out.println("✓ Caught expected error for deleting non-existent task: " + e.getMessage());
        }

        System.out.println("Error handling demo completed!\n");
    }
}