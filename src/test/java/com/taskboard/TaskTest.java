package com.taskboard;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Comprehensive unit tests for the Task class.
 * Demonstrates testing fundamentals for Phase 1.
 */
class TaskTest {

    private Task task;

    @BeforeEach
    void setUp() {
        // Fresh task instance for each test
        task = new Task();
    }

    @Test
    @DisplayName("Default constructor creates task with default values")
    void testDefaultConstructor() {
        assertEquals(0, task.getId());
        assertNull(task.getTitle());
        assertNull(task.getDescription());
        assertFalse(task.isCompleted());
    }

    @Test
    @DisplayName("Constructor with title and description sets values correctly")
    void testConstructorWithTitleAndDescription() {
        Task newTask = new Task("Test Task", "Test Description");
        
        assertEquals("Test Task", newTask.getTitle());
        assertEquals("Test Description", newTask.getDescription());
        assertFalse(newTask.isCompleted()); // Should default to false
    }

    @Test
    @DisplayName("Constructor with all parameters sets values correctly")
    void testConstructorWithAllParameters() {
        Task newTask = new Task("Completed Task", "Already done", true);
        
        assertEquals("Completed Task", newTask.getTitle());
        assertEquals("Already done", newTask.getDescription());
        assertTrue(newTask.isCompleted());
    }

    @Test
    @DisplayName("Constructor trims whitespace from title")
    void testConstructorTrimsTitle() {
        Task newTask = new Task("  Trimmed Title  ", "Description");
        assertEquals("Trimmed Title", newTask.getTitle());
    }

    @Test
    @DisplayName("Constructor throws exception for null title")
    void testConstructorWithNullTitle() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, 
            () -> new Task(null, "Description")
        );
        assertEquals("Task title cannot be null or empty", exception.getMessage());
    }

    @Test
    @DisplayName("Constructor throws exception for empty title")
    void testConstructorWithEmptyTitle() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, 
            () -> new Task("", "Description")
        );
        assertEquals("Task title cannot be null or empty", exception.getMessage());
    }

    @Test
    @DisplayName("Constructor throws exception for whitespace-only title")
    void testConstructorWithWhitespaceOnlyTitle() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, 
            () -> new Task("   ", "Description")
        );
        assertEquals("Task title cannot be null or empty", exception.getMessage());
    }

    @Test
    @DisplayName("Setting valid title works correctly")
    void testSetValidTitle() {
        task.setTitle("Valid Title");
        assertEquals("Valid Title", task.getTitle());
    }

    @Test
    @DisplayName("Setting title trims whitespace")
    void testSetTitleTrimsWhitespace() {
        task.setTitle("  Spaced Title  ");
        assertEquals("Spaced Title", task.getTitle());
    }

    @Test
    @DisplayName("Setting null title throws exception")
    void testSetNullTitle() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, 
            () -> task.setTitle(null)
        );
        assertEquals("Task title cannot be null or empty", exception.getMessage());
    }

    @Test
    @DisplayName("Setting empty title throws exception")
    void testSetEmptyTitle() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class, 
            () -> task.setTitle("")
        );
        assertEquals("Task title cannot be null or empty", exception.getMessage());
    }

    @Test
    @DisplayName("ID getter and setter work correctly")
    void testIdGetterAndSetter() {
        task.setId(42);
        assertEquals(42, task.getId());
    }

    @Test
    @DisplayName("Description getter and setter work correctly")
    void testDescriptionGetterAndSetter() {
        task.setDescription("Test description");
        assertEquals("Test description", task.getDescription());
        
        // Description can be null
        task.setDescription(null);
        assertNull(task.getDescription());
    }

    @Test
    @DisplayName("Completed getter and setter work correctly")
    void testCompletedGetterAndSetter() {
        task.setCompleted(true);
        assertTrue(task.isCompleted());
        
        task.setCompleted(false);
        assertFalse(task.isCompleted());
    }

    @Test
    @DisplayName("Mark completed sets completed to true")
    void testMarkCompleted() {
        task.markCompleted();
        assertTrue(task.isCompleted());
    }

    @Test
    @DisplayName("Mark not completed sets completed to false")
    void testMarkNotCompleted() {
        task.setCompleted(true);
        task.markNotCompleted();
        assertFalse(task.isCompleted());
    }

    @Test
    @DisplayName("Two tasks with same properties are equal")
    void testEqualsWithSameProperties() {
        Task task1 = new Task("Same Title", "Same Description", true);
        task1.setId(1);
        
        Task task2 = new Task("Same Title", "Same Description", true);
        task2.setId(1);
        
        assertEquals(task1, task2);
        assertEquals(task1.hashCode(), task2.hashCode());
    }

    @Test
    @DisplayName("Task equals itself")
    void testEqualsItself() {
        task.setTitle("Test");
        assertEquals(task, task);
    }

    @Test
    @DisplayName("Task does not equal null")
    void testNotEqualsNull() {
        task.setTitle("Test");
        assertNotEquals(task, null);
    }

    @Test
    @DisplayName("Task does not equal different class")
    void testNotEqualsDifferentClass() {
        task.setTitle("Test");
        assertNotEquals(task, "Not a task");
    }

    @Test
    @DisplayName("Tasks with different IDs are not equal")
    void testNotEqualsWithDifferentIds() {
        Task task1 = new Task("Title", "Description");
        task1.setId(1);
        
        Task task2 = new Task("Title", "Description");
        task2.setId(2);
        
        assertNotEquals(task1, task2);
    }

    @Test
    @DisplayName("Tasks with different titles are not equal")
    void testNotEqualsWithDifferentTitles() {
        Task task1 = new Task("Title 1", "Description");
        Task task2 = new Task("Title 2", "Description");
        
        assertNotEquals(task1, task2);
    }

    @Test
    @DisplayName("ToString contains all important information")
    void testToString() {
        task.setId(123);
        task.setTitle("Test Task");
        task.setDescription("Test Description");
        task.setCompleted(true);
        
        String result = task.toString();
        
        assertTrue(result.contains("123"));
        assertTrue(result.contains("Test Task"));
        assertTrue(result.contains("Test Description"));
        assertTrue(result.contains("true"));
    }
}