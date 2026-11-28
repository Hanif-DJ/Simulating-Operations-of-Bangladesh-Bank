package com.example.simulatingoperationsofbangladeshbank.towfiqur;
import java.io.Serializable;

public class u6G8_CirculationReport implements Serializable {
    private static final long serialVersionUID = 1068L;

    private String reportId;
    private String period;
    private int denomination;
    private String facilityFilter;
    private long openingBalance;
    private long issuedQty;
    private long withdrawnQty;
    private long destroyedQty;
    private long netTransfersQty;
    private long closingBalance;

    public u6G8_CirculationReport() {
    }

    public u6G8_CirculationReport(String reportId, String period, int denomination,
                                  String facilityFilter, long openingBalance, long issuedQty,
                                  long withdrawnQty, long destroyedQty, long netTransfersQty,
                                  long closingBalance) {
        setReportId(reportId);
        setPeriod(period);
        setDenomination(denomination);
        setFacilityFilter(facilityFilter);
        setOpeningBalance(openingBalance);
        setIssuedQty(issuedQty);
        setWithdrawnQty(withdrawnQty);
        setDestroyedQty(destroyedQty);
        setNetTransfersQty(netTransfersQty);
        setClosingBalance(closingBalance);
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        if (reportId == null || reportId.isBlank()) {
            throw new IllegalArgumentException("Report ID is required.");
        }
        this.reportId = reportId.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        if (period == null || period.isBlank()) {
            throw new IllegalArgumentException("Period is required.");
        }
        this.period = period.trim();
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

    public String getFacilityFilter() {
        return facilityFilter;
    }

    public void setFacilityFilter(String facilityFilter) {
        this.facilityFilter = facilityFilter;
    }

    public long getOpeningBalance() {
        return openingBalance;
    }

    public void setOpeningBalance(long openingBalance) {
        if (openingBalance < 0) {
            throw new IllegalArgumentException("Opening balance cannot be negative.");
        }
        this.openingBalance = openingBalance;
    }

    public long getIssuedQty() {
        return issuedQty;
    }

    public void setIssuedQty(long issuedQty) {
        if (issuedQty < 0) {
            throw new IllegalArgumentException("Issued quantity cannot be negative.");
        }
        this.issuedQty = issuedQty;
    }

    public long getWithdrawnQty() {
        return withdrawnQty;
    }

    public void setWithdrawnQty(long withdrawnQty) {
        if (withdrawnQty < 0) {
            throw new IllegalArgumentException("Withdrawn quantity cannot be negative.");
        }
        this.withdrawnQty = withdrawnQty;
    }

    public long getDestroyedQty() {
        return destroyedQty;
    }

    public void setDestroyedQty(long destroyedQty) {
        if (destroyedQty < 0) {
            throw new IllegalArgumentException("Destroyed quantity cannot be negative.");
        }
        this.destroyedQty = destroyedQty;
    }

    public long getNetTransfersQty() {
        return netTransfersQty;
    }

    public void setNetTransfersQty(long netTransfersQty) {
        this.netTransfersQty = netTransfersQty;
    }

    public long getClosingBalance() {
        return closingBalance;
    }

    public void setClosingBalance(long closingBalance) {
        this.closingBalance = closingBalance;
    }



    @Override
    public String toString() {
        return "u6G8_CirculationReport [reportId=" + reportId + ", period=" + period +
                ", denomination=" + denomination + ", facilityFilter=" + facilityFilter +
                ", openingBalance=" + openingBalance + ", issuedQty=" + issuedQty +
                ", withdrawnQty=" + withdrawnQty + ", destroyedQty=" + destroyedQty +
                ", netTransfersQty=" + netTransfersQty + ", closingBalance=" + closingBalance + "]";
    }

    // Custom UML / CRA methods
    public long computeClosingBalance() {
        this.closingBalance = this.openingBalance + this.issuedQty
                - this.withdrawnQty - this.destroyedQty + this.netTransfersQty;
        return this.closingBalance;
    }

    public long closingCirculationValue() {
        return (long) this.denomination * computeClosingBalance();
    }
}