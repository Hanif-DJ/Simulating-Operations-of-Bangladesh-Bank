package com.example.simulatingoperationsofbangladeshbank.towfiqur;

import java.io.Serializable;

public class u5G5_Instruments implements Serializable {
    private static final long serialVersionUID = 1055L;

    private String instrumentId;
    private String name;
    private String effectivePeriod;
    private String reportingCycle;
    private String parameters;
    private String sourceDocRef;
    private String status;

    public u5G5_Instruments() {
    }

    public u5G5_Instruments(String instrumentId, String name, String effectivePeriod,
                            String reportingCycle, String parameters, String sourceDocRef,
                            String status) {
        setInstrumentId(instrumentId);
        setName(name);
        setEffectivePeriod(effectivePeriod);
        setReportingCycle(reportingCycle);
        setParameters(parameters);
        setSourceDocRef(sourceDocRef);
        setStatus(status);
    }

    public String getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(String instrumentId) {
        if (instrumentId == null || instrumentId.isBlank()) {
            throw new IllegalArgumentException("Instrument ID cannot be empty.");
        }
        this.instrumentId = instrumentId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Instrument name cannot be empty.");
        }
        this.name = name.trim();
    }

    public String getEffectivePeriod() {
        return effectivePeriod;
    }

    public void setEffectivePeriod(String effectivePeriod) {
        if (effectivePeriod == null || effectivePeriod.isBlank()) {
            throw new IllegalArgumentException("Effective period is required.");
        }
        this.effectivePeriod = effectivePeriod.trim();
    }

    public String getReportingCycle() {
        return reportingCycle;
    }

    public void setReportingCycle(String reportingCycle) {
        if (reportingCycle == null || reportingCycle.isBlank()) {
            throw new IllegalArgumentException("Reporting cycle is required.");
        }
        this.reportingCycle = reportingCycle.trim();
    }

    public String getParameters() {
        return parameters;
    }

    public void setParameters(String parameters) {
        if (parameters == null || parameters.isBlank()) {
            throw new IllegalArgumentException("Instrument parameters are required.");
        }
        this.parameters = parameters.trim();
    }

    public String getSourceDocRef() {
        return sourceDocRef;
    }

    public void setSourceDocRef(String sourceDocRef) {
        if (sourceDocRef == null || sourceDocRef.isBlank()) {
            throw new IllegalArgumentException("Source document reference is required.");
        }
        this.sourceDocRef = sourceDocRef.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // Custom UML / CRA methods
    public void activateInstrument() {
        this.status = "Active";
    }

    public String catalogueSummary() {
        return instrumentId + " - " + name + " (" + effectivePeriod + ")";
    }

    @Override
    public String toString() {
        return "u5G5_Instruments [instrumentId=" + instrumentId + ", name=" + name +
                ", effectivePeriod=" + effectivePeriod + ", reportingCycle=" + reportingCycle +
                ", parameters=" + parameters + ", sourceDocRef=" + sourceDocRef +
                ", status=" + status + "]";
    }

    //uml custom method
    public void maintainInstrument(String instrumentId) {
        if (instrumentId != null && !instrumentId.isBlank()) {
            this.instrumentId = instrumentId.trim();
            this.status = "Maintained";
        }
    }
}