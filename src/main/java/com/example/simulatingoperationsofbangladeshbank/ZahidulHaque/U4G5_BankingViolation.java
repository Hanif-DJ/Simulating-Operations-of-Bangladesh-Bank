package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class U4G5_BankingViolation implements Serializable {
    private String violationId;
    private String severity;
    private String evidenceRef;
    private String status;

    public U4G5_BankingViolation(String violationId, String severity, String evidenceRef, String status) {
        this.violationId = violationId;
        this.severity = severity;
        this.evidenceRef = evidenceRef;
        this.status = status;
    }

    public String getViolationId() {
        return violationId;
    }

    public String getSeverity() {
        return severity;
    }

    public String getEvidenceRef() {
        return evidenceRef;
    }

    public String getStatus() {
        return status;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "U4G5_BankingViolation{" +
                "violationId='" + violationId + '\'' +
                ", severity='" + severity + '\'' +
                ", evidenceRef='" + evidenceRef + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public void resolveViolation() {
        this.status = "Resolved";
    }
}
