package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class U3G7_DepartmentProgressReport implements Serializable {
    private String reportId;
    private String period;
    private int completedCount;
    private int pendingCount;
    private int overdueCount;

    public U3G7_DepartmentProgressReport(String reportId, String period, int completedCount, int pendingCount, int overdueCount) {
        this.reportId = reportId;
        this.period = period;
        this.completedCount = completedCount;
        this.pendingCount = pendingCount;
        this.overdueCount = overdueCount;
    }

    @Override
    public String toString() {
        return "U3G7_DepartmentProgressReport{" +
                "reportId='" + reportId + '\'' +
                ", period='" + period + '\'' +
                ", completedCount=" + completedCount +
                ", pendingCount=" + pendingCount +
                ", overdueCount=" + overdueCount +
                '}';
    }

    /*Custom UML Method*/

    public int getTotalTasks() {
        return completedCount + pendingCount + overdueCount;
    }
}
