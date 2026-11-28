package com.example.simulatingoperationsofbangladeshbank.towfiqur;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class MonetaryPolicyOfficer implements Serializable {
    private static final long serialVersionUID = 1L;

    private String officerCode;
    private String fullName;
    private String departmentUnit;
    private String activeCycle;
    private LocalDate sessionDate;

    public MonetaryPolicyOfficer() {
    }

    public MonetaryPolicyOfficer(String officerCode, String fullName, String departmentUnit,
                                 String activeCycle, LocalDate sessionDate) {
        setOfficerCode(officerCode);
        setFullName(fullName);
        setDepartmentUnit(departmentUnit);
        setActiveCycle(activeCycle);
        setSessionDate(sessionDate);
    }

    public String getOfficerCode() {
        return officerCode;
    }

    public void setOfficerCode(String officerCode) {
        if (officerCode == null || officerCode.trim().isEmpty()) {
            throw new IllegalArgumentException("Officer code must not be blank.");
        }
        this.officerCode = officerCode.trim();
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalArgumentException("Full name must not be blank.");
        }
        this.fullName = fullName.trim();
    }

    public String getDepartmentUnit() {
        return departmentUnit;
    }

    public void setDepartmentUnit(String departmentUnit) {
        this.departmentUnit = (departmentUnit == null) ? "Monetary Policy Department" : departmentUnit.trim();
    }

    public String getActiveCycle() {
        return activeCycle;
    }

    public void setActiveCycle(String activeCycle) {
        this.activeCycle = (activeCycle == null) ? "Unassigned Cycle" : activeCycle.trim();
    }

    public LocalDate getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(LocalDate sessionDate) {
        this.sessionDate = (sessionDate == null) ? LocalDate.now() : sessionDate;
    }

    // Custom UML / Domain Methods
    public String buildOfficerAuditStamp(String actionSummary) {
        String note = (actionSummary == null || actionSummary.isBlank()) ? "General Policy Action" : actionSummary.trim();
        return "[MPD-U5 | " + officerCode + " | " + activeCycle + " | " + sessionDate + "] " + note;
    }

    public boolean isEligibleForCycleSubmission(String targetCycle) {
        return targetCycle != null && !targetCycle.isBlank() && activeCycle != null && !activeCycle.isBlank();
    }

    @Override
    public String toString() {
        return "MonetaryPolicyOfficer{" +
                "officerCode='" + officerCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", departmentUnit='" + departmentUnit + '\'' +
                ", activeCycle='" + activeCycle + '\'' +
                ", sessionDate=" + sessionDate +
                '}';
    }

}
