package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class U3G4_RoutineRequest implements Serializable {
    private String requestId;
    private String requesterId;
    private String status;

    public U3G4_RoutineRequest(String requestId, String requesterId, String status) {
        this.requestId = requestId;
        this.requesterId = requesterId;
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public String getRequesterId() {
        return requesterId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "U3G4_RoutineRequest{" +
                "requestId='" + requestId + '\'' +
                ", requesterId='" + requesterId + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public void approveRequest() {
        this.status = "Approved";
    }
}
