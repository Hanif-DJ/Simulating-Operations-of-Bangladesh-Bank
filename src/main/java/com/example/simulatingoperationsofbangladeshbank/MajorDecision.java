package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;

public class MajorDecision implements Serializable {
    private String requestId;
    private String department;
    private String requestSummary;
    private String decision;
    private String conditions;

    public MajorDecision(String requestId, String department, String requestSummary, String decision, String conditions) {
        this.requestId = requestId;
        this.department = department;
        this.requestSummary = requestSummary;
        this.decision = decision;
        this.conditions = conditions;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRequestSummary() {
        return requestSummary;
    }

    public void setRequestSummary(String requestSummary) {
        this.requestSummary = requestSummary;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getConditions() {
        return conditions;
    }

    public void setConditions(String conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "MajorDecision{" +
                "requestId='" + requestId + '\'' +
                ", department='" + department + '\'' +
                ", requestSummary='" + requestSummary + '\'' +
                ", decision='" + decision + '\'' +
                ", conditions='" + conditions + '\'' +
                '}';
    }
}