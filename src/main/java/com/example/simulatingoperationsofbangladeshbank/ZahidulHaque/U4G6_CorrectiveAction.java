package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;
import java.time.LocalDate;

public class U4G6_CorrectiveAction implements Serializable {
    private String actionId;
    private String requiredAction;
    private LocalDate dueDate;
    private String status;
    private String evidenceRef;

    public U4G6_CorrectiveAction(String actionId, String requiredAction, LocalDate dueDate, String status, String evidenceRef) {
        this.actionId = actionId;
        this.requiredAction = requiredAction;
        this.dueDate = dueDate;
        this.status = status;
        this.evidenceRef = evidenceRef;
    }

    public String getActionId() {
        return actionId;
    }

    public String getRequiredAction() {
        return requiredAction;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public String getStatus() {
        return status;
    }

    public String getEvidenceRef() {
        return evidenceRef;
    }

    public void setRequiredAction(String requiredAction) {
        this.requiredAction = requiredAction;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setEvidenceRef(String evidenceRef) {
        this.evidenceRef = evidenceRef;
    }

    @Override
    public String toString() {
        return "U4G6_CorrectiveAction{" +
                "actionId='" + actionId + '\'' +
                ", requiredAction='" + requiredAction + '\'' +
                ", dueDate=" + dueDate +
                ", status='" + status + '\'' +
                ", evidenceRef='" + evidenceRef + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public boolean isOverdue(LocalDate today) {
        if (this.dueDate != null && this.dueDate.equals(today)) {
            return true;
        } else {
            return false;
        }
    }
}
