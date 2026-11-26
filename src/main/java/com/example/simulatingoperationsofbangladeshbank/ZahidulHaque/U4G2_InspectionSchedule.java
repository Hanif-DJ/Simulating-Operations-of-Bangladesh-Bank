package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;
import java.time.LocalDate;

public class U4G2_InspectionSchedule implements Serializable {
    private String scheduleId;
    private String bankId;
    private LocalDate inspectionDate;
    private String team;
    private String status;

    public U4G2_InspectionSchedule(String scheduleId, String bankId, LocalDate inspectionDate, String team, String status) {
        this.scheduleId = scheduleId;
        this.bankId = bankId;
        this.inspectionDate = inspectionDate;
        this.team = team;
        this.status = status;
    }

    public String getScheduleId() {
        return scheduleId;
    }

    public String getBankId() {
        return bankId;
    }

    public LocalDate getInspectionDate() {
        return inspectionDate;
    }

    public String getTeam() {
        return team;
    }

    public String getStatus() {
        return status;
    }

    public void setInspectionDate(LocalDate inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "U4G2_InspectionSchedule{" +
                "scheduleId='" + scheduleId + '\'' +
                ", bankId='" + bankId + '\'' +
                ", inspectionDate=" + inspectionDate +
                ", team='" + team + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public boolean hasConflict(LocalDate otherDate) {
        if (this.inspectionDate != null && this.inspectionDate.equals(otherDate)) {
            return true;
        } else {
            return false;
        }
    }
}
