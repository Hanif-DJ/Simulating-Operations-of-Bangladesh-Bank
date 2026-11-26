package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;

public class OfficerRecommendation implements Serializable {
    private String recId;
    private String sourceDept;
    private String summary;
    private String reviewOutcome;
    private String dgRemarks;

    public OfficerRecommendation(String recId, String sourceDept, String summary, String reviewOutcome, String dgRemarks) {
        this.recId = recId;
        this.sourceDept = sourceDept;
        this.summary = summary;
        this.reviewOutcome = reviewOutcome;
        this.dgRemarks = dgRemarks;
    }

    public String getRecId() {
        return recId;
    }

    public void setRecId(String recId) {
        this.recId = recId;
    }

    public String getSourceDept() {
        return sourceDept;
    }

    public void setSourceDept(String sourceDept) {
        this.sourceDept = sourceDept;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getReviewOutcome() {
        return reviewOutcome;
    }

    public void setReviewOutcome(String reviewOutcome) {
        this.reviewOutcome = reviewOutcome;
    }

    public String getDgRemarks() {
        return dgRemarks;
    }

    public void setDgRemarks(String dgRemarks) {
        this.dgRemarks = dgRemarks;
    }

    @Override
    public String toString() {
        return "OfficerRecommendation{" +
                "recId='" + recId + '\'' +
                ", sourceDept='" + sourceDept + '\'' +
                ", summary='" + summary + '\'' +
                ", reviewOutcome='" + reviewOutcome + '\'' +
                ", dgRemarks='" + dgRemarks + '\'' +
                '}';
    }
}