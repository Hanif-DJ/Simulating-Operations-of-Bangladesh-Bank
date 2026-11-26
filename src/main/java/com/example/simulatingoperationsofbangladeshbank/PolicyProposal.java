package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;

public class PolicyProposal implements Serializable {
    private String proposalId;
    private String title;
    private String preparedBy;
    private String decision;
    private String decisionNote;

    public PolicyProposal(String proposalId, String title, String preparedBy, String decision, String decisionNote) {
        this.proposalId = proposalId;
        this.title = title;
        this.preparedBy = preparedBy;
        this.decision = decision;
        this.decisionNote = decisionNote;
    }

    public String getProposalId() {
        return proposalId;
    }

    public void setProposalId(String proposalId) {
        this.proposalId = proposalId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPreparedBy() {
        return preparedBy;
    }

    public void setPreparedBy(String preparedBy) {
        this.preparedBy = preparedBy;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getDecisionNote() {
        return decisionNote;
    }

    public void setDecisionNote(String decisionNote) {
        this.decisionNote = decisionNote;
    }

    @Override
    public String toString() {
        return "PolicyProposal{" +
                "proposalId='" + proposalId + '\'' +
                ", title='" + title + '\'' +
                ", preparedBy='" + preparedBy + '\'' +
                ", decision='" + decision + '\'' +
                ", decisionNote='" + decisionNote + '\'' +
                '}';
    }
}