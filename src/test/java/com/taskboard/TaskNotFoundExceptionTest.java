package com.taskboard;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the TaskNotFoundException class.
 * Tests custom exception functionality for Phase 1.
 */
class TaskNotFoundExceptionTest {

    @Test
    @DisplayName("Constructor with task ID creates exception with correct message")
    void testConstructorWithTaskId() {
        int taskId = 42;
        TaskNotFoundException exception = new TaskNotFoundException(taskId);
        
        assertEquals(taskId, exception.getTaskId());
        assertTrue(exception.getMessage().contains("42"));
        assertTrue(exception.getMessage().contains("not found"));
    }

    @Test
    @DisplayName("Constructor with custom message creates exception correctly")
    void testConstructorWithMessage() {
        String customMessage = "Custom error message";
        TaskNotFoundException exception = new TaskNotFoundException(customMessage);
        
        assertEquals(customMessage, exception.getMessage());
        assertEquals(-1, exception.getTaskId()); // Should be -1 when not specified
    }

    @Test
    @DisplayName("Exception is instance of RuntimeException")
    void testExceptionHierarchy() {
        TaskNotFoundException exception = new TaskNotFoundException(1);
        assertInstanceOf(RuntimeException.class, exception);
    }

    @Test
    @DisplayName("Exception can be thrown and caught correctly")
    void testThrowAndCatch() {
        int testId = 123;
        
        TaskNotFoundException thrown = assertThrows(
            TaskNotFoundException.class,
            () -> {
                throw new TaskNotFoundException(testId);
            }
        );
        
        assertEquals(testId, thrown.getTaskId());
    }
}