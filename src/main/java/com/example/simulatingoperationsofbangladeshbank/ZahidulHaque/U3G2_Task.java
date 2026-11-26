package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;
import java.time.LocalDate;

public class U3G2_Task implements Serializable {
    private String taskId;
    private String title;
    private String priority;
    private String assignedTo;
    private LocalDate dueDate;
    private String status;

    public U3G2_Task(String taskId, String title, String priority, String assignedTo, LocalDate dueDate, String status) {
        this.taskId = taskId;
        this.title = title;
        this.priority = priority;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getTaskId() {
        return taskId;
    }

    public String getTitle() {
        return title;
    }

    public String getPriority() {
        return priority;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "U3G2_Task{" +
                "taskId='" + taskId + '\'' +
                ", title='" + title + '\'' +
                ", priority='" + priority + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", dueDate=" + dueDate +
                ", status='" + status + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public void updateStatus (String status) {
        this.status = status;
    }
}
