module com.g7 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.g7 to javafx.fxml;
    exports com.g7;
}
