package com.edwin.cobos.patterns.observer;

import com.edwin.cobos.patterns.observer.model.Subscribers;
import com.edwin.cobos.patterns.observer.services.NamesService;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Client extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FlowPane pane = new FlowPane();

        Subscribers subscribers = new Subscribers();

        NamesService namesService = new NamesService();
        namesService.attach(subscribers);
        TextField textField1 = new TextField();


        Button button1 = new Button("Add");
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, x -> {
            String value = textField1.getText();
            if (!value.isEmpty()) {
                subscribers.addName(value);
                textField1.setText("");
            }
        });


        pane.getChildren().addAll(subscribers, textField1, button1);
        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("State Design Patter - Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
