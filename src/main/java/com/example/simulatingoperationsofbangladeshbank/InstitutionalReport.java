package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;

public class InstitutionalReport implements Serializable {
    private String reportId;
    private String period;
    private String reportVersion;
    private String reviewStatus;
    private String governorRemarks;

    public InstitutionalReport(String reportId, String period, String reportVersion, String reviewStatus, String governorRemarks) {
        this.reportId = reportId;
        this.period = period;
        this.reportVersion = reportVersion;
        this.reviewStatus = reviewStatus;
        this.governorRemarks = governorRemarks;
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getReportVersion() {
        return reportVersion;
    }

    public void setReportVersion(String reportVersion) {
        this.reportVersion = reportVersion;
    }

    public String getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(String reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getGovernorRemarks() {
        return governorRemarks;
    }

    public void setGovernorRemarks(String governorRemarks) {
        this.governorRemarks = governorRemarks;
    }

    @Override
    public String toString() {
        return "InstitutionalReport{" +
                "reportId='" + reportId + '\'' +
                ", period='" + period + '\'' +
                ", reportVersion='" + reportVersion + '\'' +
                ", reviewStatus='" + reviewStatus + '\'' +
                ", governorRemarks='" + governorRemarks + '\'' +
                '}';
    }
}