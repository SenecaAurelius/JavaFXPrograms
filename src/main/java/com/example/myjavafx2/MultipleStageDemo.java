package com.example.myjavafx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override // Overrides the start method in the Application class
    public void start(Stage primaryStage) {

        Scene scene = new Scene(new Button("OK"), 200, 250);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();

        //stage.setResizeable(false); stops users from resizing window
        Stage stage = new Stage();
        stage.setTitle("Second Stage");
        stage.setScene(new Scene(new Button("New Stage"), 200, 250));
        stage.show();
    }
}
