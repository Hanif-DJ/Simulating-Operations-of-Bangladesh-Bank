package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;

public class CriticalAlert implements Serializable {
    private String incidentId;
    private String sourceDept;
    private String severity;
    private String status;
    private String emergencyDirection;

    public CriticalAlert(String incidentId, String sourceDept, String severity, String status, String emergencyDirection) {
        this.incidentId = incidentId;
        this.sourceDept = sourceDept;
        this.severity = severity;
        this.status = status;
        this.emergencyDirection = emergencyDirection;
    }

    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    public String getSourceDept() {
        return sourceDept;
    }

    public void setSourceDept(String sourceDept) {
        this.sourceDept = sourceDept;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmergencyDirection() {
        return emergencyDirection;
    }

    public void setEmergencyDirection(String emergencyDirection) {
        this.emergencyDirection = emergencyDirection;
    }

    @Override
    public String toString() {
        return "CriticalAlert{" +
                "incidentId='" + incidentId + '\'' +
                ", sourceDept='" + sourceDept + '\'' +
                ", severity='" + severity + '\'' +
                ", status='" + status + '\'' +
                ", emergencyDirection='" + emergencyDirection + '\'' +
                '}';
    }
}
