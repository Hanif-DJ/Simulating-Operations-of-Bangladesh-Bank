package com.example.simulatingoperationsofbangladeshbank.towfiqur;
import java.io.Serializable;

public class u6G4_DamagedNotes implements Serializable {
    private static final long serialVersionUID = 1064L;

    private String submissionId;
    private String branchId;
    private int denomination;
    private long quantity;
    private String status;
    private String custodyRef;
    private String assessmentNote;

    public u6G4_DamagedNotes() {
    }

    public u6G4_DamagedNotes(String submissionId, String branchId, int denomination,
                             long quantity, String status, String custodyRef,
                             String assessmentNote) {
        setSubmissionId(submissionId);
        setBranchId(branchId);
        setDenomination(denomination);
        setQuantity(quantity);
        setStatus(status);
        setCustodyRef(custodyRef);
        setAssessmentNote(assessmentNote);
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public void setSubmissionId(String submissionId) {
        if (submissionId == null || submissionId.isBlank()) {
            throw new IllegalArgumentException("Submission ID is required.");
        }
        this.submissionId = submissionId.trim();
    }

    public String getBranchId() {
        return branchId;
    }

    public void setBranchId(String branchId) {
        if (branchId == null || branchId.isBlank()) {
            throw new IllegalArgumentException("Branch ID is required.");
        }
        this.branchId = branchId.trim();
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        if (denomination <= 0) {
            throw new IllegalArgumentException("Denomination must be positive.");
        }
        this.denomination = denomination;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive.");
        }
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || status.isBlank()) {
            throw new IllegalArgumentException("Status is required.");
        }
        this.status = status.trim();
    }

    public String getCustodyRef() {
        return custodyRef;
    }

    public void setCustodyRef(String custodyRef) {
        if (custodyRef == null || custodyRef.isBlank()) {
            throw new IllegalArgumentException("Custody reference is required.");
        }
        this.custodyRef = custodyRef.trim();
    }

    public String getAssessmentNote() {
        return assessmentNote;
    }

    public void setAssessmentNote(String assessmentNote) {
        this.assessmentNote = assessmentNote;
    }



    @Override
    public String toString() {
        return "u6G4_DamagedNotes [submissionId=" + submissionId + ", branchId=" + branchId +
                ", denomination=" + denomination + ", quantity=" + quantity +
                ", status=" + status + ", custodyRef=" + custodyRef +
                ", assessmentNote=" + assessmentNote + "]";
    }

    // Custom UML / CRA methods
    public void startAssessment(String note) {
        this.status = "Under Assessment";
        this.assessmentNote = note;
    }

    public long damagedFaceValue() {
        return (long) this.denomination * this.quantity;
    }


}