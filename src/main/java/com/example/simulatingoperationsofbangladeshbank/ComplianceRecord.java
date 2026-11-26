package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;
import java.time.LocalDate;

public class ComplianceRecord implements Serializable {
    private String decisionId;
    private String assignedDept;
    private LocalDate dueDate;
    private String complianceStatus;
    private String complianceFinding;

    public ComplianceRecord(String decisionId, String assignedDept, LocalDate dueDate, String complianceStatus, String complianceFinding) {
        this.decisionId = decisionId;
        this.assignedDept = assignedDept;
        this.dueDate = dueDate;
        this.complianceStatus = complianceStatus;
        this.complianceFinding = complianceFinding;
    }

    public String getDecisionId() {
        return decisionId;
    }

    public void setDecisionId(String decisionId) {
        this.decisionId = decisionId;
    }

    public String getAssignedDept() {
        return assignedDept;
    }

    public void setAssignedDept(String assignedDept) {
        this.assignedDept = assignedDept;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getComplianceStatus() {
        return complianceStatus;
    }

    public void setComplianceStatus(String complianceStatus) {
        this.complianceStatus = complianceStatus;
    }

    public String getComplianceFinding() {
        return complianceFinding;
    }

    public void setComplianceFinding(String complianceFinding) {
        this.complianceFinding = complianceFinding;
    }

    @Override
    public String toString() {
        return "ComplianceRecord{" +
                "decisionId='" + decisionId + '\'' +
                ", assignedDept='" + assignedDept + '\'' +
                ", dueDate=" + dueDate +
                ", complianceStatus='" + complianceStatus + '\'' +
                ", complianceFinding='" + complianceFinding + '\'' +
                '}';
    }
}