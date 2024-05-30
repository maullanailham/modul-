module com.example.codelabmod6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.codelabmod6 to javafx.fxml;
    exports com.example.codelabmod6;
}