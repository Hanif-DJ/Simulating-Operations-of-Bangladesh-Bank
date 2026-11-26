package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class U4G7_SupervisionRecord implements Serializable {
    private String recordId;
    private String bankId;
    private String history;

    public U4G7_SupervisionRecord(String recordId, String bankId, String history) {
        this.recordId = recordId;
        this.bankId = bankId;
        this.history = history;
    }

    public String getRecordId() {
        return recordId;
    }

    public String getBankId() {
        return bankId;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "U4G7_SupervisionRecord{" +
                "recordId='" + recordId + '\'' +
                ", bankId='" + bankId + '\'' +
                ", history='" + history + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public void updateRecord(String newEntry) {
        this.history = this.history + " | " + newEntry;
    }
}
