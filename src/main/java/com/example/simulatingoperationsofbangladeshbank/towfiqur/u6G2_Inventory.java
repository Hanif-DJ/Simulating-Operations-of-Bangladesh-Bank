package com.example.simulatingoperationsofbangladeshbank.towfiqur;

import java.io.Serializable;

public class u6G2_Inventory implements Serializable {
    private static final long serialVersionUID = 1062L;

    private String facilityId;
    private int denomination;
    private long openingBalance;
    private long incomingQty;
    private long outgoingQty;
    private long inTransitQty;
    private long balance;

    public u6G2_Inventory() {
    }

    public u6G2_Inventory(String facilityId, int denomination, long openingBalance,
                          long incomingQty, long outgoingQty, long inTransitQty,
                          long balance) {
        setFacilityId(facilityId);
        setDenomination(denomination);
        setOpeningBalance(openingBalance);
        setIncomingQty(incomingQty);
        setOutgoingQty(outgoingQty);
        setInTransitQty(inTransitQty);
        setBalance(balance);
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

    public int getDenomination() {
        return denomination;
    }

    public void setDenomination(int denomination) {
        if (denomination <= 0) {
            throw new IllegalArgumentException("Denomination must be positive.");
        }
        this.denomination = denomination;
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

    public long getIncomingQty() {
        return incomingQty;
    }

    public void setIncomingQty(long incomingQty) {
        if (incomingQty < 0) {
            throw new IllegalArgumentException("Incoming quantity cannot be negative.");
        }
        this.incomingQty = incomingQty;
    }

    public long getOutgoingQty() {
        return outgoingQty;
    }

    public void setOutgoingQty(long outgoingQty) {
        if (outgoingQty < 0) {
            throw new IllegalArgumentException("Outgoing quantity cannot be negative.");
        }
        this.outgoingQty = outgoingQty;
    }

    public long getInTransitQty() {
        return inTransitQty;
    }

    public void setInTransitQty(long inTransitQty) {
        if (inTransitQty < 0) {
            throw new IllegalArgumentException("In-transit quantity cannot be negative.");
        }
        this.inTransitQty = inTransitQty;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }



    @Override
    public String toString() {
        return "u6G2_Inventory [facilityId=" + facilityId + ", denomination=" + denomination +
                ", openingBalance=" + openingBalance + ", incomingQty=" + incomingQty +
                ", outgoingQty=" + outgoingQty + ", inTransitQty=" + inTransitQty +
                ", balance=" + balance + "]";
    }

    // Custom UML / CRA methods (includes UML adjust(qty, reason))
    public void adjust(long qty, String reason) {
        if (reason == null || reason.isBlank()) {
            throw new IllegalArgumentException("Adjustment requires an authorized reference/reason.");
        }
        long updated = this.balance + qty;
        if (updated < 0) {
            throw new IllegalStateException("Ledger adjustment would produce negative stock.");
        }
        this.balance = updated;
    }

    public long computeLedgerBalance() {
        this.balance = this.openingBalance + this.incomingQty - this.outgoingQty;
        return this.balance;
    }
}