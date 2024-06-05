module com.example.sumativainicial {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.sumativainicial to javafx.fxml;
    exports com.example.sumativainicial;
}