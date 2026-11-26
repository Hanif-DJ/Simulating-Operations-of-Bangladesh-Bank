package com.example.simulatingoperationsofbangladeshbank;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class DeputyGovernorController
{
    @javafx.fxml.FXML
    private ComboBox<String> g3PeriodComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> g3StatusComboBox;
    @javafx.fxml.FXML
    private TableColumn<ComplianceRecord, String> DecisionIdCol;
    @javafx.fxml.FXML
    private TextField ReportRemarksTextField;
    @javafx.fxml.FXML
    private TableColumn<ComplianceRecord, LocalDate> CompDueDateCol;
    @javafx.fxml.FXML
    private ComboBox<String> IssueStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn<CriticalAlert, String> IssueSourceDeptCol;
    @javafx.fxml.FXML
    private ComboBox<String> ComplianceStatusComboBox;
    @javafx.fxml.FXML
    private TableColumn<DelegatedDecision, String> DelegatedDecisionCol;
    @javafx.fxml.FXML
    private TableColumn<DepartmentReport, String> ReportIdCol;
    @javafx.fxml.FXML
    private TableColumn<ComplianceRecord, String> CompFindingCol;
    @javafx.fxml.FXML
    private ComboBox<String> ReportDeptComboBox;
    @javafx.fxml.FXML
    private TableView<CriticalAlert> IssueTableView;
    @javafx.fxml.FXML
    private TableColumn<OfficerRecommendation, String> RecSummaryCol;
    @javafx.fxml.FXML
    private ComboBox<String> DeptComboBox;
    @javafx.fxml.FXML
    private TableColumn<SupervisoryInstruction, String> SupervisoryNoteCol;
    @javafx.fxml.FXML
    private TextField CoordIdTextField;
    @javafx.fxml.FXML
    private TableColumn<OfficerRecommendation, String> DGRemarksCol;
    @javafx.fxml.FXML
    private DatePicker DeadlineDatePicker;
    @javafx.fxml.FXML
    private TableView<PolicyReview> PolicyTableView;
    @javafx.fxml.FXML
    private TableColumn<SupervisoryInstruction, String> InstructionIdCol;
    @javafx.fxml.FXML
    private TextField ParticipatingDeptsTextField;
    @javafx.fxml.FXML
    private TableColumn<SupervisoryInstruction, String> SupDeptCol;
    @javafx.fxml.FXML
    private TableColumn<DelegatedDecision, String> DelegatedDetailsCol;
    @javafx.fxml.FXML
    private TextField DGRemarksTextField;
    @javafx.fxml.FXML
    private TableColumn<OfficerRecommendation, String> ReviewOutcomeCol;
    @javafx.fxml.FXML
    private TextField IssueIdTextField;
    @javafx.fxml.FXML
    private TableColumn<PolicyReview, String> DeviationCol;
    @javafx.fxml.FXML
    private TableColumn<OfficerRecommendation, String> RecSourceDeptCol;
    @javafx.fxml.FXML
    private TableColumn<DepartmentReport, String> ReportingPeriodCol;
    @javafx.fxml.FXML
    private TableColumn<DelegatedDecision, String> DelegatedRemarksCol;
    @javafx.fxml.FXML
    private ComboBox<String> SupDeptComboBox;
    @javafx.fxml.FXML
    private TableColumn<SupervisoryInstruction, String> PrioritylevelCol;
    @javafx.fxml.FXML
    private TableColumn<CoordinationItem, String> CoordStatusCol;
    @javafx.fxml.FXML
    private ComboBox<String> ReportStatusComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> CoordStatusComboBox;
    @javafx.fxml.FXML
    private TextField EvaluationRemarksTextField;
    @javafx.fxml.FXML
    private TableColumn<CriticalAlert, String> IssueIdCol;
    @javafx.fxml.FXML
    private TableView<DepartmentReport> ReportTableView;
    @javafx.fxml.FXML
    private ComboBox<String> PriorityComboBox;
    @javafx.fxml.FXML
    private TableColumn<SupervisoryInstruction, LocalDate> SupDueDateCol;
    @javafx.fxml.FXML
    private TextField DetailsTextField;
    @javafx.fxml.FXML
    private ComboBox<String> AssignedDeptComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> SeverityComboBox;
    @javafx.fxml.FXML
    private TextField SummaryTextField;
    @javafx.fxml.FXML
    private ComboBox<String> OutcomeComboBox;
    @javafx.fxml.FXML
    private TableColumn<CoordinationItem, String> CoordInstructionCol;
    @javafx.fxml.FXML
    private ComboBox<String> IssueSourceDeptComboBox;
    @javafx.fxml.FXML
    private TextField DelegatedRemarksTextField;
    @javafx.fxml.FXML
    private TextField DecisionIdTextField;
    @javafx.fxml.FXML
    private TableView<SupervisoryInstruction> SupervisionTableView;
    @javafx.fxml.FXML
    private TableColumn<ComplianceRecord, String> ComplianceStatusCol;
    @javafx.fxml.FXML
    private TableColumn<DelegatedDecision, String> DelegatedRequestIdCol;
    @javafx.fxml.FXML
    private TextField InstructionIdTextField;
    @javafx.fxml.FXML
    private TableColumn<OfficerRecommendation, String> RecIdCol;
    @javafx.fxml.FXML
    private TableColumn<DelegatedDecision, String> DelegatedDeptCol;
    @javafx.fxml.FXML
    private TableView<ComplianceRecord> ComplianceTableView;
    @javafx.fxml.FXML
    private TableColumn<CoordinationItem, LocalDate> DeadlineCol;
    @javafx.fxml.FXML
    private TableColumn<DepartmentReport, String> ReportDeptCol;
    @javafx.fxml.FXML
    private DatePicker DueDatePicker;
    @javafx.fxml.FXML
    private TableColumn<PolicyReview, String> EvalRemarksCol;
    @javafx.fxml.FXML
    private TableColumn<ComplianceRecord, String> AssignedDeptCol;
    @javafx.fxml.FXML
    private TableColumn<PolicyReview, String> ImplStatusCol;
    @javafx.fxml.FXML
    private TextField PolicyIdTextField;
    @javafx.fxml.FXML
    private TextField FindingTextField;
    @javafx.fxml.FXML
    private ComboBox<String> ReportingPeriodComboBox;
    @javafx.fxml.FXML
    private TextField DeviationTextField;
    @javafx.fxml.FXML
    private ComboBox<String> RecSourceDeptComboBox;
    @javafx.fxml.FXML
    private TableView<DelegatedDecision> DelegatedTableView;
    @javafx.fxml.FXML
    private TableColumn<DepartmentReport, String> ReviewStatusCol;
    @javafx.fxml.FXML
    private TextField RequestIdTextField;
    @javafx.fxml.FXML
    private TableView<CoordinationItem> CoordTableView;
    @javafx.fxml.FXML
    private TableColumn<DepartmentReport, String> RemarksCol;
    @javafx.fxml.FXML
    private TextField RecIdTextField;
    @javafx.fxml.FXML
    private TextField ReportIdTextField;
    @javafx.fxml.FXML
    private TableColumn<CriticalAlert, String> SeverityCol;
    @javafx.fxml.FXML
    private TableColumn<CriticalAlert, String> AssessmentCol;
    @javafx.fxml.FXML
    private TextField CoordInstructionTextField;
    @javafx.fxml.FXML
    private TextField AssessmentTextField;
    @javafx.fxml.FXML
    private TableColumn<PolicyReview, String> PolicyIdCol;
    @javafx.fxml.FXML
    private TableColumn<CoordinationItem, String> ParticipatingDeptsCol;
    @javafx.fxml.FXML
    private TableColumn<CoordinationItem, String> CoordIdCol;
    @javafx.fxml.FXML
    private TableView<OfficerRecommendation> RecTableView;
    @javafx.fxml.FXML
    private DatePicker ComplianceDueDatePicker;
    @javafx.fxml.FXML
    private TextField InstructionTextField;
    @javafx.fxml.FXML
    private TableColumn<PolicyReview, String> ReviewPeriodCol;
    @javafx.fxml.FXML
    private TableColumn<CriticalAlert, String> EscalationStatusCol;
    @javafx.fxml.FXML
    private ComboBox<String> DecisionComboBox;

    @javafx.fxml.FXML
    public void initialize() {

        ReportDeptComboBox.getItems().addAll("Bank Supervision", "Monetary Policy", "Currency Management", "Foreign Exchange", "Payment Systems");
        SupDeptComboBox.getItems().addAll("Bank Supervision", "Monetary Policy", "Currency Management", "Foreign Exchange", "Payment Systems");
        RecSourceDeptComboBox.getItems().addAll("Bank Supervision", "Monetary Policy", "Currency Management", "Foreign Exchange", "Payment Systems");
        AssignedDeptComboBox.getItems().addAll("Bank Supervision", "Monetary Policy", "Currency Management", "Foreign Exchange", "Payment Systems");
        IssueSourceDeptComboBox.getItems().addAll("Bank Supervision", "Monetary Policy", "Currency Management", "Foreign Exchange", "Payment Systems");
        DeptComboBox.getItems().addAll("Bank Supervision", "Monetary Policy", "Currency Management", "Foreign Exchange", "Payment Systems");
        ReportingPeriodComboBox.getItems().addAll("Q1-2026", "Q2-2026", "Q3-2026", "Q4-2026");
        g3PeriodComboBox.getItems().addAll("Q1-2026", "Q2-2026", "Q3-2026", "Q4-2026");
        ReportStatusComboBox.getItems().addAll("Reviewed", "Corrective Action Assigned", "Forwarded to Governor");
        PriorityComboBox.getItems().addAll("Low", "Medium", "High", "Urgent");
        g3StatusComboBox.getItems().addAll("On Track", "Delayed", "Deviation Flagged");
        OutcomeComboBox.getItems().addAll("Accepted", "Returned for Clarification", "Escalate to Governor");
        ComplianceStatusComboBox.getItems().addAll("Compliant", "Partially Completed", "Overdue", "Breach Escalated");
        CoordStatusComboBox.getItems().addAll("Open", "In Progress", "Closed");
        SeverityComboBox.getItems().addAll("Low", "Medium", "High", "Critical");
        IssueStatusComboBox.getItems().addAll("Under Assessment", "Escalated", "Direction Issued");
        DecisionComboBox.getItems().addAll("Approved", "Rejected", "Returned", "Routed to Governor");
        ReportIdCol.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        ReportDeptCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        ReportingPeriodCol.setCellValueFactory(new PropertyValueFactory<>("reportingPeriod"));
        ReviewStatusCol.setCellValueFactory(new PropertyValueFactory<>("reviewStatus"));
        RemarksCol.setCellValueFactory(new PropertyValueFactory<>("remarks"));
        InstructionIdCol.setCellValueFactory(new PropertyValueFactory<>("instructionId"));
        SupDeptCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        PrioritylevelCol.setCellValueFactory(new PropertyValueFactory<>("priorityLevel"));
        SupDueDateCol.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        SupervisoryNoteCol.setCellValueFactory(new PropertyValueFactory<>("supervisoryNote"));
        PolicyIdCol.setCellValueFactory(new PropertyValueFactory<>("policyId"));
        ReviewPeriodCol.setCellValueFactory(new PropertyValueFactory<>("reviewPeriod"));
        ImplStatusCol.setCellValueFactory(new PropertyValueFactory<>("implStatus"));
        DeviationCol.setCellValueFactory(new PropertyValueFactory<>("deviationNote"));
        EvalRemarksCol.setCellValueFactory(new PropertyValueFactory<>("evalRemarks"));
        RecIdCol.setCellValueFactory(new PropertyValueFactory<>("recId"));
        RecSourceDeptCol.setCellValueFactory(new PropertyValueFactory<>("sourceDept"));
        RecSummaryCol.setCellValueFactory(new PropertyValueFactory<>("summary"));
        ReviewOutcomeCol.setCellValueFactory(new PropertyValueFactory<>("reviewOutcome"));
        DGRemarksCol.setCellValueFactory(new PropertyValueFactory<>("dgRemarks"));
        DecisionIdCol.setCellValueFactory(new PropertyValueFactory<>("decisionId"));
        AssignedDeptCol.setCellValueFactory(new PropertyValueFactory<>("assignedDept"));
        CompDueDateCol.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        ComplianceStatusCol.setCellValueFactory(new PropertyValueFactory<>("complianceStatus"));
        CompFindingCol.setCellValueFactory(new PropertyValueFactory<>("complianceFinding"));
        CoordIdCol.setCellValueFactory(new PropertyValueFactory<>("coordId"));
        ParticipatingDeptsCol.setCellValueFactory(new PropertyValueFactory<>("participatingDepts"));
        DeadlineCol.setCellValueFactory(new PropertyValueFactory<>("deadline"));
        CoordStatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        CoordInstructionCol.setCellValueFactory(new PropertyValueFactory<>("coordInstruction"));
        IssueIdCol.setCellValueFactory(new PropertyValueFactory<>("incidentId"));
        IssueSourceDeptCol.setCellValueFactory(new PropertyValueFactory<>("sourceDept"));
        SeverityCol.setCellValueFactory(new PropertyValueFactory<>("severity"));
        EscalationStatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        AssessmentCol.setCellValueFactory(new PropertyValueFactory<>("emergencyDirection"));
        DelegatedRequestIdCol.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        DelegatedDeptCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        DelegatedDetailsCol.setCellValueFactory(new PropertyValueFactory<>("requestDetails"));
        DelegatedDecisionCol.setCellValueFactory(new PropertyValueFactory<>("decision"));
        DelegatedRemarksCol.setCellValueFactory(new PropertyValueFactory<>("remarks"));


    }

    @Deprecated
    public void g6CloseCoordButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g3SubmitEvalButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g1SubmitReviewButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g3LoadPolicyButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g5SaveComplianceButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g5LoadDecisionsButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g7LoadIssuesButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g6SendInstructionButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g1LoadReportsButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g4LoadRecButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g8ConfirmDecisionButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g8LoadRequestsButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g4ConfirmReviewButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g7EscalateGovernorButtonOA(ActionEvent actionEvent) {
    }

    @Deprecated
    public void g2IssueInstructionButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void signOutButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoadIssuesButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoadReportsButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CloseCoordButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SendInstructionButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoadRequestsButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void RecConfirmReviewButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void CompLoadDecisionsButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void IssueInstructionButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void DelegatedConfirmDecisionButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SubmitEvalButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoadDecisionButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SubmitReviewButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void EscalateGovernorButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SaveComplianceButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoadRecButtonOA(ActionEvent actionEvent) {
    }
}