package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class ExecutiveDirectorController
{
    @javafx.fxml.FXML
    private TableColumn<U3G3_WorkSubmission, String> g3SubIdCol;
    @javafx.fxml.FXML
    private TextField g3SubmitterIdTextField;
    @javafx.fxml.FXML
    private TableColumn<U3G6_PerformanceRecord, String> g6RecordIdCol;
    @javafx.fxml.FXML
    private TableColumn<U3G2_Task, String> g2PriorityCol;
    @javafx.fxml.FXML
    private TableView<U3G3_WorkSubmission> g3SubmissionTableView;
    @javafx.fxml.FXML
    private TableColumn<U3G3_WorkSubmission, String> g3AttachmentsCol;
    @javafx.fxml.FXML
    private TextField g3SubIdTextField;
    @javafx.fxml.FXML
    private TableColumn<U3G7_DepartmentProgressReport, Integer> g7PendingCol;
    @javafx.fxml.FXML
    private TableView<U3G5_TaskCompletion> g5MonitorTableView;
    @javafx.fxml.FXML
    private TextField g7OverdueTextField;
    @javafx.fxml.FXML
    private ComboBox<String> g5FilterStatusComboBox;
    @javafx.fxml.FXML
    private TextField g2TaskIdTextField;
    @javafx.fxml.FXML
    private TextField g1DeptIdTextField;
    @javafx.fxml.FXML
    private TableColumn<U3G7_DepartmentProgressReport, String> g7ReportIdCol;
    @javafx.fxml.FXML
    private TextField g7CompletedTextField;
    @javafx.fxml.FXML
    private TableColumn<U3G2_Task, String> g2TitleCol;
    @javafx.fxml.FXML
    private TableColumn<U3G5_TaskCompletion, LocalDate> g5DueDateCol;
    @javafx.fxml.FXML
    private ComboBox<String> g6PeriodComboBox;
    @javafx.fxml.FXML
    private TableColumn<U3G8_ForwardingRecord, String> g8SentAtCol;
    @javafx.fxml.FXML
    private ComboBox<String> g7PeriodComboBox;
    @javafx.fxml.FXML
    private TableColumn<U3G1_Department, String> g1DeptNameCol;
    @javafx.fxml.FXML
    private TableColumn<U3G6_PerformanceRecord, String> g6EditedByCol;
    @javafx.fxml.FXML
    private TableView<U3G1_Department> g1DeptTableView;
    @javafx.fxml.FXML
    private TableView<U3G6_PerformanceRecord> g6PerformanceTableView;
    @javafx.fxml.FXML
    private TableColumn<U3G8_ForwardingRecord, String> g8ForwardIdCol;
    @javafx.fxml.FXML
    private ComboBox<String> g1StatusComboBox;
    @javafx.fxml.FXML
    private TableColumn<U3G6_PerformanceRecord, String> g6PeriodCol;
    @javafx.fxml.FXML
    private TableColumn<U3G2_Task, String> g2StatusCol;
    @javafx.fxml.FXML
    private TableColumn<U3G2_Task, String> g2TaskIdCol;
    @javafx.fxml.FXML
    private TableColumn<U3G7_DepartmentProgressReport, String> g7PeriodCol;
    @javafx.fxml.FXML
    private Label g5SummaryLabel;
    @javafx.fxml.FXML
    private TableView<U3G7_DepartmentProgressReport> g7ReportTableView;
    @javafx.fxml.FXML
    private ComboBox<String> g2PriorityComboBox;
    @javafx.fxml.FXML
    private TableColumn<U3G1_Department, String> g1StatusCol;
    @javafx.fxml.FXML
    private DatePicker g2DueDateDP;
    @javafx.fxml.FXML
    private TextField g8ForwardIdTextField;
    @javafx.fxml.FXML
    private TableColumn<U3G7_DepartmentProgressReport, Integer> g7CompletedCol;
    @javafx.fxml.FXML
    private TextField g1HeadIdTextField;
    @javafx.fxml.FXML
    private TextField g6MetricsTextField;
    @javafx.fxml.FXML
    private TextArea g8NoteTextArea;
    @javafx.fxml.FXML
    private TableColumn<U3G5_TaskCompletion, String> g5TitleCol;
    @javafx.fxml.FXML
    private TableColumn<U3G3_WorkSubmission, String> g3StatusCol;
    @javafx.fxml.FXML
    private TableView<U3G8_ForwardingRecord> g8ForwardTableView;
    @javafx.fxml.FXML
    private TableColumn<U3G8_ForwardingRecord, String> g8NoteCol;
    @javafx.fxml.FXML
    private TextField g6RecordIdTextField;
    @javafx.fxml.FXML
    private TextField g6EditedByTextField;
    @javafx.fxml.FXML
    private TextField g2TitleTextField;
    @javafx.fxml.FXML
    private TableView<U3G4_RoutineRequest> g4RequestTableView;
    @javafx.fxml.FXML
    private TextField g1DeptNameTextField;
    @javafx.fxml.FXML
    private TextField g4RequesterIdTextField;
    @javafx.fxml.FXML
    private TableColumn<U3G1_Department, String> g1DeptIdCol;
    @javafx.fxml.FXML
    private TableView<U3G2_Task> g2TaskTableView;
    @javafx.fxml.FXML
    private TableColumn<U3G7_DepartmentProgressReport, Integer> g7OverdueCol;
    @javafx.fxml.FXML
    private TableColumn<U3G3_WorkSubmission, String> g3SubmitterIdCol;
    @javafx.fxml.FXML
    private TableColumn<U3G5_TaskCompletion, String> g5StatusCol;
    @javafx.fxml.FXML
    private TableColumn<U3G1_Department, String> g1HeadIdCol;
    @javafx.fxml.FXML
    private TableColumn<U3G5_TaskCompletion, String> g5TaskIdCol;
    @javafx.fxml.FXML
    private TableColumn<U3G4_RoutineRequest, String> g4RequesterIdCol;
    @javafx.fxml.FXML
    private TextField g8MatterIdTextField;
    @javafx.fxml.FXML
    private TextField g4RequestIdTextField;
    @javafx.fxml.FXML
    private TableColumn<U3G2_Task, LocalDate> g2DueDateCol;
    @javafx.fxml.FXML
    private TextField g2AssignedToTextField;
    @javafx.fxml.FXML
    private TableColumn<U3G2_Task, String> g2AssignedToCol;
    @javafx.fxml.FXML
    private ComboBox<String> g3StatusComboBox;
    @javafx.fxml.FXML
    private TextField g7PendingTextField;
    @javafx.fxml.FXML
    private TableColumn<U3G4_RoutineRequest, String> g4RequestIdCol;
    @javafx.fxml.FXML
    private TableColumn<U3G4_RoutineRequest, String> g4StatusCol;
    @javafx.fxml.FXML
    private TableColumn<U3G5_TaskCompletion, String> g5AssignedToCol;
    @javafx.fxml.FXML
    private TableColumn<U3G6_PerformanceRecord, String> g6MetricsCol;
    @javafx.fxml.FXML
    private TableColumn<U3G8_ForwardingRecord, String> g8MatterIdCol;

    @javafx.fxml.FXML
    public void initialize() {



    }

    @javafx.fxml.FXML
    public void handleG2ValidateAndAssignTaskButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG8ForwardButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG4ApproveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG5VerifySelectedTaskCompletionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG1SaveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSignOutButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG7GenerateProgressReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG4RejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG6AddAndUpdateRecordButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG3ReviewButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG5FilterAndLoadTaskButton(ActionEvent actionEvent) {
    }
}