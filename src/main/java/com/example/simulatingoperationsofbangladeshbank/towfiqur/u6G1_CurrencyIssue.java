package com.example.simulatingoperationsofbangladeshbank.towfiqur;
import java.io.Serializable;
import java.time.LocalDate;

public class u6G1_CurrencyIssue implements Serializable {
    private static final long serialVersionUID = 1061L;

    private String issueId;
    private String authInstructionRef;
    private int denomination;
    private String series;
    private long quantity;
    private LocalDate issueDate;
    private String receivingFacility;
    private String handoverRef;
    private String ledgerStatus;

    public u6G1_CurrencyIssue() {
    }

    public u6G1_CurrencyIssue(String issueId, String authInstructionRef, int denomination,
                              String series, long quantity, LocalDate issueDate,
                              String receivingFacility, String handoverRef,
                              String ledgerStatus) {
        setIssueId(issueId);
        setAuthInstructionRef(authInstructionRef);
        setDenomination(denomination);
        setSeries(series);
        setQuantity(quantity);
        setIssueDate(issueDate);
        setReceivingFacility(receivingFacility);
        setHandoverRef(handoverRef);
        setLedgerStatus(ledgerStatus);
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        if (issueId == null || issueId.isBlank()) {
            throw new IllegalArgumentException("Issue ID is required.");
        }
        this.issueId = issueId.trim();
    }

    public String getAuthInstructionRef() {
        return authInstructionRef;
    }

    public void setAuthInstructionRef(String authInstructionRef) {
        if (authInstructionRef == null || authInstructionRef.isBlank()) {
            throw new IllegalArgumentException("Authorization instruction reference is required.");
        }
        this.authInstructionRef = authInstructionRef.trim();
    }

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        if (denomination <= 0) {
            throw new IllegalArgumentException("Denomination must be greater than 0.");
        }
        this.denomination = denomination;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        if (series == null || series.isBlank()) {
            throw new IllegalArgumentException("Banknote series is required.");
        }
        this.series = series.trim();
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Issued quantity must be greater than 0.");
        }
        this.quantity = quantity;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        if (issueDate == null) {
            throw new IllegalArgumentException("Issue date cannot be null.");
        }
        this.issueDate = issueDate;
    }

    public String getReceivingFacility() {
        return receivingFacility;
    }

    public void setReceivingFacility(String receivingFacility) {
        if (receivingFacility == null || receivingFacility.isBlank()) {
            throw new IllegalArgumentException("Receiving facility is required.");
        }
        this.receivingFacility = receivingFacility.trim();
    }

    public String getHandoverRef() {
        return handoverRef;
    }

    public void setHandoverRef(String handoverRef) {
        if (handoverRef == null || handoverRef.isBlank()) {
            throw new IllegalArgumentException("Handover reference is required.");
        }
        this.handoverRef = handoverRef.trim();
    }

    public String getLedgerStatus() {
        return ledgerStatus;
    }

    public void setLedgerStatus(String ledgerStatus) {
        this.ledgerStatus = ledgerStatus;
    }



    @Override
    public String toString() {
        return "u6G1_CurrencyIssue [issueId=" + issueId + ", authInstructionRef=" + authInstructionRef +
                ", denomination=" + denomination + ", series=" + series +
                ", quantity=" + quantity + ", issueDate=" + issueDate +
                ", receivingFacility=" + receivingFacility + ", handoverRef=" + handoverRef +
                ", ledgerStatus=" + ledgerStatus + "]";
    }

    // Custom UML / CRA methods
    public boolean isWithinAuthorizedCap(long approvedQuantity) {
        return this.quantity <= approvedQuantity;
    }

    public long totalIssuedValue() {
        return (long) this.denomination * this.quantity;
    }
}