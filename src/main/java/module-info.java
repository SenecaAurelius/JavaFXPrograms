module com.example.myjavafx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.myjavafx2 to javafx.fxml;
    exports com.example.myjavafx2;
}