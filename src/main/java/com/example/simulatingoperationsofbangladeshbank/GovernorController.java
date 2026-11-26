package com.example.simulatingoperationsofbangladeshbank;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

public class GovernorController {
    @javafx.fxml.FXML
    private DatePicker EffectiveDatePicker;
    @javafx.fxml.FXML
    private TableColumn g5DecisionCol;
    @javafx.fxml.FXML
    private TextField g8ObjectivesTextField;
    @javafx.fxml.FXML
    private TextField DeptTextField;
    @javafx.fxml.FXML
    private TableColumn g7StatusCol;
    @javafx.fxml.FXML
    private TableColumn RiskFlagCol;
    @javafx.fxml.FXML
    private TableColumn ReportIdCol;
    @javafx.fxml.FXML
    private TableColumn DirectiveTitleCol;
    @javafx.fxml.FXML
    private TableColumn EffectiveDateCol;
    @javafx.fxml.FXML
    private ComboBox g7StatusComboBox;
    @javafx.fxml.FXML
    private ComboBox DeptComboBox;
    @javafx.fxml.FXML
    private TableColumn RequestIdCol;
    @javafx.fxml.FXML
    private TableColumn DecisionCol;
    @javafx.fxml.FXML
    private TableColumn g8PlanIdCol;
    @javafx.fxml.FXML
    private TextField g4RemarksTextField;
    @javafx.fxml.FXML
    private TextField IndicatorIdTextField;
    @javafx.fxml.FXML
    private TableColumn g8DecisionCol;
    @javafx.fxml.FXML
    private TableColumn ProposalIdCol;
    @javafx.fxml.FXML
    private TableColumn g6TargetCol;
    @javafx.fxml.FXML
    private ComboBox g7SeverityComboBox;
    @javafx.fxml.FXML
    private ComboBox RiskFlagComboBox;
    @javafx.fxml.FXML
    private TableColumn ReqSummaryCol;
    @javafx.fxml.FXML
    private TableColumn DirectiveIdCol;
    @javafx.fxml.FXML
    private TableView MajorDecisionTableView;
    @javafx.fxml.FXML
    private ComboBox g6PeriodComboBox;
    @javafx.fxml.FXML
    private TableColumn GovernorRemarksCol;
    @javafx.fxml.FXML
    private TableColumn IndicatorIdCol;
    @javafx.fxml.FXML
    private ComboBox selectDecisionComboBox;
    @javafx.fxml.FXML
    private TableColumn g6DirectionCol;
    @javafx.fxml.FXML
    private TextField ProposalIdTextField;
    @javafx.fxml.FXML
    private TableColumn g6DeptCol;
    @javafx.fxml.FXML
    private TableColumn g4GovernorRemarksCol;
    @javafx.fxml.FXML
    private ComboBox g7SourceDeptComboBox;
    @javafx.fxml.FXML
    private TableColumn g7DirectionCol;
    @javafx.fxml.FXML
    private TextField StrategicDirectionTextField;
    @javafx.fxml.FXML
    private TableColumn DecisionNoteCol;
    @javafx.fxml.FXML
    private TableColumn g6PeriodCol;
    @javafx.fxml.FXML
    private TableColumn ReportingPeriodCol;
    @javafx.fxml.FXML
    private TextField PolicyTitleTextField;
    @javafx.fxml.FXML
    private TableView ReportTableView;
    @javafx.fxml.FXML
    private TableColumn g7IncidentIdCol;
    @javafx.fxml.FXML
    private TableColumn g3DecisionCol;
    @javafx.fxml.FXML
    private TableView g2StabilityTableView;
    @javafx.fxml.FXML
    private TableColumn DeptCol;
    @javafx.fxml.FXML
    private TableColumn PreparedByCol;
    @javafx.fxml.FXML
    private TextField StrategicTargetTextField;
    @javafx.fxml.FXML
    private TableColumn DepartmentCol;
    @javafx.fxml.FXML
    private TableColumn g7SeverityCol;
    @javafx.fxml.FXML
    private TableColumn g8VersionCol;
    @javafx.fxml.FXML
    private TableView ProposalTableView;
    @javafx.fxml.FXML
    private ComboBox g5DecisionComboBox;
    @javafx.fxml.FXML
    private Label StatusSummaryLabel;
    @javafx.fxml.FXML
    private TableColumn ReportVersionCol;
    @javafx.fxml.FXML
    private TableView PerformanceTableView;
    @javafx.fxml.FXML
    private TextField g7IncidentIdTextField;
    @javafx.fxml.FXML
    private TextField g5RemarksTextField;
    @javafx.fxml.FXML
    private TableColumn g7SourceDeptCol;
    @javafx.fxml.FXML
    private ComboBox g8DecisionComboBox;
    @javafx.fxml.FXML
    private TextField g7DirectionTextField;
    @javafx.fxml.FXML
    private ComboBox DepartmentComboBox;
    @javafx.fxml.FXML
    private TableColumn TitleCol;
    @javafx.fxml.FXML
    private TextField g4ReportVersionTextField;
    @javafx.fxml.FXML
    private TextField GovernorRemarksTextField;
    @javafx.fxml.FXML
    private TableColumn g5RemarksCol;
    @javafx.fxml.FXML
    private ComboBox g4PeriodComboBox;
    @javafx.fxml.FXML
    private TextField DecisonNoteTextField;
    @javafx.fxml.FXML
    private TextField TitleTextField;
    @javafx.fxml.FXML
    private TableColumn g6ActualCol;
    @javafx.fxml.FXML
    private TableColumn g8RemarksCol;
    @javafx.fxml.FXML
    private ComboBox ReportingPeriodComboBox;
    @javafx.fxml.FXML
    private TextField ActualTextField;
    @javafx.fxml.FXML
    private TextField ConditionsTextField;
    @javafx.fxml.FXML
    private TableColumn g8ObjectivesCol;
    @javafx.fxml.FXML
    private ComboBox ReviewStatusComboBox;
    @javafx.fxml.FXML
    private TextField g8PlanIdTextField;
    @javafx.fxml.FXML
    private TextField RequestIdTextField;
    @javafx.fxml.FXML
    private TableColumn ReviewStatusCol;
    @javafx.fxml.FXML
    private TableView DirectiveTableView;
    @javafx.fxml.FXML
    private TableColumn g6RiskRatingCol;
    @javafx.fxml.FXML
    private TableView g7AlertTableView;
    @javafx.fxml.FXML
    private TableView g8PlanTableView;
    @javafx.fxml.FXML
    private TextField ReportIdTextField;
    @javafx.fxml.FXML
    private TextField RequestSummaryTextField;
    @javafx.fxml.FXML
    private TextField PreparedByTextField;
    @javafx.fxml.FXML
    private TableColumn ConditionsCol;
    @javafx.fxml.FXML
    private TextField g8VersionTextField;
    @javafx.fxml.FXML
    private TableColumn g4PeriodCol;
    @javafx.fxml.FXML
    private TextField g8RemarksTextField;
    @javafx.fxml.FXML
    private ComboBox RiskRatingComboBox;
    @javafx.fxml.FXML
    private TextField DirectiveIdTextField;
    @javafx.fxml.FXML
    private ComboBox DecisionComboBox;


    @javafx.fxml.FXML
    public void initialize() {
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
