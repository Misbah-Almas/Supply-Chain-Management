module com.example.supplychainacciomajor {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.supplychainacciomajor to javafx.fxml;
    exports com.example.supplychainacciomajor;
}