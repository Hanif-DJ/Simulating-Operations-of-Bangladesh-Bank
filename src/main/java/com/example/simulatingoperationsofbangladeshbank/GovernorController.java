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


    private ArrayList<PolicyProposal> proposalList = new ArrayList<>();
    private ArrayList<StabilityIndicator> stabilityList = new ArrayList<>();
    private ArrayList<MajorDecision> majorDecisionList = new ArrayList<>();
    private ArrayList<InstitutionalReport> reportList = new ArrayList<>();
    private ArrayList<RegulatoryDirective> directiveList = new ArrayList<>();
    private ArrayList<DepartmentPerformance> performanceList = new ArrayList<>();
    private ArrayList<CriticalAlert> alertList = new ArrayList<>();
    private ArrayList<OperationalPlan> planList = new ArrayList<>();



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
    }

    @javafx.fxml.FXML
    public void SaveReviewButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConfirmPlanButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void g4RequestCorrectionButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConfirmReviewButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConfirmAuthButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConfirmDirectiveButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoadReportButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoadOverviewButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void SaveDirectionButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoadKpiButtonOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void LoadQueueOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ConfirmDecisionOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void signOutButtonOA(ActionEvent actionEvent) {
    }
}
