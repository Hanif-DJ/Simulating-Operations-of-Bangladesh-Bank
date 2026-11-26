package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class BankSupervisionOfficer implements Serializable {
    private String userId;
    private String name;
    private String departmentId;
    private String assignBankId;


    public BankSupervisionOfficer(String userId, String name, String departmentId, String assignBankId) {
        this.userId = userId;
        this.name = name;
        this.departmentId = departmentId;
        this.assignBankId = assignBankId;
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public String getAssignBankId() {
        return assignBankId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public void setAssignBankId(String assignBankId) {
        this.assignBankId = assignBankId;
    }

    @Override
    public String toString() {
        return "BankSupervisionOfficer{" +
                "userId='" + userId + '\'' +
                ", name='" + name + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", assignBankId='" + assignBankId + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public boolean isAssignedToBank(String targetBankId) {
        if (this.assignBankId != null && this.assignBankId.equals(targetBankId)) {
            return true;
        } else {
            return false;
        }
    }
}
