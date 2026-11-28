package com.example.simulatingoperationsofbangladeshbank.towfiqur;
import java.io.Serializable;
import java.time.LocalDate;

public class u5G2_PolicyMettngs implements Serializable {
    private static final long serialVersionUID = 1052L;

    private String meetingId;
    private LocalDate meetingDate;
    private String participants;
    private String reportingCycle;
    private String agenda;
    private String linkedDecisionRef;
    private String notes;
    private String minutesDocument;

    public u5G2_PolicyMettngs() {
    }

    public u5G2_PolicyMettngs(String meetingId, LocalDate meetingDate, String participants,
                              String reportingCycle, String agenda, String linkedDecisionRef,
                              String notes, String minutesDocument) {
        setMeetingId(meetingId);
        setMeetingDate(meetingDate);
        setParticipants(participants);
        setReportingCycle(reportingCycle);
        setAgenda(agenda);
        setLinkedDecisionRef(linkedDecisionRef);
        setNotes(notes);
        setMinutesDocument(minutesDocument);
    }

    public String getMeetingId() {
        return meetingId;
    }

    public void setMeetingId(String meetingId) {
        if (meetingId == null || meetingId.isBlank()) {
            throw new IllegalArgumentException("Meeting ID is required.");
        }
        this.meetingId = meetingId.trim();
    }

    public LocalDate getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(LocalDate meetingDate) {
        if (meetingDate == null) {
            throw new IllegalArgumentException("Meeting date is required.");
        }
        this.meetingDate = meetingDate;
    }

    public String getParticipants() {
        return participants;
    }

    public void setParticipants(String participants) {
        if (participants == null || participants.isBlank()) {
            throw new IllegalArgumentException("Participants cannot be empty.");
        }
        this.participants = participants.trim();
    }

    public String getReportingCycle() {
        return reportingCycle;
    }

    public void setReportingCycle(String reportingCycle) {
        if (reportingCycle == null || reportingCycle.isBlank()) {
            throw new IllegalArgumentException("Reporting cycle is required.");
        }
        this.reportingCycle = reportingCycle.trim();
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        if (agenda == null || agenda.isBlank()) {
            throw new IllegalArgumentException("Agenda cannot be empty.");
        }
        this.agenda = agenda.trim();
    }

    public String getLinkedDecisionRef() {
        return linkedDecisionRef;
    }

    public void setLinkedDecisionRef(String linkedDecisionRef) {
        this.linkedDecisionRef = linkedDecisionRef;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getMinutesDocument() {
        return minutesDocument;
    }

    public void setMinutesDocument(String minutesDocument) {
        this.minutesDocument = minutesDocument;
    }

    // Custom UML / CRA methods
    public boolean hasOfficialMinutes() {
        return minutesDocument != null && !minutesDocument.trim().isEmpty();
    }

    public String formatMinutesHeader() {
        return "[" + reportingCycle + "] Meeting " + meetingId + " (" + meetingDate + ")";
    }

    @Override
    public String toString() {
        return "u5G2_PolicyMettngs [meetingId=" + meetingId + ", meetingDate=" + meetingDate +
                ", participants=" + participants + ", reportingCycle=" + reportingCycle +
                ", agenda=" + agenda + ", linkedDecisionRef=" + linkedDecisionRef +
                ", notes=" + notes + ", minutesDocument=" + minutesDocument + "]";
    }

    //Uml custom method
    public void maintainMeetingRecord(u5G2_PolicyMettngs meeting) {
        if (meeting != null) {
            this.meetingId = meeting.getMeetingId();
            this.meetingDate = meeting.getMeetingDate();
            this.participants = meeting.getParticipants();
            this.agenda = meeting.getAgenda();
            this.notes = meeting.getNotes();
        }
    }
}