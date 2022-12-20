module com.example.task07 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.task07 to javafx.fxml;
    exports com.example.task07;
}