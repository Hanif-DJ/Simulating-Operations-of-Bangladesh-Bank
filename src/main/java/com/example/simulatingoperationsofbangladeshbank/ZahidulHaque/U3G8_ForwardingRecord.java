package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class U3G8_ForwardingRecord implements Serializable {
    private String forwardId;
    private String matterId;
    private String note;
    private String sentAt;
    private String status;

    public U3G8_ForwardingRecord(String forwardId, String matterId, String note, String sentAt, String status) {
        this.forwardId = forwardId;
        this.matterId = matterId;
        this.note = note;
        this.sentAt = sentAt;
        this.status = status;
    }

    @Override
    public String toString() {
        return "U3G8_ForwardingRecord{" +
                "forwardId='" + forwardId + '\'' +
                ", matterId='" + matterId + '\'' +
                ", note='" + note + '\'' +
                ", sentAt='" + sentAt + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public void finalizeReport() {
        this.status = "Finalized";
    }
}
