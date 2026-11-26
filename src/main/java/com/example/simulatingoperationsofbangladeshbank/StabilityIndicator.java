package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;

public class StabilityIndicator implements Serializable {
    private String indicatorId;
    private String reportingPeriod;
    private String department;
    private String riskFlag;
    private String governorRemarks;

    public StabilityIndicator(String indicatorId, String reportingPeriod, String department, String riskFlag, String governorRemarks) {
        this.indicatorId = indicatorId;
        this.reportingPeriod = reportingPeriod;
        this.department = department;
        this.riskFlag = riskFlag;
        this.governorRemarks = governorRemarks;
    }

    public String getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(String indicatorId) {
        this.indicatorId = indicatorId;
    }

    public String getReportingPeriod() {
        return reportingPeriod;
    }

    public void setReportingPeriod(String reportingPeriod) {
        this.reportingPeriod = reportingPeriod;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRiskFlag() {
        return riskFlag;
    }

    public void setRiskFlag(String riskFlag) {
        this.riskFlag = riskFlag;
    }

    public String getGovernorRemarks() {
        return governorRemarks;
    }

    public void setGovernorRemarks(String governorRemarks) {
        this.governorRemarks = governorRemarks;
    }

    @Override
    public String toString() {
        return "StabilityIndicator{" +
                "indicatorId='" + indicatorId + '\'' +
                ", reportingPeriod='" + reportingPeriod + '\'' +
                ", department='" + department + '\'' +
                ", riskFlag='" + riskFlag + '\'' +
                ", governorRemarks='" + governorRemarks + '\'' +
                '}';
    }
}
