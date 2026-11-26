package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;

public class OperationalPlan implements Serializable {
    private String planId;
    private String version;
    private String strategicObjectives;
    private String decision;
    private String instructions;

    public OperationalPlan(String planId, String version, String strategicObjectives, String decision, String instructions) {
        this.planId = planId;
        this.version = version;
        this.strategicObjectives = strategicObjectives;
        this.decision = decision;
        this.instructions = instructions;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getStrategicObjectives() {
        return strategicObjectives;
    }

    public void setStrategicObjectives(String strategicObjectives) {
        this.strategicObjectives = strategicObjectives;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public String toString() {
        return "OperationalPlan{" +
                "planId='" + planId + '\'' +
                ", version='" + version + '\'' +
                ", strategicObjectives='" + strategicObjectives + '\'' +
                ", decision='" + decision + '\'' +
                ", instructions='" + instructions + '\'' +
                '}';
    }
}