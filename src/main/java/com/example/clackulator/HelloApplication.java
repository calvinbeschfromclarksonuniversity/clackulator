package com.example.clackulator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FlowPane root = new FlowPane();

        Button clicker = new Button("clicking me is harassment");
        clicker.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("pee poo");
            }
        });

        Button clicke = new Button("clicking me isn't harassment");
        clicker.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                System.out.println("pee pool");
            }
        });

        root.getChildren().add(clicker);
        root.getChildren().add(clicke);
        Scene scene = new Scene(root, 320, 240);
        stage.setTitle("420");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}