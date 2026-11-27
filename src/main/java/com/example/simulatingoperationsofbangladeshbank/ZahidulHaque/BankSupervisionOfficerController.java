package com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

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
    private ComboBox<String> g2StatusComboBox;

    /*ArrayLists for loading objects from .bin files for U4G1 to U4G8*/
    private ArrayList<U4G1_CommercialBank> bankList = new ArrayList<>();
    private ArrayList<U4G2_InspectionSchedule> scheduleList  = new ArrayList<>();
    private ArrayList<U4G3_InspectionFinding> findingList  = new ArrayList<>();
    private ArrayList<U4G4_ComplianceRecord> complianceList  = new ArrayList<>();
    private ArrayList<U4G5_BankingViolation> violationList  = new ArrayList<>();
    private ArrayList<U4G6_CorrectiveAction> actionList  = new ArrayList<>();
    private ArrayList<U4G7_SupervisionRecord> recordList  = new ArrayList<>();
    private ArrayList<U4G1_CommercialBank> reportList  = new ArrayList<>();



    @javafx.fxml.FXML
    public void initialize() {

        /*U4G1_CommercialBank to U4G8_SupervisionReport for all ComboBox and Filtering items*/
        g1RegStatusComboBox.getItems().addAll("Registered", "Pending", "Suspended");
        g2StatusComboBox.getItems().addAll("Scheduled", "In Progress", "Completed", "Canceled", "Postponed");
        g3CategoryComboBox.getItems().addAll("Capital Adequacy", "AML/CFT", "Loan Classification", "IT Security");
        g3SeverityComboBox.getItems().addAll("Low", "Medium", "High", "Critical");
        g3StatusComboBox.getItems().addAll("Open", "Under Review", "Closed");
        g4PeriodComboBox.getItems().addAll("Q1-2026", "Q2-2026", "Q3-2026", "Q4-2026");
        g4StatusComboBox.getItems().addAll("Compliant", "Partially Compliant", "Non-Compliant");
        g5SeverityComboBox.getItems().addAll("Minor", "Major", "Severe");
        g5StatusComboBox.getItems().addAll("Reported", "Penalty Issued", "Resolved");
        g6StatusComboBox.getItems().addAll("Assigned", "In Progress", "Verified");
        g8PeriodComboBox.getItems().addAll("Q1-2026", "Q2-2026", "Q3-2026", "Q4-2026");

        /*U4G1_CommercialBank: String bankId, String name, String registrationNo,
         String registrationStatus
         */
        g1BankIdCol.setCellValueFactory(new PropertyValueFactory<>("bankId"));
        g1BankNameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        g1RegNoCol.setCellValueFactory(new PropertyValueFactory<>("registrationNo"));
        g1RegStatusCol.setCellValueFactory(new PropertyValueFactory<>("registrationStatus"));

        /*U4G2_InspectionSchedule: String scheduleId, String bankId, LocalDate inspectionDate,
         String team, String status
         */
        g2ScheduleIdCol.setCellValueFactory(new PropertyValueFactory<>("scheduleId"));
        g2BankIdCol.setCellValueFactory(new PropertyValueFactory<>("bankId"));
        g2DateCol.setCellValueFactory(new PropertyValueFactory<>("inspectionDate"));
        g2TeamCol.setCellValueFactory(new PropertyValueFactory<>("team"));
        g2StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        /*U4G3_InspectionFinding: String findingId, String area, String category,
         String severity, String status
         */
        g3FindingIdCol.setCellValueFactory(new PropertyValueFactory<>("findingId"));
        g3AreaCol.setCellValueFactory(new PropertyValueFactory<>("area"));
        g3CategoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        g3SeverityCol.setCellValueFactory(new PropertyValueFactory<>("severity"));
        g3StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        /*U4G4_ComplianceRecord: String complianceId, String period, String status, String monitoringNote*/
        g4ComplianceIdCol.setCellValueFactory(new PropertyValueFactory<>("complianceId"));
        g4PeriodCol.setCellValueFactory(new PropertyValueFactory<>("period"));
        g4StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        g4NoteCol.setCellValueFactory(new PropertyValueFactory<>("monitoringNote"));

        /*U4G5_BankingViolation: String violationId, String severity, String evidenceRef, String status*/
        g5ViolationIdCol.setCellValueFactory(new PropertyValueFactory<>("violationId"));
        g5SeverityCol.setCellValueFactory(new PropertyValueFactory<>("severity"));
        g5EvidenceCol.setCellValueFactory(new PropertyValueFactory<>("evidenceRef"));
        g5StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));

        /*U4G6_CorrectiveAction: String actionId, String requiredAction, LocalDate dueDate,
         String status, String evidenceRef
         */
        g6ActionIdCol.setCellValueFactory(new PropertyValueFactory<>("actionId"));
        g6ReqActionCol.setCellValueFactory(new PropertyValueFactory<>("requiredAction"));
        g6DueDateCol.setCellValueFactory(new PropertyValueFactory<>("dueDate"));
        g6StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));
        g6EvidenceCol.setCellValueFactory(new PropertyValueFactory<>("evidenceRef"));

        /*U4G7_SupervisionRecord: String recordId, String bankId, String history*/
        g7RecordIdCol.setCellValueFactory(new PropertyValueFactory<>("recordId"));
        g7BankIdCol.setCellValueFactory(new PropertyValueFactory<>("bankId"));
        g7HistoryCol.setCellValueFactory(new PropertyValueFactory<>("history"));

        /*U4G8_SupervisionReport: String reportId, String bankId, String period, String status*/
        g8ReportIdCol.setCellValueFactory(new PropertyValueFactory<>("reportId"));
        g8BankIdCol.setCellValueFactory(new PropertyValueFactory<>("bankId"));
        g8PeriodCol.setCellValueFactory(new PropertyValueFactory<>("period"));
        g8StatusCol.setCellValueFactory(new PropertyValueFactory<>("status"));



    }

    @javafx.fxml.FXML
    public void handleG2ScheduleInspectionButton(ActionEvent actionEvent) {
        /*U4G2 ScheduleInspectionButton*/
        /*String scheduleId, String bankId, LocalDate inspectionDate, String team, String status*/
        U4G2_InspectionSchedule s = new U4G2_InspectionSchedule(
                g2ScheduleIdTextField.getText(),
                g2BankIdComboBox.getValue(),
                g2InspectionDateDP.getValue(),
                g2TeamTextField.getText(),
                g2StatusComboBox.getValue()
        );

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("U4G2_InspectionSchedule.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(s);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        loadSchedules();
    }

    private void loadSchedules() {
        scheduleList.clear();
        File f = new File("U4G2_InspectionSchedule.bin");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            if (f.exists()) {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                while (true) {
                    U4G2_InspectionSchedule s = (U4G2_InspectionSchedule) ois.readObject();
                    scheduleList.add(s);
                }
            }
        } catch (Exception e) {
            // Reached end of file
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        g2ScheduleTableView.getItems().clear();
        g2ScheduleTableView.getItems().addAll(scheduleList);
    }

    @javafx.fxml.FXML
    public void handleG1RegisterBankButton(ActionEvent actionEvent) {
        /*U4G1 RegisterBankButton*/
        /*String bankId, String name, String registrationNo, String registrationStatus*/
        U4G1_CommercialBank cb = new U4G1_CommercialBank(
                g1BankIdTextField.getText(),
                g1BankIdTextField.getText(),
                g1RegNoTextField.getText(),
                g1RegStatusComboBox.getValue()
        );

        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            f = new File("U4G1_CommercialBank.bin");
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            oos.writeObject(cb);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null) oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        loadBanks();
    }

    private void loadBanks() {
        bankList.clear();
        g2BankIdComboBox.getItems().clear();
        g7BankIdComboBox.getItems().clear();
        g8BankIdComboBox.getItems().clear();



        File f = new File("U4G1_CommercialBank.bin");
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            if (f.exists()) {
                fis = new FileInputStream(f);
                ois = new ObjectInputStream(fis);
                while (true) {
                    U4G1_CommercialBank cb = (U4G1_CommercialBank) ois.readObject();
                    bankList.add(cb);
                    g2BankIdComboBox.getItems().add(cb.getBankId());
                    g7BankIdComboBox.getItems().add(cb.getBankId());
                    g8BankIdComboBox.getItems().add(cb.getBankId());
                }
            }
        } catch (Exception e) {
            //
        } finally {
            try {
                if (ois != null) ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        g1BankTableView.getItems().clear();
        g1BankTableView.getItems().addAll(bankList);
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

    @javafx.fxml.FXML
    public void handleG4ComplianceRecordButton(ActionEvent actionEvent) {
    }
}