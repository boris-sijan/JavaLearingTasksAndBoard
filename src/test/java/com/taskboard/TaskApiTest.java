package com.taskboard;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

/**
 * Unit tests for the TaskApi class.
 * Tests the simple API structure for Phase 1.
 */
class TaskApiTest {

    private TaskManager taskManager;
    private TaskApi taskApi;

    @BeforeEach
    void setUp() {
        taskManager = new TaskManager();
        taskApi = new TaskApi(taskManager);
    }

    @Test
    @DisplayName("Get all tasks returns empty list initially")
    void testGetAllTasksEmpty() {
        List<Task> tasks = taskApi.getAllTasks();
        assertNotNull(tasks);
        assertTrue(tasks.isEmpty());
    }

    @Test
    @DisplayName("Get all tasks returns all created tasks")
    void testGetAllTasks() {
        // Create tasks directly through manager for test setup
        taskManager.createTask("Task 1", "Description 1");
        taskManager.createTask("Task 2", "Description 2");
        
        List<Task> tasks = taskApi.getAllTasks();
        assertEquals(2, tasks.size());
    }

    @Test
    @DisplayName("Get task by ID returns correct task")
    void testGetTaskByIdSuccess() {
        Task created = taskManager.createTask("Test Task", "Description");
        
        Task retrieved = taskApi.getTaskById(created.getId());
        assertEquals(created, retrieved);
    }

    @Test
    @DisplayName("Get task by non-existent ID throws exception")
    void testGetTaskByIdNotFound() {
        assertThrows(TaskNotFoundException.class, () -> taskApi.getTaskById(999));
    }

    @Test
    @DisplayName("Create task with valid request succeeds")
    void testCreateTaskSuccess() {
        TaskApi.CreateTaskRequest request = new TaskApi.CreateTaskRequest("New Task", "New Description");
        
        Task created = taskApi.createTask(request);
        
        assertNotNull(created);
        assertEquals("New Task", created.getTitle());
        assertEquals("New Description", created.getDescription());
        assertFalse(created.isCompleted());
        assertTrue(created.getId() > 0);
    }

    @Test
    @DisplayName("Create task with null request throws exception")
    void testCreateTaskWithNullRequest() {
        assertThrows(IllegalArgumentException.class, () -> taskApi.createTask(null));
    }

    @Test
    @DisplayName("Create task with invalid title throws exception")
    void testCreateTaskWithInvalidTitle() {
        TaskApi.CreateTaskRequest request = new TaskApi.CreateTaskRequest(null, "Description");
        assertThrows(IllegalArgumentException.class, () -> taskApi.createTask(request));
    }

    @Test
    @DisplayName("Update task with valid request succeeds")
    void testUpdateTaskSuccess() {
        Task created = taskManager.createTask("Original", "Original Description");
        TaskApi.UpdateTaskRequest request = new TaskApi.UpdateTaskRequest("Updated", "Updated Description", true);
        
        Task updated = taskApi.updateTask(created.getId(), request);
        
        assertEquals(created.getId(), updated.getId());
        assertEquals("Updated", updated.getTitle());
        assertEquals("Updated Description", updated.getDescription());
        assertTrue(updated.isCompleted());
    }

    @Test
    @DisplayName("Update non-existent task throws exception")
    void testUpdateTaskNotFound() {
        TaskApi.UpdateTaskRequest request = new TaskApi.UpdateTaskRequest("Title", "Description", false);
        assertThrows(TaskNotFoundException.class, () -> taskApi.updateTask(999, request));
    }

    @Test
    @DisplayName("Update task with null request throws exception")
    void testUpdateTaskWithNullRequest() {
        Task created = taskManager.createTask("Task", "Description");
        assertThrows(IllegalArgumentException.class, () -> taskApi.updateTask(created.getId(), null));
    }

    @Test
    @DisplayName("Delete existing task succeeds")
    void testDeleteTaskSuccess() {
        Task created = taskManager.createTask("To Delete", "Description");
        
        assertDoesNotThrow(() -> taskApi.deleteTask(created.getId()));
        assertEquals(0, taskManager.getTaskCount());
    }

