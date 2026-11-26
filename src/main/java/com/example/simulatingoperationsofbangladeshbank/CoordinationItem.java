package com.example.simulatingoperationsofbangladeshbank;

import java.io.Serializable;
import java.time.LocalDate;

public class CoordinationItem implements Serializable {
    private String coordId;
    private String participatingDepts;
    private LocalDate deadline;
    private String status;
    private String coordInstruction;

    public CoordinationItem(String coordId, String participatingDepts, LocalDate deadline, String status, String coordInstruction) {
        this.coordId = coordId;
        this.participatingDepts = participatingDepts;
        this.deadline = deadline;
        this.status = status;
        this.coordInstruction = coordInstruction;
    }

    public String getCoordId() {
        return coordId;
    }

    public void setCoordId(String coordId) {
        this.coordId = coordId;
    }

    public String getParticipatingDepts() {
        return participatingDepts;
    }

    public void setParticipatingDepts(String participatingDepts) {
        this.participatingDepts = participatingDepts;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCoordInstruction() {
        return coordInstruction;
    }

    public void setCoordInstruction(String coordInstruction) {
        this.coordInstruction = coordInstruction;
    }

    @Override
    public String toString() {
        return "CoordinationItem{" +
                "coordId='" + coordId + '\'' +
                ", participatingDepts='" + participatingDepts + '\'' +
                ", deadline=" + deadline +
                ", status='" + status + '\'' +
                ", coordInstruction='" + coordInstruction + '\'' +
                '}';
    }
}