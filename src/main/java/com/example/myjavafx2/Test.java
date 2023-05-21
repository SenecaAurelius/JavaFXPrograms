package com.example.myjavafx2;

import javafx.application.Application;
import javafx.stage.Stage;

public class Test extends Application {
    public Test() {
        System.out.println("Test constructor is invoked");
    }
    public static void main(String[] args) {
        System.out.println("Launch application");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        System.out.println("start method is invoked");
    }
}
