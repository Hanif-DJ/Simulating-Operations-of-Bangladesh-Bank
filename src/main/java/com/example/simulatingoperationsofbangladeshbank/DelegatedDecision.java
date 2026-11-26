package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;

public class DelegatedDecision implements Serializable {
    private String requestId;
    private String department;
    private String requestDetails;
    private String decision;
    private String remarks;

    public DelegatedDecision(String requestId, String department, String requestDetails, String decision, String remarks) {
        this.requestId = requestId;
        this.department = department;
        this.requestDetails = requestDetails;
        this.decision = decision;
        this.remarks = remarks;
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

    public String getRequestDetails() {
        return requestDetails;
    }

    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "DelegatedDecision{" +
                "requestId='" + requestId + '\'' +
                ", department='" + department + '\'' +
                ", requestDetails='" + requestDetails + '\'' +
                ", decision='" + decision + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}