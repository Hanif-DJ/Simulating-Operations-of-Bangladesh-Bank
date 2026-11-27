module com.example.simulatingoperationsofbangladeshbank {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.simulatingoperationsofbangladeshbank to javafx.fxml;
    opens com.example.simulatingoperationsofbangladeshbank.ZahidulHaque to javafx.fxml, javafx.base;
    exports com.example.simulatingoperationsofbangladeshbank;
    exports com.example.simulatingoperationsofbangladeshbank.ZahidulHaque;
}