package com.taskboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * TaskManager class that coordinates task operations using in-memory storage.
 * Provides basic CRUD operations and simple ID generation.
 * This is the main business logic class for Phase 1.
 */
public class TaskManager {
    
    private final List<Task> tasks;
    private int nextId;

    /**
     * Default constructor initializes empty task list and ID counter
     */
    public TaskManager() {
        this.tasks = new ArrayList<>();
        this.nextId = 1;
    }

    /**
     * Creates a new task and adds it to the collection
     * 
     * @param title the task title
     * @param description the task description
     * @return the created task with assigned ID
     * @throws IllegalArgumentException if title is invalid
     */
    public Task createTask(String title, String description) {
        Task task = new Task(title, description);
        task.setId(nextId++);
        tasks.add(task);
        return task;
    }

    /**
     * Creates a new task with completion status and adds it to the collection
     * 
     * @param title the task title
     * @param description the task description
     * @param completed the completion status
     * @return the created task with assigned ID
     * @throws IllegalArgumentException if title is invalid
     */
    public Task createTask(String title, String description, boolean completed) {
        Task task = new Task(title, description, completed);
        task.setId(nextId++);
        tasks.add(task);
        return task;
    }

    /**
     * Retrieves all tasks
     * 
     * @return a new list containing all tasks (defensive copy)
     */
    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks);
    }

    /**
     * Finds a task by its ID
     * 
     * @param id the task ID to search for
     * @return Optional containing the task if found, empty otherwise
     */
    public Optional<Task> getTaskById(int id) {
        return tasks.stream()
                   .filter(task -> task.getId() == id)
                   .findFirst();
    }

    /**
     * Gets a task by ID, throwing exception if not found
     * 
     * @param id the task ID to search for
     * @return the task with the specified ID
     * @throws TaskNotFoundException if no task with the given ID exists
     */
    public Task getTaskByIdOrThrow(int id) {
        return getTaskById(id)
                .orElseThrow(() -> new TaskNotFoundException(id));
    }

    /**
     * Updates an existing task with new information
     * 
     * @param id the ID of the task to update
     * @param title the new title
     * @param description the new description
     * @param completed the new completion status
     * @return the updated task
     * @throws TaskNotFoundException if no task with the given ID exists
     * @throws IllegalArgumentException if title is invalid
     */
    public Task updateTask(int id, String title, String description, boolean completed) {
        Task task = getTaskByIdOrThrow(id);
        task.setTitle(title);
        task.setDescription(description);
        task.setCompleted(completed);
        return task;
    }

    /**
     * Updates only the completion status of a task
     * 
     * @param id the ID of the task to update
     * @param completed the new completion status
     * @return the updated task
     * @throws TaskNotFoundException if no task with the given ID exists
     */
    public Task updateTaskCompletion(int id, boolean completed) {
        Task task = getTaskByIdOrThrow(id);
        task.setCompleted(completed);
        return task;
    }

    /**
     * Marks a task as completed
     * 
     * @param id the ID of the task to mark as completed
     * @return the updated task
     * @throws TaskNotFoundException if no task with the given ID exists
     */
    public Task markTaskCompleted(int id) {
        Task task = getTaskByIdOrThrow(id);
        task.markCompleted();
        return task;
    }

    /**
     * Deletes a task by its ID
     * 
     * @param id the ID of the task to delete
     * @return true if the task was found and deleted, false otherwise
     */
    public boolean deleteTask(int id) {
        return tasks.removeIf(task -> task.getId() == id);
    }

    /**
     * Deletes a task by its ID, throwing exception if not found
     * 
     * @param id the ID of the task to delete
     * @throws TaskNotFoundException if no task with the given ID exists
     */
    public void deleteTaskOrThrow(int id) {
        if (!deleteTask(id)) {
            throw new TaskNotFoundException(id);
        }
    }

    /**
     * Gets the total number of tasks
     * 
     * @return the number of tasks in the collection
     */
    public int getTaskCount() {
        return tasks.size();
    }

    /**
     * Gets the number of completed tasks
     * 
     * @return the number of completed tasks
     */
    public int getCompletedTaskCount() {
        return (int) tasks.stream()
                         .filter(Task::isCompleted)
                         .count();
    }

    /**
     * Gets all completed tasks
     * 
     * @return a new list containing only completed tasks
     */
    public List<Task> getCompletedTasks() {
        return tasks.stream()
                   .filter(Task::isCompleted)
                   .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    /**
     * Gets all pending (not completed) tasks
     * 
     * @return a new list containing only pending tasks
     */
    public List<Task> getPendingTasks() {
        return tasks.stream()
                   .filter(task -> !task.isCompleted())
                   .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
    }

    /**
     * Clears all tasks (useful for testing)
     */
    public void clearAllTasks() {
        tasks.clear();
        nextId = 1;
    }

    /**
     * Checks if the task manager is empty
     * 
     * @return true if no tasks exist, false otherwise
     */
    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}