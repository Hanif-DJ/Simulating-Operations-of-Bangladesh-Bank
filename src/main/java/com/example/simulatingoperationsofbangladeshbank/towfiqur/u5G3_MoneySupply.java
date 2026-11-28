package com.example.simulatingoperationsofbangladeshbank.towfiqur;
import java.io.Serializable;

public class u5G3_MoneySupply implements Serializable {
    private static final long serialVersionUID = 1053L;

    private String statId;
    private String period;
    private double broadMoney;
    private double reserveMoney;
    private String unit;
    private String sourceRef;
    private String assumptions;

    public u5G3_MoneySupply() {
    }

    public u5G3_MoneySupply(String statId, String period, double broadMoney,
                            double reserveMoney, String unit, String sourceRef,
                            String assumptions) {
        setStatId(statId);
        setPeriod(period);
        setBroadMoney(broadMoney);
        setReserveMoney(reserveMoney);
        setUnit(unit);
        setSourceRef(sourceRef);
        setAssumptions(assumptions);
    }

    public String getStatId() {
        return statId;
    }

    public void setStatId(String statId) {
        if (statId == null || statId.isBlank()) {
            throw new IllegalArgumentException("Statistic ID cannot be blank.");
        }
        this.statId = statId.trim();
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        if (period == null || period.isBlank()) {
            throw new IllegalArgumentException("Reporting period cannot be blank.");
        }
        this.period = period.trim();
    }

    public double getBroadMoney() {
        return broadMoney;
    }

    public void setBroadMoney(double broadMoney) {
        if (broadMoney <= 0.0) {
            throw new IllegalArgumentException("Broad money (M2) must be positive.");
        }
        this.broadMoney = broadMoney;
    }

    public double getReserveMoney() {
        return reserveMoney;
    }

    public void setReserveMoney(double reserveMoney) {
        if (reserveMoney <= 0.0) {
            throw new IllegalArgumentException("Reserve money (RM) must be positive.");
        }
        this.reserveMoney = reserveMoney;
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
    public double calculateMultiplier() {
        return broadMoney / reserveMoney;
    }

    public double computeGrowthRate(double priorBroadMoney) {
        if (priorBroadMoney == 0.0) {
            return 0.0;
        }
        return ((broadMoney - priorBroadMoney) / priorBroadMoney) * 100.0;
    }

    @Override
    public String toString() {
        return "u5G3_MoneySupply [statId=" + statId + ", period=" + period +
                ", broadMoney=" + broadMoney + ", reserveMoney=" + reserveMoney +
                ", unit=" + unit + ", sourceRef=" + sourceRef +
                ", assumptions=" + assumptions + "]";
    }

    // uml custom method
    public void enterMoneySupply(String period, java.util.Map<String, Double> values) {
        setPeriod(period);
        if (values != null) {
            if (values.containsKey("broadMoney")) {
                setBroadMoney(values.get("broadMoney"));
            }
            if (values.containsKey("reserveMoney")) {
                setReserveMoney(values.get("reserveMoney"));
            }
        }
    }
}