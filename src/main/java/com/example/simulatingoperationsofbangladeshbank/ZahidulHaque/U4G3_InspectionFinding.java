package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class U4G3_InspectionFinding implements Serializable {
    private String findingId;
    private String area;
    private String category;
    private String severity;
    private String status;

    public U4G3_InspectionFinding(String findingId, String area, String category, String severity, String status) {
        this.findingId = findingId;
        this.area = area;
        this.category = category;
        this.severity = severity;
        this.status = status;
    }

    public String getFindingId() {
        return findingId;
    }

    public String getArea() {
        return area;
    }

    public String getCategory() {
        return category;
    }

    public String getSeverity() {
        return severity;
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
        return "U4G3_InspectionFinding{" +
                "findingId='" + findingId + '\'' +
                ", area='" + area + '\'' +
                ", category='" + category + '\'' +
                ", severity='" + severity + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public boolean isCritical() {
        if (this.severity != null && this.severity.equals("Critical")) {
            return true;
        } else {
            return false;
        }
    }
}
