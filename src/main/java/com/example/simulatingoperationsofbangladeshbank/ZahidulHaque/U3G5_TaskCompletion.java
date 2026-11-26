package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;
import java.time.LocalDate;

public class U3G5_TaskCompletion implements Serializable {
    private String taskId;
    private String title;
    private String assignedTo;
    private LocalDate dueDate;
    private String status;

    public U3G5_TaskCompletion(String taskId, String title, String assignedTo, LocalDate dueDate, String status) {
        this.taskId = taskId;
        this.title = title;
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

    public String getAssignedTo() {
        return assignedTo;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "U3G5_TaskCompletion{" +
                "taskId='" + taskId + '\'' +
                ", title='" + title + '\'' +
                ", assignedTo='" + assignedTo + '\'' +
                ", dueDate=" + dueDate +
                ", status='" + status + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public boolean verifyCompletion() {
        if (this.status != null && this.status.equals("Completed")) {
            return true;
        } else {
            return false;
        }
    }
}
