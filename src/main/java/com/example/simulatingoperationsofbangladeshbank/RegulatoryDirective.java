package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;
import java.time.LocalDate;

public class RegulatoryDirective implements Serializable {
    private String directiveId;
    private String directiveTitle;
    private LocalDate effectiveDate;
    private String decision;
    private String remarks;

    public RegulatoryDirective(String directiveId, String directiveTitle, LocalDate effectiveDate, String decision, String remarks) {
        this.directiveId = directiveId;
        this.directiveTitle = directiveTitle;
        this.effectiveDate = effectiveDate;
        this.decision = decision;
        this.remarks = remarks;
    }

    public String getDirectiveId() {
        return directiveId;
    }

    public void setDirectiveId(String directiveId) {
        this.directiveId = directiveId;
    }

    public String getDirectiveTitle() {
        return directiveTitle;
    }

    public void setDirectiveTitle(String directiveTitle) {
        this.directiveTitle = directiveTitle;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "RegulatoryDirective{" +
                "directiveId='" + directiveId + '\'' +
                ", directiveTitle='" + directiveTitle + '\'' +
                ", effectiveDate=" + effectiveDate +
                ", decision='" + decision + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
