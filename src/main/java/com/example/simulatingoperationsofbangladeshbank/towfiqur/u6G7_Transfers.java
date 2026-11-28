package com.example.simulatingoperationsofbangladeshbank.towfiqur;

import java.io.Serializable;

public class u6G7_Transfers implements Serializable {
    private static final long serialVersionUID = 1067L;

    private String transferId;
    private String transferDate;
    private String sourceFacility;
    private String destinationFacility;
    private int denomination;
    private long quantity;
    private long receivedQty;
    private String status;

    public u6G7_Transfers() {
    }

    public u6G7_Transfers(String transferId, String transferDate, String sourceFacility,
                          String destinationFacility, int denomination, long quantity,
                          long receivedQty, String status) {
        setTransferId(transferId);
        setTransferDate(transferDate);
        setSourceFacility(sourceFacility);
        setDestinationFacility(destinationFacility);
        setDenomination(denomination);
        setQuantity(quantity);
        setReceivedQty(receivedQty);
        setStatus(status);
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        if (transferId == null || transferId.isBlank()) {
            throw new IllegalArgumentException("Transfer ID is required.");
        }
        this.transferId = transferId.trim();
    }

    public String getTransferDate() {
        return transferDate;
    }

    public void setTransferDate(String transferDate) {
        if (transferDate == null || transferDate.isBlank()) {
            throw new IllegalArgumentException("Transfer date/time is required.");
        }
        this.transferDate = transferDate.trim();
    }

    public String getSourceFacility() {
        return sourceFacility;
    }

    public void setSourceFacility(String sourceFacility) {
        if (sourceFacility == null || sourceFacility.isBlank()) {
            throw new IllegalArgumentException("Source facility is required.");
        }
        this.sourceFacility = sourceFacility.trim();
    }

    public String getDestinationFacility() {
        return destinationFacility;
    }

    public void setDestinationFacility(String destinationFacility) {
        if (destinationFacility == null || destinationFacility.isBlank()) {
            throw new IllegalArgumentException("Destination facility is required.");
        }
        this.destinationFacility = destinationFacility.trim();
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
            throw new IllegalArgumentException("Dispatched quantity must be positive.");
        }
        this.quantity = quantity;
    }

    public long getReceivedQty() {
        return receivedQty;
    }

    public void setReceivedQty(long receivedQty) {
        if (receivedQty < 0) {
            throw new IllegalArgumentException("Received quantity cannot be negative.");
        }
        this.receivedQty = receivedQty;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    @Override
    public String toString() {
        return "u6G7_Transfers [transferId=" + transferId + ", transferDate=" + transferDate +
                ", sourceFacility=" + sourceFacility + ", destinationFacility=" + destinationFacility +
                ", denomination=" + denomination + ", quantity=" + quantity +
                ", receivedQty=" + receivedQty + ", status=" + status + "]";
    }

    // Custom UML / CRA methods
    public boolean hasReceiptDiscrepancy() {
        return this.receivedQty != this.quantity;
    }

    public long discrepancyCount() {
        return this.quantity - this.receivedQty;
    }
}