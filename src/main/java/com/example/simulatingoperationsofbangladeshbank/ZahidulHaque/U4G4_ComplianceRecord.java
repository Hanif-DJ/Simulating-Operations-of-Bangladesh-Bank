package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class U4G4_ComplianceRecord implements Serializable {
    private String complianceId;
    private String period;
    private String status;
    private String monitoringNote;

    public U4G4_ComplianceRecord(String complianceId, String period, String status, String monitoringNote) {
        this.complianceId = complianceId;
        this.period = period;
        this.status = status;
        this.monitoringNote = monitoringNote;
    }

    public String getComplianceId() {
        return complianceId;
    }

    public String getPeriod() {
        return period;
    }

    public String getStatus() {
        return status;
    }

    public String getMonitoringNote() {
        return monitoringNote;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMonitoringNote(String monitoringNote) {
        this.monitoringNote = monitoringNote;
    }

    @Override
    public String toString() {
        return "U4G4_ComplianceRecord{" +
                "complianceId='" + complianceId + '\'' +
                ", period='" + period + '\'' +
                ", status='" + status + '\'' +
                ", monitoringNote='" + monitoringNote + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public boolean isCompliant() {
        if (this.status != null && this.status.equals("Compliant")) {
            return true;
        } else {
            return false;
        }
    }
}
