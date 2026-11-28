package com.example.simulatingoperationsofbangladeshbank.towfiqur;

import java.io.Serializable;

public class u5G4_Inflation implements Serializable {
    private static final long serialVersionUID = 1054L;

    private String indicatorId;
    private String name;
    private String period;
    private double value;
    private String unit;
    private String sourceRef;
    private String assumptions;

    public u5G4_Inflation() {
    }

    public u5G4_Inflation(String indicatorId, String name, String period,
                          double value, String unit, String sourceRef,
                          String assumptions) {
        setIndicatorId(indicatorId);
        setName(name);
        setPeriod(period);
        setValue(value);
        setUnit(unit);
        setSourceRef(sourceRef);
        setAssumptions(assumptions);
    }

    public String getIndicatorId() {
        return indicatorId;
    }

    public void setIndicatorId(String indicatorId) {
        if (indicatorId == null || indicatorId.isBlank()) {
            throw new IllegalArgumentException("Indicator ID is required.");
        }
        this.indicatorId = indicatorId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Indicator name is required.");
        }
        this.name = name.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        if (period == null || period.isBlank()) {
            throw new IllegalArgumentException("Period is required.");
        }
        this.period = period.trim();
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value < -25.0 || value > 120.0) {
            throw new IllegalArgumentException("Inflation rate outside realistic range.");
        }
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        if (unit == null || unit.isBlank()) {
            throw new IllegalArgumentException("Unit is required.");
        }
        this.unit = unit.trim();
    }

    public String getSourceRef() {
        return sourceRef;
    }

    public void setSourceRef(String sourceRef) {
        if (sourceRef == null || sourceRef.isBlank()) {
            throw new IllegalArgumentException("Source reference is required.");
        }
        this.sourceRef = sourceRef.trim();
    }

    public String getAssumptions() {
        return assumptions;
    }

    public void setAssumptions(String assumptions) {
        this.assumptions = assumptions;
    }

    // Custom UML / CRA methods
    public boolean isUnusualShift(double priorValue, double threshold) {
        return Math.abs(this.value - priorValue) >= threshold;
    }

    public double deviationFromTarget(double targetInflation) {
        return this.value - targetInflation;
    }

    @Override
    public String toString() {
        return "u5G4_Inflation [indicatorId=" + indicatorId + ", name=" + name +
                ", period=" + period + ", value=" + value + ", unit=" + unit +
                ", sourceRef=" + sourceRef + ", assumptions=" + assumptions + "]";
    }

    //uml custom method
    public void trackInflation(String indicator) {
        if (indicator != null && !indicator.isBlank()) {
            this.name = indicator.trim();
        }
    }
}