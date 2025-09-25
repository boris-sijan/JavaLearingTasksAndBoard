package com.taskboard;

import java.util.Objects;

/**
 * Basic Task class representing a simple task with id, title, description, and completion status.
 * This is the foundation class for Phase 1 of the Java Training Program.
 */
public class Task {
    private int id;
    private String title;
    private String description;
    private boolean completed;

    /**
     * Default constructor
     */
    public Task() {
    }

    /**
     * Constructor with all fields except id (id will be set by TaskManager)
     * 
     * @param title the task title (cannot be null or empty)
     * @param description the task description
     * @param completed whether the task is completed
     * @throws IllegalArgumentException if title is null or empty
     */
    public Task(String title, String description, boolean completed) {
        setTitle(title);
        this.description = description;
        this.completed = completed;
    }

    /**
     * Constructor with title and description only (completed defaults to false)
     * 
     * @param title the task title (cannot be null or empty)
     * @param description the task description
     * @throws IllegalArgumentException if title is null or empty
     */
    public Task(String title, String description) {
        this(title, description, false);
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    // Setters with validation
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Sets the task title with validation
     * 
     * @param title the task title (cannot be null or empty)
     * @throws IllegalArgumentException if title is null or empty
     */
    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Task title cannot be null or empty");
        }
        this.title = title.trim();
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * Marks the task as completed
     */
    public void markCompleted() {
        this.completed = true;
    }

    /**
     * Marks the task as not completed
     */
    public void markNotCompleted() {
        this.completed = false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Task task = (Task) obj;
        return id == task.id && 
               completed == task.completed && 
               Objects.equals(title, task.title) && 
               Objects.equals(description, task.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, completed);
    }

    @Override
    public String toString() {
        return String.format("Task{id=%d, title='%s', description='%s', completed=%s}", 
                           id, title, description, completed);
    }
}