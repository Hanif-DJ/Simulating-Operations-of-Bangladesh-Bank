module com.example.simulatingoperationsofbangladeshbank {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulatingoperationsofbangladeshbank to javafx.fxml;
    exports com.example.simulatingoperationsofbangladeshbank;
}