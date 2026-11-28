package com.example.simulatingoperationsofbangladeshbank.towfiqur;
import java.io.Serializable;
import java.time.LocalDate;

public class u6G3_Withdrawal implements Serializable {
    private static final long serialVersionUID = 1063L;

    private String withdrawalId;
    private String facility;
    private int denomination;
    private String series;
    private long quantity;
    private LocalDate withdrawalDate;
    private String reason;
    private String status;

    public u6G3_Withdrawal() {
    }

    public u6G3_Withdrawal(String withdrawalId, String facility, int denomination,
                           String series, long quantity, LocalDate withdrawalDate,
                           String reason, String status) {
        setWithdrawalId(withdrawalId);
        setFacility(facility);
        setDenomination(denomination);
        setSeries(series);
        setQuantity(quantity);
        setWithdrawalDate(withdrawalDate);
        setReason(reason);
        setStatus(status);
    }

    public String getWithdrawalId() {
        return withdrawalId;
    }

    public void setWithdrawalId(String withdrawalId) {
        if (withdrawalId == null || withdrawalId.isBlank()) {
            throw new IllegalArgumentException("Withdrawal ID is required.");
        }
        this.withdrawalId = withdrawalId.trim();
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        if (facility == null || facility.isBlank()) {
            throw new IllegalArgumentException("Facility is required.");
        }
        this.facility = facility.trim();
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

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        if (series == null || series.isBlank()) {
            throw new IllegalArgumentException("Series is required.");
        }
        this.series = series.trim();
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

    public LocalDate getWithdrawalDate() {
        return withdrawalDate;
    }

    public void setWithdrawalDate(LocalDate withdrawalDate) {
        if (withdrawalDate == null) {
            throw new IllegalArgumentException("Withdrawal date is required.");
        }
        this.withdrawalDate = withdrawalDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        if (reason == null || reason.isBlank()) {
            throw new IllegalArgumentException("Withdrawal reason is required.");
        }
        this.reason = reason.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "u6G3_Withdrawal [withdrawalId=" + withdrawalId + ", facility=" + facility +
                ", denomination=" + denomination + ", series=" + series +
                ", quantity=" + quantity + ", withdrawalDate=" + withdrawalDate +
                ", reason=" + reason + ", status=" + status + "]";
    }

    // Custom UML / CRA methods
    public boolean hasEnoughStock(long currentStock) {
        return currentStock >= this.quantity;
    }

    public long totalWithdrawnValue() {
        return (long) this.denomination * this.quantity;
    }
}