package com.example.simulatingoperationsofbangladeshbank;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

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

    ArrayList<DepartmentReport>deptReportList=new ArrayList<>();
    ArrayList<SupervisoryInstruction>instructionList=new ArrayList<>();
    ArrayList<PolicyReview>policyReviewList =new ArrayList<>();
    ArrayList<OfficerRecommendation>recList =new ArrayList<>();
    ArrayList<ComplianceRecord>complianceList= new ArrayList<>();
    ArrayList<CoordinationItem>coordList =new ArrayList<>();
    ArrayList<CriticalAlert>issueList= new ArrayList<>();
    ArrayList<DelegatedDecision>delegatedList=new ArrayList<>();

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


    @javafx.fxml.FXML
    public void signOutButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoadIssuesButtonOA(ActionEvent actionEvent) {
        if (issueList.isEmpty()) {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("No issues found");
            alert.showAndWait();
            return;
        }
        String dept=IssueSourceDeptComboBox.getValue();
        String severity=SeverityComboBox.getValue();
        IssueTableView.getItems().clear();
        for (CriticalAlert c:issueList) {
            boolean matchDept=(dept==null)||c.getSourceDept().equalsIgnoreCase(dept);
            boolean matchSeverity =(severity==null)||c.getSeverity().equalsIgnoreCase(severity);
            if (matchDept && matchSeverity){
                IssueTableView.getItems().add(c);
            }
        }
    }

    @javafx.fxml.FXML
    public void LoadReportsButtonOA(ActionEvent actionEvent) {
        if (deptReportList.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("No department reports found.");
            alert.showAndWait();
            return;
        }
        String dept=ReportDeptComboBox.getValue();
        String period=ReportingPeriodComboBox.getValue();
        ReportTableView.getItems().clear();
        for (DepartmentReport r : deptReportList) {
            boolean matchDept=(dept==null)||r.getDepartment().equalsIgnoreCase(dept);
            boolean matchPeriod =(period==null)||r.getReportingPeriod().equalsIgnoreCase(period);
            if (matchDept && matchPeriod) {
                ReportTableView.getItems().add(r);
            }
        }
    }

    @javafx.fxml.FXML
    public void CloseCoordButtonOA(ActionEvent actionEvent) {
        String id = CoordIdTextField.getText();
        if (id.isEmpty()) {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("enter the coordination id");
            alert.showAndWait();
            return;
        }
        boolean found = false;
        for (CoordinationItem c:coordList) {
            if (c.getCoordId().equalsIgnoreCase(id)) {
                found = true;
                break;
            }
        }
        if (!found) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("coordination id not found!");
            alert.showAndWait();
            return;
        }
    }

    @javafx.fxml.FXML
    public void SendInstructionButtonOA(ActionEvent actionEvent) {
        String id = CoordIdTextField.getText();
        String depts = ParticipatingDeptsTextField.getText();
        LocalDate deadline = DeadlineDatePicker.getValue();
        String status = CoordStatusComboBox.getValue();
        String instruction = CoordInstructionTextField.getText();
        if (id.isEmpty()||depts.isEmpty()||deadline==null||status==null||instruction.isEmpty()) {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill in Coordination ID, Participating Depts, Deadline, Status, and Coord. Instruction.");
            alert.showAndWait();
            return;
        }
        if (deadline.isBefore(LocalDate.now())) {
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("deadline cant be past");
            alert.showAndWait();
            return;
        }
        for (CoordinationItem c:coordList){
            if (c.getCoordId().equalsIgnoreCase(id)) {
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setContentText("id is already in the list");
                alert.showAndWait();
                return;
            }
        }
    }

    @javafx.fxml.FXML
    public void LoadRequestsButtonOA(ActionEvent actionEvent) {
        if (delegatedList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("no delegated requests found");
            alert.showAndWait();
            return;
        }
        String dept =DeptComboBox.getValue();
        String decision=DecisionComboBox.getValue();
        DelegatedTableView.getItems().clear();
        for (DelegatedDecision d:delegatedList) {
            boolean matchDept=(dept==null)||d.getDepartment().equalsIgnoreCase(dept);
            boolean matchDecision=(decision==null)||d.getDecision().equalsIgnoreCase(decision);
            if (matchDept &&matchDecision) {
                DelegatedTableView.getItems().add(d);
            }
        }
    }

    @javafx.fxml.FXML
    public void RecConfirmReviewButtonOA(ActionEvent actionEvent) {
        String id = RecIdTextField.getText().trim();
        String dept = RecSourceDeptComboBox.getValue();
        String summary = SummaryTextField.getText().trim();
        String outcome = OutcomeComboBox.getValue();
        String remarks = DGRemarksTextField.getText().trim();
        if (id.isEmpty()||dept==null||summary.isEmpty()||outcome==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill all the +");
            alert.showAndWait();
            return;
        }
        if ((outcome.equals("Returned for Clarification")||outcome.equals("Escalate to Governor"))&&remarks.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Remarks are required");
            alert.showAndWait();
            return;
        }
        for (OfficerRecommendation rec:recList) {
            if (rec.getRecId().equalsIgnoreCase(id)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("recommendation id already exists");
                alert.showAndWait();
                return;
            }
        }
    }

    @javafx.fxml.FXML
    public void CompLoadDecisionsButtonOA(ActionEvent actionEvent) {
        if (complianceList.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("no compliance decisions found");
            alert.showAndWait();
            return;
        }
        String dept=AssignedDeptComboBox.getValue();
        String status=ComplianceStatusComboBox.getValue();
        ComplianceTableView.getItems().clear();
        for (ComplianceRecord c:complianceList) {
            boolean matchDept=(dept==null)||c.getAssignedDept().equalsIgnoreCase(dept);
            boolean matchStatus=(status==null)||c.getComplianceStatus().equalsIgnoreCase(status);
            if (matchDept &&matchStatus){
                ComplianceTableView.getItems().add(c);
            }
        }
    }

    @javafx.fxml.FXML
    public void IssueInstructionButtonOA(ActionEvent actionEvent) {
        String id= InstructionIdTextField.getText();
        String dept= SupDeptComboBox.getValue();
        String priority= PriorityComboBox.getValue();
        LocalDate dueDate =DueDatePicker.getValue();
        String note =InstructionTextField.getText();
        if (id.isEmpty() ||dept == null||priority==null||dueDate==null||note.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill all the req fields");
            alert.showAndWait();
            return;
        }
        if (dueDate.isBefore(LocalDate.now())) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("due date cant be past");
            alert.showAndWait();
            return;
        }
        for (SupervisoryInstruction s: instructionList) {
            if (s.getInstructionId().equalsIgnoreCase(id)){
                Alert alert= new Alert(Alert.AlertType.ERROR);
                alert.setContentText("id is already in the list");
                alert.showAndWait();
                return;
            }
        }
    }

    @javafx.fxml.FXML
    public void DelegatedConfirmDecisionButtonOA(ActionEvent actionEvent) {
        String id = RequestIdTextField.getText().trim();
        String dept = DeptComboBox.getValue();
        String details = DetailsTextField.getText().trim();
        String decision = DecisionComboBox.getValue();
        String remarks = DelegatedRemarksTextField.getText().trim();
        if (id.isEmpty()||dept==null|| details.isEmpty() ||decision==null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill all the fields");
            alert.showAndWait();
            return;
        }
        if ((decision.equals("Rejected")||decision.equals("Returned")||decision.equals("Routed to Governor")) &&remarks.isEmpty()){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Remarks are required");
            alert.showAndWait();
            return;
        }
        for (DelegatedDecision d:delegatedList) {
            if (d.getRequestId().equalsIgnoreCase(id)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("this id is already in the list");
                alert.showAndWait();
                return;
            }
        }
    }

    @javafx.fxml.FXML
    public void SubmitEvalButtonOA(ActionEvent actionEvent) {
        String id = PolicyIdTextField.getText().trim();
        String period = g3PeriodComboBox.getValue();
        String status = g3StatusComboBox.getValue();
        String deviation = DeviationTextField.getText().trim();
        String remarks = EvaluationRemarksTextField.getText().trim();
        if (id.isEmpty()||period==null||status==null||remarks.isEmpty()){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill all the req fields");
            alert.showAndWait();
            return;
        }
        if ((status.equals("Delayed")||status.equals("Deviation Flagged"))&&deviation.isEmpty()){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Deviation Note is required");
            alert.showAndWait();
            return;
        }
        for (PolicyReview pr:policyReviewList){
            if (pr.getPolicyId().equalsIgnoreCase(id) && pr.getReviewPeriod().equalsIgnoreCase(period)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("policy id and review period are already in the list");
                alert.showAndWait();
                return;
            }
        }
    }

    @javafx.fxml.FXML
    public void LoadDecisionButtonOA(ActionEvent actionEvent) {
        if (policyReviewList.isEmpty()){
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("no policy reviews found");
            alert.showAndWait();
            return;
        }
        String period=g3PeriodComboBox.getValue();
        String status= g3StatusComboBox.getValue();
        PolicyTableView.getItems().clear();
        for (PolicyReview pr:policyReviewList) {
            boolean matchPeriod=(period == null)||pr.getReviewPeriod().equalsIgnoreCase(period);
            boolean matchStatus=(status == null)||pr.getImplStatus().equalsIgnoreCase(status);
            if (matchPeriod && matchStatus) {
                PolicyTableView.getItems().add(pr);
            }
        }
    }

    @javafx.fxml.FXML
    public void SubmitReviewButtonOA(ActionEvent actionEvent) {
        String id=ReportIdTextField.getText();
        String dept=ReportDeptComboBox.getValue();
        String period=ReportingPeriodComboBox.getValue();
        String status=ReportStatusComboBox.getValue();
        String remarks=ReportRemarksTextField.getText();
        if (id.isEmpty()||dept==null||period==null||status==null||remarks.isEmpty()){
            Alert alert=new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill the required fields");
            alert.showAndWait();
            return;
        }
        for (DepartmentReport r :deptReportList) {
            if (r.getReportId().equalsIgnoreCase(id)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("duplicate id found");
                alert.showAndWait();
                return;
            }
        }
    }

    @javafx.fxml.FXML
    public void EscalateGovernorButtonOA(ActionEvent actionEvent) {
        String id = IssueIdTextField.getText().trim();
        String dept = IssueSourceDeptComboBox.getValue();
        String severity = SeverityComboBox.getValue();
        String status = IssueStatusComboBox.getValue();
        String assessment = AssessmentTextField.getText().trim();
        if (id.isEmpty()||dept==null||severity==null||status== null ||assessment.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill all the fields");
            alert.showAndWait();
            return;
        }
        for (CriticalAlert c:issueList) {
            if (c.getIncidentId().equalsIgnoreCase(id)) {
                Alert alert= new Alert(Alert.AlertType.ERROR);
                alert.setContentText("issue id is already in the list");
                alert.showAndWait();
                return;
            }
        }
    }

    @javafx.fxml.FXML
    public void SaveComplianceButtonOA(ActionEvent actionEvent) {
        String id = DecisionIdTextField.getText().trim();
        String dept = AssignedDeptComboBox.getValue();
        LocalDate dueDate = ComplianceDueDatePicker.getValue();
        String status = ComplianceStatusComboBox.getValue();
        String finding = FindingTextField.getText().trim();
        if (id.isEmpty() || dept == null || dueDate == null || status == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill all the req fields");
            alert.showAndWait();
            return;
        }
        if ((status.equals("Overdue")||status.equals("Breach Escalated"))&& finding.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("compliance Finding is required");
            alert.showAndWait();
            return;
        }
        for (ComplianceRecord c:complianceList) {
            if (c.getDecisionId().equalsIgnoreCase(id)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("this id is already in the list");
                alert.showAndWait();
                return;
            }
        }
    }

    @javafx.fxml.FXML
    public void LoadRecButtonOA(ActionEvent actionEvent) {
        if (recList.isEmpty()){
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("no officer recommendations found");
            alert.showAndWait();
            return;
        }
        String dept=RecSourceDeptComboBox.getValue();
        String outcome=OutcomeComboBox.getValue();
        RecTableView.getItems().clear();
        for (OfficerRecommendation rec:recList) {
            boolean matchDept =(dept==null) ||rec.getSourceDept().equalsIgnoreCase(dept);
            boolean matchOutcome=(outcome==null)||rec.getReviewOutcome().equalsIgnoreCase(outcome);
            if (matchDept && matchOutcome) {
                RecTableView.getItems().add(rec);
            }
        }
    }

}