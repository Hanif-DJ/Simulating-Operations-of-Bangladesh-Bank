package com.example.simulatingoperationsofbangladeshbank.towfiqur;

import java.io.Serializable;

public class u5G6_Comparison implements Serializable {
    private static final long serialVersionUID = 1056L;

    private String indicatorType;
    private String period1;
    private String period2;
    private double period1Value;
    private double period2Value;
    private double difference;
    private String outlierFlag;
    private String analystNote;

    public u5G6_Comparison() {
    }

    public u5G6_Comparison(String indicatorType, String period1, String period2,
                           double period1Value, double period2Value, double difference,
                           String outlierFlag, String analystNote) {
        setIndicatorType(indicatorType);
        setPeriod1(period1);
        setPeriod2(period2);
        setPeriod1Value(period1Value);
        setPeriod2Value(period2Value);
        setDifference(difference);
        setOutlierFlag(outlierFlag);
        setAnalystNote(analystNote);
    }

    public String getIndicatorType() {
        return indicatorType;
    }

    public void setIndicatorType(String indicatorType) {
        if (indicatorType == null || indicatorType.isBlank()) {
            throw new IllegalArgumentException("Indicator type is required.");
        }
        this.indicatorType = indicatorType.trim();
    }

    public String getPeriod1() {
        return period1;
    }

    public void setPeriod1(String period1) {
        if (period1 == null || period1.isBlank()) {
            throw new IllegalArgumentException("First period is required.");
        }
        this.period1 = period1.trim();
    }

    public String getPeriod2() {
        return period2;
    }

    public void setPeriod2(String period2) {
        if (period2 == null || period2.isBlank()) {
            throw new IllegalArgumentException("Second period is required.");
        }
        this.period2 = period2.trim();
    }

    public double getPeriod1Value() {
        return period1Value;
    }

    public void setPeriod1Value(double period1Value) {
        this.period1Value = period1Value;
    }

    public double getPeriod2Value() {
        return period2Value;
    }

    public void setPeriod2Value(double period2Value) {
        this.period2Value = period2Value;
    }

    public double getDifference() {
        return difference;
    }

    public void setDifference(double difference) {
        this.difference = difference;
    }

    public String getOutlierFlag() {
        return outlierFlag;
    }

    public void setOutlierFlag(String outlierFlag) {
        this.outlierFlag = outlierFlag;
    }

    public String getAnalystNote() {
        return analystNote;
    }

    public void setAnalystNote(String analystNote) {
        this.analystNote = analystNote;
    }



    @Override
    public String toString() {
        return "u5G6_Comparison [indicatorType=" + indicatorType + ", period1=" + period1 +
                ", period2=" + period2 + ", period1Value=" + period1Value +
                ", period2Value=" + period2Value + ", difference=" + difference +
                ", outlierFlag=" + outlierFlag + ", analystNote=" + analystNote + "]";
    }

    // Custom UML / CRA methods (includes UML calculate())
    public void calculate() {
        this.difference = this.period2Value - this.period1Value;
        this.outlierFlag = Math.abs(this.difference) > 2.0 ? "Outlier Detected" : "Within Band";
    }

    public double percentageShift() {
        if (this.period1Value == 0.0) {
            return 0.0;
        }
        return ((this.period2Value - this.period1Value) / Math.abs(this.period1Value)) * 100.0;
    }

}