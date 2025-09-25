package com.taskboard;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;

/**
 * Comprehensive unit tests for the TaskManager class.
 * Tests all CRUD operations and business logic for Phase 1.
 */
class TaskManagerTest {

    private TaskManager taskManager;

    @BeforeEach
    void setUp() {
        taskManager = new TaskManager();
    }

    @Test
    @DisplayName("New TaskManager is empty")
    void testNewTaskManagerIsEmpty() {
        assertTrue(taskManager.isEmpty());
        assertEquals(0, taskManager.getTaskCount());
        assertTrue(taskManager.getAllTasks().isEmpty());
    }

    @Test
    @DisplayName("Create task assigns incremental ID")
    void testCreateTaskAssignsId() {
        Task task1 = taskManager.createTask("First Task", "Description 1");
        Task task2 = taskManager.createTask("Second Task", "Description 2");
        
        assertEquals(1, task1.getId());
        assertEquals(2, task2.getId());
    }

    @Test
    @DisplayName("Create task with valid data succeeds")
    void testCreateTaskSuccess() {
        Task task = taskManager.createTask("Test Task", "Test Description");
        
        assertNotNull(task);
        assertEquals(1, task.getId());
        assertEquals("Test Task", task.getTitle());
        assertEquals("Test Description", task.getDescription());
        assertFalse(task.isCompleted());
    }

    @Test
    @DisplayName("Create task with completion status")
    void testCreateTaskWithCompletionStatus() {
        Task task = taskManager.createTask("Completed Task", "Done", true);
        
        assertEquals("Completed Task", task.getTitle());
        assertEquals("Done", task.getDescription());
        assertTrue(task.isCompleted());
    }

    @Test
    @DisplayName("Create task with invalid title throws exception")
    void testCreateTaskWithInvalidTitle() {
        assertThrows(IllegalArgumentException.class, 
                    () -> taskManager.createTask(null, "Description"));
        assertThrows(IllegalArgumentException.class, 
                    () -> taskManager.createTask("", "Description"));
    }

    @Test
    @DisplayName("Get all tasks returns defensive copy")
    void testGetAllTasksReturnsDefensiveCopy() {
        taskManager.createTask("Task 1", "Description 1");
        taskManager.createTask("Task 2", "Description 2");
        
        List<Task> tasks1 = taskManager.getAllTasks();
        List<Task> tasks2 = taskManager.getAllTasks();
        
        assertNotSame(tasks1, tasks2); // Different list instances
        assertEquals(tasks1, tasks2);  // But same content
        assertEquals(2, tasks1.size());
    }

    @Test
    @DisplayName("Get task by ID returns correct task")
    void testGetTaskByIdSuccess() {
        Task created = taskManager.createTask("Find Me", "Description");
        
        Optional<Task> found = taskManager.getTaskById(created.getId());
        
        assertTrue(found.isPresent());
        assertEquals(created, found.get());
    }

    @Test
    @DisplayName("Get task by non-existent ID returns empty")
    void testGetTaskByIdNotFound() {
        Optional<Task> found = taskManager.getTaskById(999);
        assertFalse(found.isPresent());
    }

    @Test
    @DisplayName("Get task by ID or throw returns task when found")
    void testGetTaskByIdOrThrowSuccess() {
        Task created = taskManager.createTask("Find Me", "Description");
        Task found = taskManager.getTaskByIdOrThrow(created.getId());
        assertEquals(created, found);
    }

    @Test
    @DisplayName("Get task by ID or throw throws exception when not found")
    void testGetTaskByIdOrThrowNotFound() {
        TaskNotFoundException exception = assertThrows(
            TaskNotFoundException.class,
            () -> taskManager.getTaskByIdOrThrow(999)
        );
        assertEquals(999, exception.getTaskId());
        assertTrue(exception.getMessage().contains("999"));
    }

    @Test
    @DisplayName("Update task modifies existing task")
    void testUpdateTaskSuccess() {
        Task created = taskManager.createTask("Original", "Original Description");
        int taskId = created.getId();
        
        Task updated = taskManager.updateTask(taskId, "Updated", "Updated Description", true);
        
        assertEquals(taskId, updated.getId());
        assertEquals("Updated", updated.getTitle());
        assertEquals("Updated Description", updated.getDescription());
        assertTrue(updated.isCompleted());
        
        // Verify it's the same object
        assertSame(created, updated);
    }

    @Test
    @DisplayName("Update non-existent task throws exception")
    void testUpdateTaskNotFound() {
        assertThrows(TaskNotFoundException.class,
                    () -> taskManager.updateTask(999, "Title", "Description", false));
    }

    @Test
    @DisplayName("Update task with invalid title throws exception")
    void testUpdateTaskWithInvalidTitle() {
        Task created = taskManager.createTask("Original", "Description");
        
        assertThrows(IllegalArgumentException.class,
                    () -> taskManager.updateTask(created.getId(), null, "Description", false));
    }

    @Test
    @DisplayName("Update task completion only")
    void testUpdateTaskCompletion() {
        Task created = taskManager.createTask("Task", "Description");
        assertFalse(created.isCompleted());
        
        Task updated = taskManager.updateTaskCompletion(created.getId(), true);
        
        assertTrue(updated.isCompleted());
        assertEquals("Task", updated.getTitle()); // Other fields unchanged
        assertSame(created, updated);
    }

    @Test
    @DisplayName("Mark task completed")
    void testMarkTaskCompleted() {
        Task created = taskManager.createTask("Task", "Description");
        assertFalse(created.isCompleted());
        
        Task updated = taskManager.markTaskCompleted(created.getId());
        
        assertTrue(updated.isCompleted());
        assertSame(created, updated);
    }

