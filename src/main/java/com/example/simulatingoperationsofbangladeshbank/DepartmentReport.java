package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;

public class DepartmentReport implements Serializable {
    private String reportId;
    private String department;
    private String reportingPeriod;
    private String reviewStatus;
    private String remarks;

    public DepartmentReport(String reportId, String department, String reportingPeriod, String reviewStatus, String remarks) {
        this.reportId = reportId;
        this.department = department;
        this.reportingPeriod = reportingPeriod;
        this.reviewStatus = reviewStatus;
        this.remarks = remarks;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getReportingPeriod() {
        return reportingPeriod;
    }

    public void setReportingPeriod(String reportingPeriod) {
        this.reportingPeriod = reportingPeriod;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "DepartmentReport{" +
                "reportId='" + reportId + '\'' +
                ", department='" + department + '\'' +
                ", reportingPeriod='" + reportingPeriod + '\'' +
                ", reviewStatus='" + reviewStatus + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
