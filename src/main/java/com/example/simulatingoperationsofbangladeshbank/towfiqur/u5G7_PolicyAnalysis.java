package com.example.simulatingoperationsofbangladeshbank.towfiqur;

import java.io.Serializable;

public class u5G7_PolicyAnalysis implements Serializable {
    private static final long serialVersionUID = 1057L;

    private String reportId;
    private String reportingPeriod;
    private String linkedMeetingRef;
    private String linkedDecisionRef;
    private String interpretation;
    private String assumptions;
    private String status;

    public u5G7_PolicyAnalysis() {
    }

    public u5G7_PolicyAnalysis(String reportId, String reportingPeriod, String linkedMeetingRef,
                               String linkedDecisionRef, String interpretation, String assumptions,
                               String status) {
        setReportId(reportId);
        setReportingPeriod(reportingPeriod);
        setLinkedMeetingRef(linkedMeetingRef);
        setLinkedDecisionRef(linkedDecisionRef);
        setInterpretation(interpretation);
        setAssumptions(assumptions);
        setStatus(status);
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        if (reportId == null || reportId.isBlank()) {
            throw new IllegalArgumentException("Analysis report ID is required.");
        }
        this.reportId = reportId.trim();
    }

    public String getReportingPeriod() {
        return reportingPeriod;
    }

    public void setReportingPeriod(String reportingPeriod) {
        if (reportingPeriod == null || reportingPeriod.isBlank()) {
            throw new IllegalArgumentException("Reporting period is required.");
        }
        this.reportingPeriod = reportingPeriod.trim();
    }

    public String getLinkedMeetingRef() {
        return linkedMeetingRef;
    }

    public void setLinkedMeetingRef(String linkedMeetingRef) {
        this.linkedMeetingRef = linkedMeetingRef;
    }

    public String getLinkedDecisionRef() {
        return linkedDecisionRef;
    }

    public void setLinkedDecisionRef(String linkedDecisionRef) {
        this.linkedDecisionRef = linkedDecisionRef;
    }

    public String getInterpretation() {
        return interpretation;
    }

    public void setInterpretation(String interpretation) {
        if (interpretation == null || interpretation.isBlank()) {
            throw new IllegalArgumentException("Analytical interpretation is required.");
        }
        this.interpretation = interpretation.trim();
    }

    public String getAssumptions() {
        return assumptions;
    }

    public void setAssumptions(String assumptions) {
        this.assumptions = assumptions;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "u5G7_PolicyAnalysis [reportId=" + reportId + ", reportingPeriod=" + reportingPeriod +
                ", linkedMeetingRef=" + linkedMeetingRef + ", linkedDecisionRef=" + linkedDecisionRef +
                ", interpretation=" + interpretation + ", assumptions=" + assumptions +
                ", status=" + status + "]";
    }

    // Custom UML / CRA methods
    public void forwardToExecutiveDirector() {
        this.status = "Submitted to ED (User 3)";
    }

    public boolean hasSupportingReferences() {
        return (linkedMeetingRef != null && !linkedMeetingRef.isBlank())
                || (linkedDecisionRef != null && !linkedDecisionRef.isBlank());
    }
}