package com.example.simulatingoperationsofbangladeshbank.towfiqur;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class CurrencyManagementOfficer implements Serializable {
    private static final long serialVersionUID = 1L;

    private String custodianId;
    private String officerName;
    private String primaryVault;
    private String shiftCode;
    private LocalDate dutyDate;


    public CurrencyManagementOfficer() {
    }

    public CurrencyManagementOfficer(String custodianId, String officerName, String primaryVault,
                                     String shiftCode, LocalDate dutyDate) {
        setCustodianId(custodianId);
        setOfficerName(officerName);
        setPrimaryVault(primaryVault);
        setShiftCode(shiftCode);
        setDutyDate(dutyDate);
    }

    public String getCustodianId() {
        return custodianId;
    }

    public void setCustodianId(String custodianId) {
        if (custodianId == null || custodianId.trim().isEmpty()) {
            throw new IllegalArgumentException("Custodian ID cannot be empty.");
        }
        this.custodianId = custodianId.trim();
    }

    public String getOfficerName() {
        return officerName;
    }

    public void setOfficerName(String officerName) {
        if (officerName == null || officerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Officer name cannot be empty.");
        }
        this.officerName = officerName.trim();
    }

    public String getPrimaryVault() {
        return primaryVault;
    }

    public void setPrimaryVault(String primaryVault) {
        this.primaryVault = (primaryVault == null || primaryVault.isBlank()) ? "Motijheel Main Vault" : primaryVault.trim();
    }

    public String getShiftCode() {
        return shiftCode;
    }

    public void setShiftCode(String shiftCode) {
        this.shiftCode = (shiftCode == null || shiftCode.isBlank()) ? "DAY-SHIFT" : shiftCode.trim();
    }

    public LocalDate getDutyDate() {
        return dutyDate;
    }

    public void setDutyDate(LocalDate dutyDate) {
        this.dutyDate = (dutyDate == null) ? LocalDate.now() : dutyDate;
    }

    // Custom UML / Domain Methods
    public String formatCustodyLog(String operationName) {
        String op = (operationName == null || operationName.isBlank()) ? "Vault Operation" : operationName.trim();
        return "[CMD-U6 | " + custodianId + " | " + primaryVault + " | " + shiftCode + " | " + dutyDate + "] " + op;
    }

    public boolean canAuthorizeVaultEntry(long pieceCount) {
        return pieceCount > 0 && primaryVault != null && !primaryVault.isBlank();
    }

    @Override
    public String toString() {
        return "CurrencyManagementOfficer{" +
                "custodianId='" + custodianId + '\'' +
                ", officerName='" + officerName + '\'' +
                ", primaryVault='" + primaryVault + '\'' +
                ", shiftCode='" + shiftCode + '\'' +
                ", dutyDate=" + dutyDate +
                '}';
    }


}