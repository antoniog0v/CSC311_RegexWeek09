module org.example.csc311_regexweek09 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc311_regexweek09 to javafx.fxml;
    exports org.example.csc311_regexweek09;
}