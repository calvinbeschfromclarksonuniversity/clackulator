package com.example.clackulator;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        BorderPane root = new BorderPane();
        VBox realStackPane = new VBox();

        double Billy = 0, Bob = 0, Joe = 0;

        TextField billyField = new TextField("0");
        Label billyLabel = new Label("Ans:");
        billyField.setEditable(false);

        TextField bobField = new TextField("0");
        Label bobLabel = new Label("Number A:");
        TextField joeField = new TextField("0");
        Label joeLabel = new Label("Number B:");

        Button plus = new Button("+");
        plus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                billyField.setText(Double.toString(Double.parseDouble(bobField.getText()) + Double.parseDouble(joeField.getText())));
            }
        });

        Button minus = new Button("-");
        minus.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                billyField.setText(Double.toString(Double.parseDouble(bobField.getText()) - Double.parseDouble(joeField.getText())));
            }
        });


        Button x = new Button("X");
        x.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                billyField.setText(Double.toString(Double.parseDouble(bobField.getText()) * Double.parseDouble(joeField.getText())));
            }
        });

        Button duvude = new Button("÷");
        duvude.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                if (Double.parseDouble(joeField.getText()) == 0) billyField.setText("division by zero error");
                else billyField.setText(Double.toString(Double.parseDouble(bobField.getText()) / Double.parseDouble(joeField.getText())));
            }
        });

        HBox THE_martix = new HBox();
        THE_martix.getChildren().addAll(plus, minus, x, duvude);

        realStackPane.getChildren().addAll(billyLabel, billyField, bobLabel, bobField, joeLabel, joeField, THE_martix);
        root.setCenter(realStackPane);
        Scene scene = new Scene(root, 420, 420);
        stage.setTitle("420");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}