package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class BankSupervisionOfficerController {
    @javafx.fxml.FXML
    private ComboBox<String> g1RegStatusComboBox;
    @javafx.fxml.FXML
    private TextField g1RegNoTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G2_InspectionSchedule, LocalDate> g2DateCol;
    @javafx.fxml.FXML
    private TableColumn<U4G8_SupervisionReport, String> g8PeriodCol;
    @javafx.fxml.FXML
    private TableView<U4G4_ComplianceRecord> g4ComplianceTableView;
    @javafx.fxml.FXML
    private TextField g1BankIdTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G6_CorrectiveAction, String> g6ReqActionCol;
    @javafx.fxml.FXML
    private TableColumn<U4G2_InspectionSchedule, String> g2BankIdCol;
    @javafx.fxml.FXML
    private TableColumn<U4G6_CorrectiveAction, String> g6EvidenceCol;
    @javafx.fxml.FXML
    private TableColumn<U4G8_SupervisionReport, String> g8BankIdCol;
    @javafx.fxml.FXML
    private TableView<U4G1_CommercialBank> g1BankTableView;
    @javafx.fxml.FXML
    private TextField g6ReqActionTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G3_InspectionFinding, String> g3SeverityCol;
    @javafx.fxml.FXML
    private TableView<U4G8_SupervisionReport> g8ReportTableView;
    @javafx.fxml.FXML
    private DatePicker g2InspectionDateDP;
    @javafx.fxml.FXML
    private ComboBox<String> g6StatusComboBox;
    @javafx.fxml.FXML
    private TextField g5EvidenceTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G4_ComplianceRecord, String> g4NoteCol;
    @javafx.fxml.FXML
    private TextField g7RecordIdTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G2_InspectionSchedule, String> g2StatusCol;
    @javafx.fxml.FXML
    private TableColumn<U4G5_BankingViolation, String> g5EvidenceCol;
    @javafx.fxml.FXML
    private TableColumn<U4G7_SupervisionRecord, String> g7HistoryCol;
    @javafx.fxml.FXML
    private ComboBox<String> g2BankIdComboBox;
    @javafx.fxml.FXML
    private TableColumn<U4G8_SupervisionReport, String> g8ReportIdCol;
    @javafx.fxml.FXML
    private TextField g3FindingIdTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G6_CorrectiveAction, String> g6StatusCol;
    @javafx.fxml.FXML
    private TableView<U4G6_CorrectiveAction> g6ActionTableView;
    @javafx.fxml.FXML
    private TableView<U4G2_InspectionSchedule> g2ScheduleTableView;
    @javafx.fxml.FXML
    private TableColumn<U4G1_CommercialBank, String> g1BankIdCol;
    @javafx.fxml.FXML
    private TableColumn<U4G7_SupervisionRecord, String> g7BankIdCol;
    @javafx.fxml.FXML
    private ComboBox<String> g5SeverityComboBox;
    @javafx.fxml.FXML
    private TableColumn<U4G5_BankingViolation, String> g5ViolationIdCol;
    @javafx.fxml.FXML
    private ComboBox<String> g5StatusComboBox;
    @javafx.fxml.FXML
    private TableView<U4G7_SupervisionRecord> g7SupervisionTableView;
    @javafx.fxml.FXML
    private TableColumn<U4G1_CommercialBank, String> g1RegNoCol;
    @javafx.fxml.FXML
    private ComboBox<String> g8PeriodComboBox;
    @javafx.fxml.FXML
    private TableColumn<U4G2_InspectionSchedule, String> g2TeamCol;
    @javafx.fxml.FXML
    private TextField g2TeamTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G1_CommercialBank, String> g1RegStatusCol;
    @javafx.fxml.FXML
    private TableColumn<U4G3_InspectionFinding, String> g3StatusCol;
    @javafx.fxml.FXML
    private TableColumn<U4G7_SupervisionRecord, String> g7RecordIdCol;
    @javafx.fxml.FXML
    private TextField g1BankNameTextField;
    @javafx.fxml.FXML
    private ComboBox<String> g3CategoryComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> g4PeriodComboBox;
    @javafx.fxml.FXML
    private TextArea g7HistoryTextArea;
    @javafx.fxml.FXML
    private TableView<U4G3_InspectionFinding> g3FindingTableView;
    @javafx.fxml.FXML
    private TextField g4ComplianceIdTextField;
    @javafx.fxml.FXML
    private TextField g5ViolationIdTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G2_InspectionSchedule, String> g2ScheduleIdCol;
    @javafx.fxml.FXML
    private TextField g4NoteTextField;
    @javafx.fxml.FXML
    private TextField g6EvidenceTextField;
    @javafx.fxml.FXML
    private TextField g2ScheduleIdTextField;
    @javafx.fxml.FXML
    private DatePicker g6DueDateDP;
    @javafx.fxml.FXML
    private TableColumn<U4G8_SupervisionReport, String> g8StatusCol;
    @javafx.fxml.FXML
    private ComboBox<String> g4StatusComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> g7BankIdComboBox;
    @javafx.fxml.FXML
    private TableColumn<U4G6_CorrectiveAction, String> g6ActionIdCol;
    @javafx.fxml.FXML
    private TextField g8ReportIdTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G5_BankingViolation, String> g5StatusCol;
    @javafx.fxml.FXML
    private TableColumn<U4G3_InspectionFinding, String> g3FindingIdCol;
    @javafx.fxml.FXML
    private TextField g6ActionIdTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G1_CommercialBank, String> g1BankNameCol;
    @javafx.fxml.FXML
    private TextField g3AreaTextField;
    @javafx.fxml.FXML
    private TableColumn<U4G4_ComplianceRecord, String> g4ComplianceIdCol;
    @javafx.fxml.FXML
    private ComboBox<String> g3SeverityComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> g3StatusComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> g8BankIdComboBox;
    @javafx.fxml.FXML
    private TableColumn<U4G4_ComplianceRecord, String> g4PeriodCol;
    @javafx.fxml.FXML
    private TableView<U4G5_BankingViolation> g5ViolationTableView;
    @javafx.fxml.FXML
    private TableColumn<U4G3_InspectionFinding, String> g3AreaCol;
    @javafx.fxml.FXML
    private TableColumn<U4G4_ComplianceRecord, String> g4StatusCol;
    @javafx.fxml.FXML
    private TableColumn<U4G3_InspectionFinding, String> g3CategoryCol;
    @javafx.fxml.FXML
    private TableColumn<U4G5_BankingViolation, String> g5SeverityCol;
    @javafx.fxml.FXML
    private TableColumn<U4G6_CorrectiveAction, LocalDate> g6DueDateCol;

    @javafx.fxml.FXML
    public void initialize() {



    }

    @javafx.fxml.FXML
    public void handleG2ScheduleInspectionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG1RegisterBankButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG5RecordViolationButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG6CorrectiveActionButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleSignOutButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG7UpdateSupervisionRecordButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG8GenerateSupervisionReportButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void handleG3AddInspectionFindingButton(ActionEvent actionEvent) {
    }
}