    @Test
    @DisplayName("Delete existing task returns true")
    void testDeleteTaskSuccess() {
        Task created = taskManager.createTask("To Delete", "Description");
        int taskId = created.getId();
        
        boolean deleted = taskManager.deleteTask(taskId);
        
        assertTrue(deleted);
        assertEquals(0, taskManager.getTaskCount());
        assertFalse(taskManager.getTaskById(taskId).isPresent());
    }

    @Test
    @DisplayName("Delete non-existent task returns false")
    void testDeleteTaskNotFound() {
        boolean deleted = taskManager.deleteTask(999);
        assertFalse(deleted);
    }

    @Test
    @DisplayName("Delete task or throw removes existing task")
    void testDeleteTaskOrThrowSuccess() {
        Task created = taskManager.createTask("To Delete", "Description");
        int taskId = created.getId();
        
        assertDoesNotThrow(() -> taskManager.deleteTaskOrThrow(taskId));
        assertEquals(0, taskManager.getTaskCount());
    }

    @Test
    @DisplayName("Delete task or throw throws exception for non-existent task")
    void testDeleteTaskOrThrowNotFound() {
        assertThrows(TaskNotFoundException.class,
                    () -> taskManager.deleteTaskOrThrow(999));
    }

    @Test
    @DisplayName("Task count reflects number of tasks")
    void testTaskCount() {
        assertEquals(0, taskManager.getTaskCount());
        
        taskManager.createTask("Task 1", "Description");
        assertEquals(1, taskManager.getTaskCount());
        
        taskManager.createTask("Task 2", "Description");
        assertEquals(2, taskManager.getTaskCount());
        
        taskManager.deleteTask(1);
        assertEquals(1, taskManager.getTaskCount());
    }

    @Test
    @DisplayName("Completed task count reflects completed tasks only")
    void testCompletedTaskCount() {
        taskManager.createTask("Task 1", "Description", false);
        taskManager.createTask("Task 2", "Description", true);
        taskManager.createTask("Task 3", "Description", true);
        
        assertEquals(2, taskManager.getCompletedTaskCount());
    }

    @Test
    @DisplayName("Get completed tasks returns only completed tasks")
    void testGetCompletedTasks() {
        Task pending = taskManager.createTask("Pending", "Description", false);
        Task completed1 = taskManager.createTask("Completed 1", "Description", true);
        Task completed2 = taskManager.createTask("Completed 2", "Description", true);
        
        List<Task> completedTasks = taskManager.getCompletedTasks();
        
        assertEquals(2, completedTasks.size());
        assertTrue(completedTasks.contains(completed1));
        assertTrue(completedTasks.contains(completed2));
        assertFalse(completedTasks.contains(pending));
    }

    @Test
    @DisplayName("Get pending tasks returns only non-completed tasks")
    void testGetPendingTasks() {
        Task pending1 = taskManager.createTask("Pending 1", "Description", false);
        Task pending2 = taskManager.createTask("Pending 2", "Description", false);
        Task completed = taskManager.createTask("Completed", "Description", true);
        
        List<Task> pendingTasks = taskManager.getPendingTasks();
        
        assertEquals(2, pendingTasks.size());
        assertTrue(pendingTasks.contains(pending1));
        assertTrue(pendingTasks.contains(pending2));
        assertFalse(pendingTasks.contains(completed));
    }

    @Test
    @DisplayName("Clear all tasks removes all tasks and resets ID counter")
    void testClearAllTasks() {
        taskManager.createTask("Task 1", "Description");
        taskManager.createTask("Task 2", "Description");
        assertEquals(2, taskManager.getTaskCount());
        
        taskManager.clearAllTasks();
        
        assertEquals(0, taskManager.getTaskCount());
        assertTrue(taskManager.isEmpty());
        
        // Verify ID counter is reset
        Task newTask = taskManager.createTask("New Task", "Description");
        assertEquals(1, newTask.getId());
    }

    @Test
    @DisplayName("Is empty correctly identifies empty state")
    void testIsEmpty() {
        assertTrue(taskManager.isEmpty());
        
        taskManager.createTask("Task", "Description");
        assertFalse(taskManager.isEmpty());
        
        taskManager.clearAllTasks();
        assertTrue(taskManager.isEmpty());
    }

    @Test
    @DisplayName("Multiple operations maintain data integrity")
    void testDataIntegrityWithMultipleOperations() {
        // Create several tasks
        Task task1 = taskManager.createTask("Task 1", "Description 1");
        Task task2 = taskManager.createTask("Task 2", "Description 2");
        Task task3 = taskManager.createTask("Task 3", "Description 3", true);
        
        // Update one task
        taskManager.updateTask(task2.getId(), "Updated Task 2", "Updated Description", true);
        
        // Delete one task
        taskManager.deleteTask(task1.getId());
        
        // Verify final state
        assertEquals(2, taskManager.getTaskCount());
        assertEquals(2, taskManager.getCompletedTaskCount());
        
        List<Task> allTasks = taskManager.getAllTasks();
        assertEquals(2, allTasks.size());
        
        // Verify specific tasks
        Task retrievedTask2 = taskManager.getTaskByIdOrThrow(task2.getId());
        assertEquals("Updated Task 2", retrievedTask2.getTitle());
        assertTrue(retrievedTask2.isCompleted());
        
        assertFalse(taskManager.getTaskById(task1.getId()).isPresent());
    }
}