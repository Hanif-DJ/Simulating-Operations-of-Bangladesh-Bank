package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class U4G1_CommercialBank implements Serializable {
    private String bankId;
    private String name;
    private String registrationNo;
    private String registrationStatus;

    public U4G1_CommercialBank(String bankId, String name, String registrationNo, String registrationStatus) {
        this.bankId = bankId;
        this.name = name;
        this.registrationNo = registrationNo;
        this.registrationStatus = registrationStatus;
    }

    public String getBankId() {
        return bankId;
    }

    public String getName() {
        return name;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public String getRegistrationStatus() {
        return registrationStatus;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegistrationStatus(String registrationStatus) {
        this.registrationStatus = registrationStatus;
    }

    @Override
    public String toString() {
        return "U4G1_CommercialBank{" +
                "bankId='" + bankId + '\'' +
                ", name='" + name + '\'' +
                ", registrationNo='" + registrationNo + '\'' +
                ", registrationStatus='" + registrationStatus + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public boolean isRegistered() {
        if (this.registrationStatus != null && this.registrationStatus.equals("Registered")) {
            return true;
        } else {
            return false;
        }
    }
}
