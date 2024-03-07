module org.example.csc325_colorchooserapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc325_colorchooserapp to javafx.fxml;
    exports org.example.csc325_colorchooserapp;
}