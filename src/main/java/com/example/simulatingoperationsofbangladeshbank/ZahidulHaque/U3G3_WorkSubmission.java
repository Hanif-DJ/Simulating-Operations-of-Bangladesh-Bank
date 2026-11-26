package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import java.io.Serializable;

public class U3G3_WorkSubmission implements Serializable {
    private String submissionId;
    private String submitterId;
    private String attachments;
    private String status;

    public U3G3_WorkSubmission(String submissionId, String submitterId, String attachments, String status) {
        this.submissionId = submissionId;
        this.submitterId = submitterId;
        this.attachments = attachments;
        this.status = status;
    }

    public String getSubmissionId() {
        return submissionId;
    }

    public String getSubmitterId() {
        return submitterId;
    }

    public String getAttachments() {
        return attachments;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "U3G3_WorkSubmission{" +
                "submissionId='" + submissionId + '\'' +
                ", submitterId='" + submitterId + '\'' +
                ", attachments='" + attachments + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    /*Custom UML Method*/

    public boolean isApproved() {
        if (this.status != null && this.status.equals("Active")) {
            return true;
        } else {
            return false;
        }
    }
}
