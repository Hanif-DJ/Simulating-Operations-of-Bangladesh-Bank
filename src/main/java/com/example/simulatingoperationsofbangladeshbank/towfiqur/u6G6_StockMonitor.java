package com.example.simulatingoperationsofbangladeshbank.towfiqur;

import java.io.Serializable;

public class u6G6_StockMonitor implements Serializable {
    private static final long serialVersionUID = 1066L;

    private String facilityId;
    private String name;
    private int denomination;
    private long currentBalance;
    private long stockThreshold;
    private String lowStockAlert;
    private long replenishmentQty;
    private String alertNote;

    public u6G6_StockMonitor() {
    }

    public u6G6_StockMonitor(String facilityId, String name, int denomination,
                             long currentBalance, long stockThreshold, String lowStockAlert,
                             long replenishmentQty, String alertNote) {
        setFacilityId(facilityId);
        setName(name);
        setDenomination(denomination);
        setCurrentBalance(currentBalance);
        setStockThreshold(stockThreshold);
        setLowStockAlert(lowStockAlert);
        setReplenishmentQty(replenishmentQty);
        setAlertNote(alertNote);
    }

    public String getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(String facilityId) {
        if (facilityId == null || facilityId.isBlank()) {
            throw new IllegalArgumentException("Facility ID is required.");
        }
        this.facilityId = facilityId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Facility name is required.");
        }
        this.name = name.trim();
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

    public long getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(long currentBalance) {
        if (currentBalance < 0) {
            throw new IllegalArgumentException("Current balance cannot be negative.");
        }
        this.currentBalance = currentBalance;
    }

    public long getStockThreshold() {
        return stockThreshold;
    }

    public void setStockThreshold(long stockThreshold) {
        if (stockThreshold < 0) {
            throw new IllegalArgumentException("Stock threshold cannot be negative.");
        }
        this.stockThreshold = stockThreshold;
    }

    public String getLowStockAlert() {
        return lowStockAlert;
    }

    public void setLowStockAlert(String lowStockAlert) {
        this.lowStockAlert = lowStockAlert;
    }

    public long getReplenishmentQty() {
        return replenishmentQty;
    }

    public void setReplenishmentQty(long replenishmentQty) {
        if (replenishmentQty < 0) {
            throw new IllegalArgumentException("Replenishment quantity cannot be negative.");
        }
        this.replenishmentQty = replenishmentQty;
    }

    public String getAlertNote() {
        return alertNote;
    }

    public void setAlertNote(String alertNote) {
        this.alertNote = alertNote;
    }



    @Override
    public String toString() {
        return "u6G6_StockMonitor [facilityId=" + facilityId + ", name=" + name +
                ", denomination=" + denomination + ", currentBalance=" + currentBalance +
                ", stockThreshold=" + stockThreshold + ", lowStockAlert=" + lowStockAlert +
                ", replenishmentQty=" + replenishmentQty + ", alertNote=" + alertNote + "]";
    }

    // Custom UML / CRA methods (includes UML isLowStock())
    public boolean isLowStock() {
        boolean low = this.currentBalance < this.stockThreshold;
        this.lowStockAlert = low ? "Low Stock Alert" : "Normal";
        return low;
    }

    public long shortageQuantity() {
        return Math.max(0L, this.stockThreshold - this.currentBalance);
    }
}