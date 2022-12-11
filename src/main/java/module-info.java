module com.example.clackulator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clackulator to javafx.fxml;
    exports com.example.clackulator;
}