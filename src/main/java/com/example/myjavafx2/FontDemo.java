package com.example.myjavafx2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class FontDemo extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new StackPane();

        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setStroke(Color.DEEPPINK);
        circle.setFill(new Color(0.5, 0.5, 0.5, 0.1));
        pane.getChildren().add(circle);

        Label label = new Label("Hey Hey");
        label.setFont(Font.font("Yu Gothic UI Light", FontWeight.BOLD, FontPosture.REGULAR, 30));
        pane.getChildren().add(label);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Hello Earl");
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.println(Font.getFontNames());
    }
}
