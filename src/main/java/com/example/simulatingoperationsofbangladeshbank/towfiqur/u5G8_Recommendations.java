package com.example.simulatingoperationsofbangladeshbank.towfiqur;

import java.io.Serializable;
import java.time.LocalDate;

public class u5G8_Recommendations implements Serializable {
    private static final long serialVersionUID = 1058L;

    private String recommendationId;
    private LocalDate preparedDate;
    private String analysisReportId;
    private String recipient;
    private String text;
    private String expectedImpact;
    private String edStatus;
    private String dgStatus;
    private String governorStatus;

    public u5G8_Recommendations() {
    }

    public u5G8_Recommendations(String recommendationId, LocalDate preparedDate,
                                String analysisReportId, String recipient,
                                String text, String expectedImpact,
                                String edStatus, String dgStatus, String governorStatus) {
        setRecommendationId(recommendationId);
        setPreparedDate(preparedDate);
        setAnalysisReportId(analysisReportId);
        setRecipient(recipient);
        setText(text);
        setExpectedImpact(expectedImpact);
        setEdStatus(edStatus);
        setDgStatus(dgStatus);
        setGovernorStatus(governorStatus);
    }

    public String getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(String recommendationId) {
        if (recommendationId == null || recommendationId.isBlank()) {
            throw new IllegalArgumentException("Recommendation ID is required.");
        }
        this.recommendationId = recommendationId.trim();
    }

    public LocalDate getPreparedDate() {
        return preparedDate;
    }

    public void setPreparedDate(LocalDate preparedDate) {
        if (preparedDate == null) {
            throw new IllegalArgumentException("Prepared date cannot be null.");
        }
        this.preparedDate = preparedDate;
    }

    public String getAnalysisReportId() {
        return analysisReportId;
    }

    public void setAnalysisReportId(String analysisReportId) {
        if (analysisReportId == null || analysisReportId.isBlank()) {
            throw new IllegalArgumentException("Linked analysis report ID is required.");
        }
        this.analysisReportId = analysisReportId.trim();
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        if (recipient == null || recipient.isBlank()) {
            throw new IllegalArgumentException("Recipient is required.");
        }
        this.recipient = recipient.trim();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException("Recommendation text is required.");
        }
        this.text = text.trim();
    }

    public String getExpectedImpact() {
        return expectedImpact;
    }

    public void setExpectedImpact(String expectedImpact) {
        if (expectedImpact == null || expectedImpact.isBlank()) {
            throw new IllegalArgumentException("Expected impact is required.");
        }
        this.expectedImpact = expectedImpact.trim();
    }

    public String getEdStatus() {
        return edStatus;
    }

    public void setEdStatus(String edStatus) {
        this.edStatus = edStatus;
    }

    public String getDgStatus() {
        return dgStatus;
    }

    public void setDgStatus(String dgStatus) {
        this.dgStatus = dgStatus;
    }

    public String getGovernorStatus() {
        return governorStatus;
    }

    public void setGovernorStatus(String governorStatus) {
        this.governorStatus = governorStatus;
    }



    @Override
    public String toString() {
        return "u5G8_Recommendations [recommendationId=" + recommendationId +
                ", preparedDate=" + preparedDate + ", analysisReportId=" + analysisReportId +
                ", recipient=" + recipient + ", text=" + text +
                ", expectedImpact=" + expectedImpact + ", edStatus=" + edStatus +
                ", dgStatus=" + dgStatus + ", governorStatus=" + governorStatus + "]";
    }

    // Custom UML / CRA methods
    public void submitForCompletenessCheck() {
        this.edStatus = "Pending ED Completeness Check";
        this.dgStatus = "Awaiting ED";
        this.governorStatus = "Awaiting DG";
    }

    public boolean isApprovedByGovernor() {
        return "Approved".equalsIgnoreCase(governorStatus);
    }
}