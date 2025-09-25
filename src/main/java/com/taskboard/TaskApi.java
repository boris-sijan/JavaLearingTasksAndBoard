package com.taskboard;

import java.util.List;

/**
 * Simple API structure for Task operations (Phase 1).
 * This class demonstrates the REST endpoint structure without Spring framework.
 * In Phase 3, this will be converted to a proper Spring REST controller.
 */
public class TaskApi {
    
    private final TaskManager taskManager;

    /**
     * Constructor with TaskManager dependency
     * 
     * @param taskManager the task manager to use for operations
     */
    public TaskApi(TaskManager taskManager) {
        this.taskManager = taskManager;
    }

    /**
     * GET /api/tasks - List all tasks
     * 
     * @return list of all tasks
     */
    public List<Task> getAllTasks() {
        return taskManager.getAllTasks();
    }

    /**
     * GET /api/tasks/{id} - Get specific task
     * 
     * @param id the task ID
     * @return the task with the specified ID
     * @throws TaskNotFoundException if task not found
     */
    public Task getTaskById(int id) {
        return taskManager.getTaskByIdOrThrow(id);
    }

    /**
     * POST /api/tasks - Create new task
     * 
     * @param request the task creation request
     * @return the created task
     * @throws IllegalArgumentException if request is invalid
     */
    public Task createTask(CreateTaskRequest request) {
        validateCreateTaskRequest(request);
        return taskManager.createTask(request.getTitle(), request.getDescription());
    }

    /**
     * PUT /api/tasks/{id} - Update existing task
     * 
     * @param id the task ID to update
     * @param request the task update request
     * @return the updated task
     * @throws TaskNotFoundException if task not found
     * @throws IllegalArgumentException if request is invalid
     */
    public Task updateTask(int id, UpdateTaskRequest request) {
        validateUpdateTaskRequest(request);
        return taskManager.updateTask(id, request.getTitle(), 
                                    request.getDescription(), request.isCompleted());
    }

    /**
     * DELETE /api/tasks/{id} - Delete task
     * 
     * @param id the task ID to delete
     * @throws TaskNotFoundException if task not found
     */
    public void deleteTask(int id) {
        taskManager.deleteTaskOrThrow(id);
    }

    /**
     * GET /api/tasks/completed - Get all completed tasks
     * 
     * @return list of completed tasks
     */
    public List<Task> getCompletedTasks() {
        return taskManager.getCompletedTasks();
    }

    /**
     * GET /api/tasks/pending - Get all pending tasks
     * 
     * @return list of pending tasks
     */
    public List<Task> getPendingTasks() {
        return taskManager.getPendingTasks();
    }

    /**
     * PUT /api/tasks/{id}/complete - Mark task as completed
     * 
     * @param id the task ID to complete
     * @return the updated task
     * @throws TaskNotFoundException if task not found
     */
    public Task completeTask(int id) {
        return taskManager.markTaskCompleted(id);
    }

    // Request validation methods
    private void validateCreateTaskRequest(CreateTaskRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("Create task request cannot be null");
        }
        // Additional validation is handled by Task constructor
    }

    private void validateUpdateTaskRequest(UpdateTaskRequest request) {
        if (request == null) {
            throw new IllegalArgumentException("Update task request cannot be null");
        }
        // Additional validation is handled by Task setters
    }

    /**
     * Simple request class for creating tasks
     */
    public static class CreateTaskRequest {
        private String title;
        private String description;

        public CreateTaskRequest() {}

        public CreateTaskRequest(String title, String description) {
            this.title = title;
            this.description = description;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }

    /**
     * Simple request class for updating tasks
     */
    public static class UpdateTaskRequest {
        private String title;
        private String description;
        private boolean completed;

        public UpdateTaskRequest() {}

        public UpdateTaskRequest(String title, String description, boolean completed) {
            this.title = title;
            this.description = description;
            this.completed = completed;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public boolean isCompleted() {
            return completed;
        }

        public void setCompleted(boolean completed) {
            this.completed = completed;
        }
    }
}