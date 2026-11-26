package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class U4G8_SupervisionReport implements Serializable {
    private String reportId;
    private String bankId;
    private String period;
    private String status;

    public U4G8_SupervisionReport(String reportId, String bankId, String period, String status) {
        this.reportId = reportId;
        this.bankId = bankId;
        this.period = period;
        this.status = status;
    }

    public String getReportId() {
        return reportId;
    }

    public String getBankId() {
        return bankId;
    }

    public String getPeriod() {
        return period;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "U4G8_SupervisionReport{" +
                "reportId='" + reportId + '\'' +
                ", bankId='" + bankId + '\'' +
                ", period='" + period + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public void finalizeReport() {
        this.status = "Finalized";
    }
}
