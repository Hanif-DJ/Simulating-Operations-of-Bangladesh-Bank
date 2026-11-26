package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class U3G6_PerformanceRecord implements Serializable {
    private String recordId;
    private String period;
    private String metrics;
    private String editedBy;

    public U3G6_PerformanceRecord(String recordId, String period, String metrics, String editedBy) {
        this.recordId = recordId;
        this.period = period;
        this.metrics = metrics;
        this.editedBy = editedBy;
    }

    public String getRecordId() {
        return recordId;
    }

    public String getPeriod() {
        return period;
    }

    public String getMetrics() {
        return metrics;
    }

    public String getEditedBy() {
        return editedBy;
    }

    public void setMetrics(String metrics) {
        this.metrics = metrics;
    }

    public void setEditedBy(String editedBy) {
        this.editedBy = editedBy;
    }

    @Override
    public String toString() {
        return "U3G6_PerformanceRecord{" +
                "recordId='" + recordId + '\'' +
                ", period='" + period + '\'' +
                ", metrics='" + metrics + '\'' +
                ", editedBy='" + editedBy + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public void updateMetrics(String newMetrics, String editorId) {
        this.metrics = newMetrics;
        this.editedBy = editorId;
    }
}
