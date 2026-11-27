package com.example.simulatingoperationsofbangladeshbank;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class GovernorController {
    @javafx.fxml.FXML
    private DatePicker EffectiveDatePicker;
    @javafx.fxml.FXML
    private TableColumn<RegulatoryDirective, String> g5DecisionCol;
    @javafx.fxml.FXML
    private TextField g8ObjectivesTextField;
    @javafx.fxml.FXML
    private TextField DeptTextField;
    @javafx.fxml.FXML
    private TableColumn<CriticalAlert, String> g7StatusCol;
    @javafx.fxml.FXML
    private TableColumn<StabilityIndicator, String> RiskFlagCol;
    @javafx.fxml.FXML
    private TableColumn<InstitutionalReport, String> ReportIdCol;
    @javafx.fxml.FXML
    private TableColumn<RegulatoryDirective, String> DirectiveTitleCol;
    @javafx.fxml.FXML
    private TableColumn<RegulatoryDirective, LocalDate> EffectiveDateCol;
    @javafx.fxml.FXML
    private ComboBox<String> g7StatusComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> DeptComboBox;
    @javafx.fxml.FXML
    private TableColumn<MajorDecision, String> RequestIdCol;
    @javafx.fxml.FXML
    private TableColumn<PolicyProposal, String> DecisionCol;
    @javafx.fxml.FXML
    private TableColumn<OperationalPlan, String> g8PlanIdCol;
    @javafx.fxml.FXML
    private TextField g4RemarksTextField;
    @javafx.fxml.FXML
    private TextField IndicatorIdTextField;
    @javafx.fxml.FXML
    private TableColumn<OperationalPlan, String> g8DecisionCol;
    @javafx.fxml.FXML
    private TableColumn<PolicyProposal, String> ProposalIdCol;
    @javafx.fxml.FXML
    private TableColumn<DepartmentPerformance, String> g6TargetCol;
    @javafx.fxml.FXML
    private ComboBox<String> g7SeverityComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> RiskFlagComboBox;
    @javafx.fxml.FXML
    private TableColumn<MajorDecision, String> ReqSummaryCol;
    @javafx.fxml.FXML
    private TableColumn<RegulatoryDirective, String> DirectiveIdCol;
    @javafx.fxml.FXML
    private TableView<MajorDecision> MajorDecisionTableView;
    @javafx.fxml.FXML
    private ComboBox<String> g6PeriodComboBox;
    @javafx.fxml.FXML
    private TableColumn<StabilityIndicator, String> GovernorRemarksCol;
    @javafx.fxml.FXML
    private TableColumn<StabilityIndicator, String> IndicatorIdCol;
    @javafx.fxml.FXML
    private ComboBox<String> selectDecisionComboBox;
    @javafx.fxml.FXML
    private TableColumn<DepartmentPerformance, String> g6DirectionCol;
    @javafx.fxml.FXML
    private TextField ProposalIdTextField;
    @javafx.fxml.FXML
    private TableColumn<DepartmentPerformance, String> g6DeptCol;
    @javafx.fxml.FXML
    private TableColumn<InstitutionalReport, String> g4GovernorRemarksCol;
    @javafx.fxml.FXML
    private ComboBox<String> g7SourceDeptComboBox;
    @javafx.fxml.FXML
    private TableColumn<CriticalAlert, String> g7DirectionCol;
    @javafx.fxml.FXML
    private TextField StrategicDirectionTextField;
    @javafx.fxml.FXML
    private TableColumn<PolicyProposal, String> DecisionNoteCol;
    @javafx.fxml.FXML
    private TableColumn<DepartmentPerformance, String> g6PeriodCol;
    @javafx.fxml.FXML
    private TableColumn<StabilityIndicator, String> ReportingPeriodCol;
    @javafx.fxml.FXML
    private TextField PolicyTitleTextField;
    @javafx.fxml.FXML
    private TableView<InstitutionalReport> ReportTableView;
    @javafx.fxml.FXML
    private TableColumn<CriticalAlert, String> g7IncidentIdCol;
    @javafx.fxml.FXML
    private TableColumn<MajorDecision, String> g3DecisionCol;
    @javafx.fxml.FXML
    private TableView<StabilityIndicator> g2StabilityTableView;
    @javafx.fxml.FXML
    private TableColumn<MajorDecision, String> DeptCol;
    @javafx.fxml.FXML
    private TableColumn<PolicyProposal, String> PreparedByCol;
    @javafx.fxml.FXML
    private TextField StrategicTargetTextField;
    @javafx.fxml.FXML
    private TableColumn<StabilityIndicator, String> DepartmentCol;
    @javafx.fxml.FXML
    private TableColumn<CriticalAlert, String> g7SeverityCol;
    @javafx.fxml.FXML
    private TableColumn<OperationalPlan, String> g8VersionCol;
    @javafx.fxml.FXML
    private TableView<PolicyProposal> ProposalTableView;
    @javafx.fxml.FXML
    private ComboBox<String> g5DecisionComboBox;
    @javafx.fxml.FXML
    private Label StatusSummaryLabel;
    @javafx.fxml.FXML
    private TableColumn<InstitutionalReport, String> ReportVersionCol;
    @javafx.fxml.FXML
    private TableView<DepartmentPerformance> PerformanceTableView;
    @javafx.fxml.FXML
    private TextField g7IncidentIdTextField;
    @javafx.fxml.FXML
    private TextField g5RemarksTextField;
    @javafx.fxml.FXML
    private TableColumn<CriticalAlert, String> g7SourceDeptCol;
    @javafx.fxml.FXML
    private ComboBox<String> g8DecisionComboBox;
    @javafx.fxml.FXML
    private TextField g7DirectionTextField;
    @javafx.fxml.FXML
    private ComboBox<String> DepartmentComboBox;
    @javafx.fxml.FXML
    private TableColumn<PolicyProposal, String> TitleCol;
    @javafx.fxml.FXML
    private TextField g4ReportVersionTextField;
    @javafx.fxml.FXML
    private TextField GovernorRemarksTextField;
    @javafx.fxml.FXML
    private TableColumn<RegulatoryDirective, String> g5RemarksCol;
    @javafx.fxml.FXML
    private ComboBox<String> g4PeriodComboBox;
    @javafx.fxml.FXML
    private TextField DecisonNoteTextField;
    @javafx.fxml.FXML
    private TextField TitleTextField;
    @javafx.fxml.FXML
    private TableColumn<DepartmentPerformance, String> g6ActualCol;
    @javafx.fxml.FXML
    private TableColumn<OperationalPlan, String> g8RemarksCol;
    @javafx.fxml.FXML
    private ComboBox<String> ReportingPeriodComboBox;
    @javafx.fxml.FXML
    private TextField ActualTextField;
    @javafx.fxml.FXML
    private TextField ConditionsTextField;
    @javafx.fxml.FXML
    private TableColumn<OperationalPlan, String> g8ObjectivesCol;
    @javafx.fxml.FXML
    private ComboBox<String> ReviewStatusComboBox;
    @javafx.fxml.FXML
    private TextField g8PlanIdTextField;
    @javafx.fxml.FXML
    private TextField RequestIdTextField;
    @javafx.fxml.FXML
    private TableColumn<InstitutionalReport, String> ReviewStatusCol;
    @javafx.fxml.FXML
    private TableView<RegulatoryDirective> DirectiveTableView;
    @javafx.fxml.FXML
    private TableColumn<DepartmentPerformance, String> g6RiskRatingCol;
    @javafx.fxml.FXML
    private TableView<CriticalAlert> g7AlertTableView;
    @javafx.fxml.FXML
    private TableView<OperationalPlan> g8PlanTableView;
    @javafx.fxml.FXML
    private TextField ReportIdTextField;
    @javafx.fxml.FXML
    private TextField RequestSummaryTextField;
    @javafx.fxml.FXML
    private TextField PreparedByTextField;
    @javafx.fxml.FXML
    private TableColumn<MajorDecision, String> ConditionsCol;
    @javafx.fxml.FXML
    private TextField g8VersionTextField;
    @javafx.fxml.FXML
    private TableColumn<InstitutionalReport, String> g4PeriodCol;
    @javafx.fxml.FXML
    private TextField g8RemarksTextField;
    @javafx.fxml.FXML
    private ComboBox<String> RiskRatingComboBox;
    @javafx.fxml.FXML
    private TextField DirectiveIdTextField;
    @javafx.fxml.FXML
    private ComboBox<String> DecisionComboBox;


    ArrayList<PolicyProposal> proposalList=new ArrayList<>();
    ArrayList<StabilityIndicator> stabilityList=new ArrayList<>();
    ArrayList<MajorDecision> majorDecisionList=new ArrayList<>();
    ArrayList<InstitutionalReport> reportList=new ArrayList<>();
    ArrayList<RegulatoryDirective> directiveList =new ArrayList<>();
    ArrayList<DepartmentPerformance> performanceList =new ArrayList<>();
    ArrayList<CriticalAlert> alertList =new ArrayList<>();
    ArrayList<OperationalPlan> planList =new ArrayList<>();



    @javafx.fxml.FXML
    public void initialize() {
        selectDecisionComboBox.getItems().addAll("Approved", "Rejected", "Returned for Revision");
        DecisionComboBox.getItems().addAll("Approved", "Rejected", "Returned for Revision");
        g5DecisionComboBox.getItems().addAll("Approved", "Rejected", "Returned for Revision");
        g8DecisionComboBox.getItems().addAll("Approved", "Rejected", "Returned for Revision");
        ReportingPeriodComboBox.getItems().addAll("Q1-2026", "Q2-2026", "Q3-2026", "Q4-2026");
        g4PeriodComboBox.getItems().addAll("Q1-2026", "Q2-2026", "Q3-2026", "Q4-2026");
        g6PeriodComboBox.getItems().addAll("Q1-2026", "Q2-2026", "Q3-2026", "Q4-2026");
        DepartmentComboBox.getItems().addAll("Bank Supervision", "Monetary Policy", "Currency Management", "Foreign Exchange", "Payment Systems");
        DeptComboBox.getItems().addAll("Bank Supervision", "Monetary Policy", "Currency Management", "Foreign Exchange", "Payment Systems");
        g7SourceDeptComboBox.getItems().addAll("Bank Supervision", "Monetary Policy", "Currency Management", "Foreign Exchange", "Payment Systems");
        RiskFlagComboBox.getItems().addAll("Low", "Medium", "High", "Critical");
        RiskRatingComboBox.getItems().addAll("Low", "Medium", "High", "Critical");
        g7SeverityComboBox.getItems().addAll("Low", "Medium", "High", "Critical");
        ReviewStatusComboBox.getItems().addAll("Governor Reviewed", "Correction Requested", "Pending Review");
        g7StatusComboBox.getItems().addAll("Escalated", "Direction Issued", "Resolved");
        ProposalIdCol.setCellValueFactory(new PropertyValueFactory<>("proposalId"));
        TitleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        PreparedByCol.setCellValueFactory(new PropertyValueFactory<>("preparedBy"));
        DecisionCol.setCellValueFactory(new PropertyValueFactory<>("decision"));
        DecisionNoteCol.setCellValueFactory(new PropertyValueFactory<>("decisionNote"));
        IndicatorIdCol.setCellValueFactory(new PropertyValueFactory<>("indicatorId"));
        ReportingPeriodCol.setCellValueFactory(new PropertyValueFactory<>("reportingPeriod"));
        DepartmentCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        RiskFlagCol.setCellValueFactory(new PropertyValueFactory<>("riskFlag"));
        GovernorRemarksCol.setCellValueFactory(new PropertyValueFactory<>("governorRemarks"));
        RequestIdCol.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        DeptCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        ReqSummaryCol.setCellValueFactory(new PropertyValueFactory<>("requestSummary"));
        g3DecisionCol.setCellValueFactory(new PropertyValueFactory<>("decision"));
        ConditionsCol.setCellValueFactory(new PropertyValueFactory<>("conditions"));
        ReportIdCol.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        g4PeriodCol.setCellValueFactory(new PropertyValueFactory<>("period"));
        ReportVersionCol.setCellValueFactory(new PropertyValueFactory<>("reportVersion"));
        ReviewStatusCol.setCellValueFactory(new PropertyValueFactory<>("reviewStatus"));
        g4GovernorRemarksCol.setCellValueFactory(new PropertyValueFactory<>("governorRemarks"));
        DirectiveIdCol.setCellValueFactory(new PropertyValueFactory<>("directiveId"));
        DirectiveTitleCol.setCellValueFactory(new PropertyValueFactory<>("directiveTitle"));
        EffectiveDateCol.setCellValueFactory(new PropertyValueFactory<>("effectiveDate"));
        g5DecisionCol.setCellValueFactory(new PropertyValueFactory<>("decision"));
        g5RemarksCol.setCellValueFactory(new PropertyValueFactory<>("remarks"));
        g6DeptCol.setCellValueFactory(new PropertyValueFactory<>("department"));
        g6PeriodCol.setCellValueFactory(new PropertyValueFactory<>("period"));
        g6TargetCol.setCellValueFactory(new PropertyValueFactory<>("strategicTarget"));
        g6ActualCol.setCellValueFactory(new PropertyValueFactory<>("actualResult"));
        g6RiskRatingCol.setCellValueFactory(new PropertyValueFactory<>("riskRating"));
        g6DirectionCol.setCellValueFactory(new PropertyValueFactory<>("direction"));
        g7IncidentIdCol.setCellValueFactory(new PropertyValueFactory<>("incidentId"));
        g7SourceDeptCol.setCellValueFactory(new PropertyValueFactory<>("sourceDept"));
        g7SeverityCol.setCellValueFactory(new PropertyValueFactory<>("severity"));
        g7StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        g7DirectionCol.setCellValueFactory(new PropertyValueFactory<>("emergencyDirection"));
        g8PlanIdCol.setCellValueFactory(new PropertyValueFactory<>("planId"));
        g8VersionCol.setCellValueFactory(new PropertyValueFactory<>("version"));
        g8ObjectivesCol.setCellValueFactory(new PropertyValueFactory<>("strategicObjectives"));
        g8DecisionCol.setCellValueFactory(new PropertyValueFactory<>("decision"));
        g8RemarksCol.setCellValueFactory(new PropertyValueFactory<>("instructions"));
    }

    @javafx.fxml.FXML
    public void IssueEmergencyDirectionButton(ActionEvent actionEvent) {
        String id = g7IncidentIdTextField.getText();
        String dept = g7SourceDeptComboBox.getValue();
        String severity = g7SeverityComboBox.getValue();
        String status = g7StatusComboBox.getValue();
        String direction = g7DirectionTextField.getText();
        if (id.isEmpty()||dept==null||severity==null||status== null||direction.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill the req fields");
            alert.showAndWait();
            return;
        }
        for (CriticalAlert c : alertList) {
            if (c.getIncidentId().equalsIgnoreCase(id)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("id already exists");
                alert.showAndWait();
                return;
            }
        }
    }

    @javafx.fxml.FXML
    public void SaveReviewButtonOA(ActionEvent actionEvent) {
        String id = ReportIdTextField.getText();
        String period = g4PeriodComboBox.getValue();
        String version = g4ReportVersionTextField.getText();
        String status = ReviewStatusComboBox.getValue();

        // check all the fields
        if (id.isEmpty()||period==null||version.isEmpty()||status == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill in Report ID, Reporting Period, Report Version, and Review Status.");
            alert.showAndWait();
            return;
        }

        // duplicate report id
        for (InstitutionalReport r : reportList) {
            if (r.getReportId().equalsIgnoreCase(id)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("report id already exist");
                alert.showAndWait();
                return;
            }
        }


    }

    @javafx.fxml.FXML
    public void ConfirmPlanButtonOA(ActionEvent actionEvent) {
        String id = g8PlanIdTextField.getText();
        String version = g8VersionTextField.getText();
        String objectives = g8ObjectivesTextField.getText();
        String decision = g8DecisionComboBox.getValue();
        String remarks = g8RemarksTextField.getText();
        if (id.isEmpty()||version.isEmpty()||objectives.isEmpty() || decision==null||remarks.isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill the req fields");
            alert.showAndWait();
            return;
        }
        for (OperationalPlan p : planList) {
            if (p.getPlanId().equalsIgnoreCase(id)&&p.getVersion().equalsIgnoreCase(version)){
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("id is already in the list");
                alert.showAndWait();
                return;
            }
        }
    }

    @javafx.fxml.FXML
    public void g4RequestCorrectionButtonOA(ActionEvent actionEvent) {
        String id = ReportIdTextField.getText();
        String period = g4PeriodComboBox.getValue();
        String version = g4ReportVersionTextField.getText();
        String remarks = g4RemarksTextField.getText();
        // need all fields data
        if (id.isEmpty()||period == null||version.isEmpty()||remarks.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill all the fields");
            alert.showAndWait();
            return;
        }
    }

    @javafx.fxml.FXML
    public void ConfirmReviewButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConfirmAuthButtonOA(ActionEvent actionEvent) {
        String id =RequestIdTextField.getText();
        String dept= DeptTextField.getText();
        String summary=RequestSummaryTextField.getText();
        String decision=DecisionComboBox.getValue();
        String conditions=ConditionsTextField.getText();
        //empty fields
        if (id.isEmpty()||dept.isEmpty()||summary.isEmpty()||decision==null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill all the fields");
            alert.showAndWait();
            return;
        }
        // conditions when rejecting or returning
        if ((decision.equals("Rejected") || decision.equals("Returned for Revision")) && conditions.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("condition need to be fill");
            alert.showAndWait();
            return;
        }
        //duplicate req id
        for (MajorDecision m : majorDecisionList) {
            if (m.getRequestId().equalsIgnoreCase(id)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("req id already exists");
                alert.showAndWait();
                return;
            }
        }

    }

    @javafx.fxml.FXML
    public void ConfirmDirectiveButtonOA(ActionEvent actionEvent) {
        String id = DirectiveIdTextField.getText();
        String title = TitleTextField.getText();
        LocalDate effDate = EffectiveDatePicker.getValue();
        String decision = g5DecisionComboBox.getValue();
        String remarks = g5RemarksTextField.getText();
        if (id.isEmpty() || title.isEmpty() || effDate == null || decision == null || remarks.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill all the fields");
            alert.showAndWait();
            return;
        }
        //effective date cant be in the past date
        if (decision.equals("Approved")&&effDate.isBefore(LocalDate.now())){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("effective Date cant be past date");
            alert.showAndWait();
            return;
        }
        for (RegulatoryDirective d: directiveList) {
            if (d.getDirectiveId().equalsIgnoreCase(id)) {
                Alert alert =new Alert(Alert.AlertType.ERROR);
                alert.setContentText("id already exists");
                alert.showAndWait();
                return;
            }
        }

    }

    @javafx.fxml.FXML
    public void LoadReportButtonOA(ActionEvent actionEvent) {
        if (reportList.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("No institutional reports found.");
            alert.showAndWait();
            return;
        }
        String decision=selectDecisionComboBox.getValue();
        ProposalTableView.getItems().clear();

        for (PolicyProposal p:proposalList) {
            if (decision==null||p.getDecision().equalsIgnoreCase(decision)){
                ProposalTableView.getItems().add(p);
            }
        }
        String period=g4PeriodComboBox.getValue();
        ReportTableView.getItems().clear();
        for (InstitutionalReport r:reportList) {
            if (period==null||r.getPeriod().equalsIgnoreCase(period)){
                ReportTableView.getItems().add(r);
            }
        }
    }

    @javafx.fxml.FXML
    public void LoadOverviewButtonOA(ActionEvent actionEvent) {
        String period = ReportingPeriodComboBox.getValue();
        String dept = DepartmentComboBox.getValue();
        g2StabilityTableView.getItems().clear();
        for (StabilityIndicator s:stabilityList) {
            boolean matchPeriod=(period==null)||s.getReportingPeriod().equalsIgnoreCase(period);
            boolean matchDept =(dept==null)||s.getDepartment().equalsIgnoreCase(dept);
            if (matchPeriod&&matchDept){
                g2StabilityTableView.getItems().add(s);
            }
        }
        StatusSummaryLabel.setText("Status: Loaded " + g2StabilityTableView.getItems().size() + " indicator(s)");
    }

    @javafx.fxml.FXML
    public void SaveDirectionButtonOA(ActionEvent actionEvent) {
        String dept =DeptComboBox.getValue();
        String period=g6PeriodComboBox.getValue();
        String target=StrategicTargetTextField.getText();
        String actual =ActualTextField.getText();
        String risk =RiskRatingComboBox.getValue();
        String direction= StrategicDirectionTextField.getText();

        if (dept==null||period==null||target.isEmpty()||actual.isEmpty()||risk == null||direction.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("fill the req fields");
            alert.showAndWait();
            return;
        }
        //duplicate dept +record
        for (DepartmentPerformance dp : performanceList) {
            if (dp.getDepartment().equalsIgnoreCase(dept)&& dp.getPeriod().equalsIgnoreCase(period)){
                Alert alert=new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Performance record for this Department and Period already exists!");
                alert.showAndWait();
                return;
            }
        }
    }

    @javafx.fxml.FXML
    public void LoadKpiButtonOA(ActionEvent actionEvent) {
        if (performanceList.isEmpty()){
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("No department KPI records found.");
            alert.showAndWait();
            return;
        }
        String dept=DeptComboBox.getValue();
        String period=g6PeriodComboBox.getValue();
        PerformanceTableView.getItems().clear();
        for(DepartmentPerformance dp:performanceList){
            boolean matchDept=(dept==null)||dp.getDepartment().equalsIgnoreCase(dept);
            boolean matchPeriod =(period== null)||dp.getPeriod().equalsIgnoreCase(period);
            if (matchDept&& matchPeriod){
                PerformanceTableView.getItems().add(dp);
            }
        }
    }

    @javafx.fxml.FXML
    public void LoadQueueOA(ActionEvent actionEvent) {
        // Validation: Check if the list is empty
        if (proposalList.isEmpty()) {
            Alert alert =new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("list is empty");
            alert.showAndWait();
            return;
        }

    }

    @javafx.fxml.FXML
    public void ConfirmDecisionOA(ActionEvent actionEvent) {
        String id=ProposalIdTextField.getText();
        String title =PolicyTitleTextField.getText();
        String preparedBy=PreparedByTextField.getText();
        String decision=selectDecisionComboBox.getValue();
        String note =DecisonNoteTextField.getText();
        // empty req fields
        if (id.isEmpty()||title.isEmpty()||preparedBy.isEmpty()||decision == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill all the required box");
            alert.showAndWait();
            return;
        }
        // decision need if rejected or return clicked
        if (decision.equals("Rejected")||decision.equals("Returned for Revision")&&note.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Decision Note is required");
            alert.showAndWait();
            return;
        }
        // for duplicate id
        for (PolicyProposal p: proposalList) {
            if (p.getProposalId().equalsIgnoreCase(id)) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("id is already exists");
                alert.showAndWait();
                return;
            }
        }

    }

    @javafx.fxml.FXML
    public void signOutButtonOA(ActionEvent actionEvent) {
    }
}
