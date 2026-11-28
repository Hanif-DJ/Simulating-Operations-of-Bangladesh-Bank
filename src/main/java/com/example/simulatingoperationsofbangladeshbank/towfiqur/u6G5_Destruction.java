package com.example.simulatingoperationsofbangladeshbank.towfiqur;

import java.io.Serializable;
import java.time.LocalDate;

public class u6G5_Destruction implements Serializable {
    private static final long serialVersionUID = 1065L;

    private String recordId;
    private String batchId;
    private int denomination;
    private long approvedQty;
    private long destroyedQty;
    private LocalDate destructionDate;
    private String destructionCertRef;
    private String status;

    public u6G5_Destruction() {
    }

    public u6G5_Destruction(String recordId, String batchId, int denomination,
                            long approvedQty, long destroyedQty, LocalDate destructionDate,
                            String destructionCertRef, String status) {
        setRecordId(recordId);
        setBatchId(batchId);
        setDenomination(denomination);
        setApprovedQty(approvedQty);
        setDestroyedQty(destroyedQty);
        setDestructionDate(destructionDate);
        setDestructionCertRef(destructionCertRef);
        setStatus(status);
    }

    public String getRecordId() {
        return recordId;
    }

    public void setRecordId(String recordId) {
        if (recordId == null || recordId.isBlank()) {
            throw new IllegalArgumentException("Record ID is required.");
        }
        this.recordId = recordId.trim();
    }

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        if (batchId == null || batchId.isBlank()) {
            throw new IllegalArgumentException("Batch ID is required.");
        }
        this.batchId = batchId.trim();
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

    public long getApprovedQty() {
        return approvedQty;
    }

    public void setApprovedQty(long approvedQty) {
        if (approvedQty <= 0) {
            throw new IllegalArgumentException("Approved quantity must be positive.");
        }
        this.approvedQty = approvedQty;
    }

    public long getDestroyedQty() {
        return destroyedQty;
    }

    public void setDestroyedQty(long destroyedQty) {
        if (destroyedQty <= 0) {
            throw new IllegalArgumentException("Destroyed quantity must be positive.");
        }
        this.destroyedQty = destroyedQty;
    }

    public LocalDate getDestructionDate() {
        return destructionDate;
    }

    public void setDestructionDate(LocalDate destructionDate) {
        if (destructionDate == null) {
            throw new IllegalArgumentException("Destruction date is required.");
        }
        this.destructionDate = destructionDate;
    }

    public String getDestructionCertRef() {
        return destructionCertRef;
    }

    public void setDestructionCertRef(String destructionCertRef) {
        if (destructionCertRef == null || destructionCertRef.isBlank()) {
            throw new IllegalArgumentException("Destruction certificate reference is required.");
        }
        this.destructionCertRef = destructionCertRef.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "u6G5_Destruction [recordId=" + recordId + ", batchId=" + batchId +
                ", denomination=" + denomination + ", approvedQty=" + approvedQty +
                ", destroyedQty=" + destroyedQty + ", destructionDate=" + destructionDate +
                ", destructionCertRef=" + destructionCertRef + ", status=" + status + "]";
    }

    // Custom UML / CRA methods
    public boolean isValidDestroyedQuantity() {
        return this.destroyedQty <= this.approvedQty;
    }

    public long totalDestroyedAmount() {
        return (long) this.denomination * this.destroyedQty;
    }
}