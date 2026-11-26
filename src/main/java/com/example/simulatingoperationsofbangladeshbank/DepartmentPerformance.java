package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;

public class DepartmentPerformance implements Serializable {
    private String department;
    private String period;
    private String strategicTarget;
    private String actualResult;
    private String riskRating;
    private String direction;

    public DepartmentPerformance(String department, String period, String strategicTarget, String actualResult, String riskRating, String direction) {
        this.department = department;
        this.period = period;
        this.strategicTarget = strategicTarget;
        this.actualResult = actualResult;
        this.riskRating = riskRating;
        this.direction = direction;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getStrategicTarget() {
        return strategicTarget;
    }

    public void setStrategicTarget(String strategicTarget) {
        this.strategicTarget = strategicTarget;
    }

    public String getActualResult() {
        return actualResult;
    }

    public void setActualResult(String actualResult) {
        this.actualResult = actualResult;
    }

    public String getRiskRating() {
        return riskRating;
    }

    public void setRiskRating(String riskRating) {
        this.riskRating = riskRating;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "DepartmentPerformance{" +
                "department='" + department + '\'' +
                ", period='" + period + '\'' +
                ", strategicTarget='" + strategicTarget + '\'' +
                ", actualResult='" + actualResult + '\'' +
                ", riskRating='" + riskRating + '\'' +
                ", direction='" + direction + '\'' +
                '}';
    }
}
