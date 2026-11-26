package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;
import java.time.LocalDate;

public class SupervisoryInstruction implements Serializable {
    private String instructionId;
    private String department;
    private String priorityLevel;
    private LocalDate dueDate;
    private String supervisoryNote;

    public SupervisoryInstruction(String instructionId, String department, String priorityLevel, LocalDate dueDate, String supervisoryNote) {
        this.instructionId = instructionId;
        this.department = department;
        this.priorityLevel = priorityLevel;
        this.dueDate = dueDate;
        this.supervisoryNote = supervisoryNote;
    }

    public String getInstructionId() {
        return instructionId;
    }

    public void setInstructionId(String instructionId) {
        this.instructionId = instructionId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(String priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getSupervisoryNote() {
        return supervisoryNote;
    }

    public void setSupervisoryNote(String supervisoryNote) {
        this.supervisoryNote = supervisoryNote;
    }

    @Override
    public String toString() {
        return "SupervisoryInstruction{" +
                "instructionId='" + instructionId + '\'' +
                ", department='" + department + '\'' +
                ", priorityLevel='" + priorityLevel + '\'' +
                ", dueDate=" + dueDate +
                ", supervisoryNote='" + supervisoryNote + '\'' +
                '}';
    }
}