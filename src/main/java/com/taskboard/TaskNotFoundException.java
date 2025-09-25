package com.taskboard;

/**
 * Custom exception for task-related errors, specifically when a task is not found.
 * This demonstrates basic exception handling concepts for Phase 1.
 */
public class TaskNotFoundException extends RuntimeException {
    
    private final int taskId;

    /**
     * Constructs a TaskNotFoundException with a specific task ID
     * 
     * @param taskId the ID of the task that was not found
     */
    public TaskNotFoundException(int taskId) {
        super("Task with ID " + taskId + " not found");
        this.taskId = taskId;
    }

    /**
     * Constructs a TaskNotFoundException with a custom message
     * 
     * @param message the custom error message
     */
    public TaskNotFoundException(String message) {
        super(message);
        this.taskId = -1;
    }

    /**
     * Gets the ID of the task that was not found
     * 
     * @return the task ID, or -1 if not applicable
     */
    public int getTaskId() {
        return taskId;
    }
}