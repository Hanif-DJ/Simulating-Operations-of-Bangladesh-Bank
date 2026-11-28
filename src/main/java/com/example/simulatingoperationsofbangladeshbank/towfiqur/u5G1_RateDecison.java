package com.example.simulatingoperationsofbangladeshbank.towfiqur;

import java.io.Serializable;
import java.time.LocalDate;

public class u5G1_RateDecison implements Serializable {
    private static final long serialVersionUID = 1051L;

    private String decisionId;
    private double policyRate;
    private LocalDate decisionDate;
    private String reportingCycle;
    private String sourceDocRef;
    private String status;
    private String analyticalAssumptions;

    public u5G1_RateDecison() {
    }

    public u5G1_RateDecison(String decisionId, double policyRate, LocalDate decisionDate,
                            String reportingCycle, String sourceDocRef, String status,
                            String analyticalAssumptions) {
        setDecisionId(decisionId);
        setPolicyRate(policyRate);
        setDecisionDate(decisionDate);
        setReportingCycle(reportingCycle);
        setSourceDocRef(sourceDocRef);
        setStatus(status);
        setAnalyticalAssumptions(analyticalAssumptions);
    }

    public String getDecisionId() {
        return decisionId;
    }

    public void setDecisionId(String decisionId) {
        if (decisionId == null || decisionId.isBlank()) {
            throw new IllegalArgumentException("Decision ID cannot be empty.");
        }
        this.decisionId = decisionId.trim();
    }

    public double getPolicyRate() {
        return policyRate;
    }

    public void setPolicyRate(double policyRate) {
        if (Double.isNaN(policyRate) || policyRate < 0.0 || policyRate > 50.0) {
            throw new IllegalArgumentException("Policy rate must be between 0.0 and 50.0.");
        }
        this.policyRate = policyRate;
    }

    public LocalDate getDecisionDate() {
        return decisionDate;
    }

    public void setDecisionDate(LocalDate decisionDate) {
        if (decisionDate == null) {
            throw new IllegalArgumentException("Decision date cannot be null.");
        }
        this.decisionDate = decisionDate;
    }

    public String getReportingCycle() {
        return reportingCycle;
    }

    public void setReportingCycle(String reportingCycle) {
        if (reportingCycle == null || reportingCycle.isBlank()) {
            throw new IllegalArgumentException("Reporting cycle cannot be empty.");
        }
        this.reportingCycle = reportingCycle.trim();
    }

    public String getSourceDocRef() {
        return sourceDocRef;
    }

    public void setSourceDocRef(String sourceDocRef) {
        if (sourceDocRef == null || sourceDocRef.isBlank()) {
            throw new IllegalArgumentException("Source document reference cannot be empty.");
        }
        this.sourceDocRef = sourceDocRef.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || status.isBlank()) {
            throw new IllegalArgumentException("Status cannot be empty.");
        }
        this.status = status.trim();
    }

    public String getAnalyticalAssumptions() {
        return analyticalAssumptions;
    }

    public void setAnalyticalAssumptions(String analyticalAssumptions) {
        this.analyticalAssumptions = analyticalAssumptions;
    }



    @Override
    public String toString() {
        return "u5G1_RateDecison [decisionId=" + decisionId + ", policyRate=" + policyRate +
                ", decisionDate=" + decisionDate + ", reportingCycle=" + reportingCycle +
                ", sourceDocRef=" + sourceDocRef + ", status=" + status +
                ", analyticalAssumptions=" + analyticalAssumptions + "]";
    }

    // Uml custom method
    public boolean isDuplicate() {
        return this.decisionId != null && !this.decisionId.isBlank()
                && "Duplicate".equalsIgnoreCase(this.status);

    }
}

