module com.example.screenshotapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires java.desktop;
    requires javafx.swing;


    opens com.example.screenshotapp to javafx.fxml;
    exports com.example.screenshotapp;
}