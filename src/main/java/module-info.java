module com.example.softeng1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.softeng1 to javafx.fxml;
    exports com.example.softeng1;
}