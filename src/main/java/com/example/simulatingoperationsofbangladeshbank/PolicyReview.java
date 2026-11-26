package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;

public class PolicyReview implements Serializable {
    private String policyId;
    private String reviewPeriod;
    private String implStatus;
    private String deviationNote;
    private String evalRemarks;

    public PolicyReview(String policyId, String reviewPeriod, String implStatus, String deviationNote, String evalRemarks) {
        this.policyId = policyId;
        this.reviewPeriod = reviewPeriod;
        this.implStatus = implStatus;
        this.deviationNote = deviationNote;
        this.evalRemarks = evalRemarks;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public String getReviewPeriod() {
        return reviewPeriod;
    }

    public void setReviewPeriod(String reviewPeriod) {
        this.reviewPeriod = reviewPeriod;
    }

    public String getImplStatus() {
        return implStatus;
    }

    public void setImplStatus(String implStatus) {
        this.implStatus = implStatus;
    }

    public String getDeviationNote() {
        return deviationNote;
    }

    public void setDeviationNote(String deviationNote) {
        this.deviationNote = deviationNote;
    }

    public String getEvalRemarks() {
        return evalRemarks;
    }

    public void setEvalRemarks(String evalRemarks) {
        this.evalRemarks = evalRemarks;
    }

    @Override
    public String toString() {
        return "PolicyReview{" +
                "policyId='" + policyId + '\'' +
                ", reviewPeriod='" + reviewPeriod + '\'' +
                ", implStatus='" + implStatus + '\'' +
                ", deviationNote='" + deviationNote + '\'' +
                ", evalRemarks='" + evalRemarks + '\'' +
                '}';
    }
}