    @Test
    @DisplayName("Delete non-existent task throws exception")
    void testDeleteTaskNotFound() {
        assertThrows(TaskNotFoundException.class, () -> taskApi.deleteTask(999));
    }

    @Test
    @DisplayName("Get completed tasks returns only completed tasks")
    void testGetCompletedTasks() {
        taskManager.createTask("Pending", "Description", false);
        taskManager.createTask("Completed", "Description", true);
        
        List<Task> completedTasks = taskApi.getCompletedTasks();
        assertEquals(1, completedTasks.size());
        assertTrue(completedTasks.get(0).isCompleted());
    }

    @Test
    @DisplayName("Get pending tasks returns only pending tasks")
    void testGetPendingTasks() {
        taskManager.createTask("Pending", "Description", false);
        taskManager.createTask("Completed", "Description", true);
        
        List<Task> pendingTasks = taskApi.getPendingTasks();
        assertEquals(1, pendingTasks.size());
        assertFalse(pendingTasks.get(0).isCompleted());
    }

    @Test
    @DisplayName("Complete task marks task as completed")
    void testCompleteTask() {
        Task created = taskManager.createTask("To Complete", "Description", false);
        
        Task completed = taskApi.completeTask(created.getId());
        
        assertTrue(completed.isCompleted());
        assertEquals(created.getId(), completed.getId());
    }

    @Test
    @DisplayName("Complete non-existent task throws exception")
    void testCompleteTaskNotFound() {
        assertThrows(TaskNotFoundException.class, () -> taskApi.completeTask(999));
    }

    // Test request classes
    @Test
    @DisplayName("CreateTaskRequest default constructor works")
    void testCreateTaskRequestDefaultConstructor() {
        TaskApi.CreateTaskRequest request = new TaskApi.CreateTaskRequest();
        assertNull(request.getTitle());
        assertNull(request.getDescription());
    }

    @Test
    @DisplayName("CreateTaskRequest parameterized constructor works")
    void testCreateTaskRequestParameterizedConstructor() {
        TaskApi.CreateTaskRequest request = new TaskApi.CreateTaskRequest("Title", "Description");
        assertEquals("Title", request.getTitle());
        assertEquals("Description", request.getDescription());
    }

    @Test
    @DisplayName("CreateTaskRequest setters work correctly")
    void testCreateTaskRequestSetters() {
        TaskApi.CreateTaskRequest request = new TaskApi.CreateTaskRequest();
        request.setTitle("Set Title");
        request.setDescription("Set Description");
        
        assertEquals("Set Title", request.getTitle());
        assertEquals("Set Description", request.getDescription());
    }

    @Test
    @DisplayName("UpdateTaskRequest default constructor works")
    void testUpdateTaskRequestDefaultConstructor() {
        TaskApi.UpdateTaskRequest request = new TaskApi.UpdateTaskRequest();
        assertNull(request.getTitle());
        assertNull(request.getDescription());
        assertFalse(request.isCompleted());
    }

    @Test
    @DisplayName("UpdateTaskRequest parameterized constructor works")
    void testUpdateTaskRequestParameterizedConstructor() {
        TaskApi.UpdateTaskRequest request = new TaskApi.UpdateTaskRequest("Title", "Description", true);
        assertEquals("Title", request.getTitle());
        assertEquals("Description", request.getDescription());
        assertTrue(request.isCompleted());
    }

    @Test
    @DisplayName("UpdateTaskRequest setters work correctly")
    void testUpdateTaskRequestSetters() {
        TaskApi.UpdateTaskRequest request = new TaskApi.UpdateTaskRequest();
        request.setTitle("Set Title");
        request.setDescription("Set Description");
        request.setCompleted(true);
        
        assertEquals("Set Title", request.getTitle());
        assertEquals("Set Description", request.getDescription());
        assertTrue(request.isCompleted());
    }
}