package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;
import java.util.ArrayList;

public class ExecutiveDirectorController {
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

    /*ArrayLists for loading objects from .bin files for U3G1 to U3G8*/
    private ArrayList<U3G1_Department> deptList = new ArrayList<>();
    private ArrayList<U3G2_Task> taskList = new ArrayList<>();
    private ArrayList<U3G3_WorkSubmission> subList = new ArrayList<>();
    private ArrayList<U3G4_RoutineRequest> reqList = new ArrayList<>();
    private ArrayList<U3G5_TaskCompletion> completionList = new ArrayList<>();
    private ArrayList<U3G6_PerformanceRecord> perfmList = new ArrayList<>();
    private ArrayList<U3G7_DepartmentProgressReport> reportList = new ArrayList<>();
    private ArrayList<U3G8_ForwardingRecord> forwardList = new ArrayList<>();


    @javafx.fxml.FXML
    public void initialize() {

        /*U3G1_Department to U3G8_ForwardingRecord for all ComboBox & Filtering items*/
        g1StatusComboBox.getItems().addAll("Active", "Inactive");
        g2PriorityComboBox.getItems().addAll("High", "Medium", "Low");
        g3StatusComboBox.getItems().addAll("Approved", "Needs Revision", "Rejected");
        g5FilterStatusComboBox.getItems().addAll("All", "Pending", "Completed");
        g6PeriodComboBox.getItems().addAll("Q1-2026", "Q2-2026", "Q3-2026", "Q4-2026");
        g7PeriodComboBox.getItems().addAll("Q1-2026", "Q2-2026", "Q3-2026", "Q4-2026");

        /*U3G1_Department: String departmentId, String name, String headId, String status*/
        g1DeptIdCol.setCellValueFactory(new PropertyValueFactory<>("departmentId"));
        g1DeptNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        g1HeadIdCol.setCellValueFactory(new PropertyValueFactory<>("headId"));
        g1StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        /*U3G2_Task: String taskId, String title, String priority,
         String assignedTo, LocalDate dueDate, String status*/
        g2TaskIdCol.setCellValueFactory(new PropertyValueFactory<>("taskId"));
        g2TitleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        g2PriorityCol.setCellValueFactory(new PropertyValueFactory<>("priority"));
        g2AssignedToCol.setCellValueFactory(new PropertyValueFactory<>("assignedTo"));
        g2DueDateCol.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        g2StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        /*U3G3_WorkSubmission: String submissionId, String submitterId,
         String attachments, String status*/
        g3SubIdCol.setCellValueFactory(new PropertyValueFactory<>("submissionId"));
        g3SubmitterIdCol.setCellValueFactory(new PropertyValueFactory<>("submitterId"));
        g3AttachmentsCol.setCellValueFactory(new PropertyValueFactory<>("attachments"));
        g3StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        /*U3G4_RoutineRequest: String requestId, String requesterId, String status*/
        g4RequestIdCol.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        g4RequesterIdCol.setCellValueFactory(new PropertyValueFactory<>("requesterId"));
        g4StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        /*U3G5_TaskCompletion: String taskId, String title, String assignedTo,
         LocalDate dueDate, String status
         */
        g5TaskIdCol.setCellValueFactory(new PropertyValueFactory<>("taskId"));
        g5TitleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        g5AssignedToCol.setCellValueFactory(new PropertyValueFactory<>("assignedTo"));
        g5DueDateCol.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        g5StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        /*U3G6_PerformanceRecord: String recordId, String period, String metrics, String editedBy*/
        g6RecordIdCol.setCellValueFactory(new PropertyValueFactory<>("recordId"));
        g6PeriodCol.setCellValueFactory(new PropertyValueFactory<>("period"));
        g6MetricsCol.setCellValueFactory(new PropertyValueFactory<>("metrics"));
        g6EditedByCol.setCellValueFactory(new PropertyValueFactory<>("editedBy"));

        /*U3G7_DepartmentProgress: String reportId, String period, int completedCount,
         int pendingCount, int overdueCount
         */
        g7ReportIdCol.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        g7PeriodCol.setCellValueFactory(new PropertyValueFactory<>("period"));
        g7CompletedCol.setCellValueFactory(new PropertyValueFactory<>("completedCount"));
        g7PendingCol.setCellValueFactory(new PropertyValueFactory<>("pendingCount"));
        g7OverdueCol.setCellValueFactory(new PropertyValueFactory<>("overdueCount"));

        /*U3G8_ForwardingRecord: String forwardId, String matterId, String note,
         String sentAt*/
        g8ForwardIdCol.setCellValueFactory(new PropertyValueFactory<>("forwardId"));
        g8MatterIdCol.setCellValueFactory(new PropertyValueFactory<>("matterId"));
        g8NoteCol.setCellValueFactory(new PropertyValueFactory<>("note"));
        g8SentAtCol.setCellValueFactory(new PropertyValueFactory<>("sentAt"));

        /*
        loadDepartments;
        loadTask;
        loadSubmissions;
        loadRequests;
        loadCompletions;
        loadPerformanceRecords;
        loadProgressReports;
        loadForwardingRecords; */
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
        /*U3G1 SaveButton*/
        /*String departmentId, String name, String headId, String status*/

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