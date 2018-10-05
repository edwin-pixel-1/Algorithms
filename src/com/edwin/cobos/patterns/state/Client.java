package com.edwin.cobos.patterns.state;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Client extends Application {

    Game game;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        game = new Game();

        TextArea textArea1 = new TextArea();
        textArea1.setText(game.toString());

        Button button1 = new Button("Accelerate");
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            game.getCar().accelerate();
            textArea1.setText(game.toString());
        });

        Button button2 = new Button("Left");
        button2.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            game.getCar().turnLeft();
            textArea1.setText(game.toString());
        });
        button2.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            game.getCar().resetSteering();
            textArea1.setText(game.toString());
        });

        Button button3 = new Button("Right");
        button3.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            game.getCar().turnRight();
            textArea1.setText(game.toString());
        });
        button3.addEventHandler(MouseEvent.MOUSE_RELEASED, event -> {
            game.getCar().resetSteering();
            textArea1.setText(game.toString());
        });

        Button button4 = new Button("Brake");
        button4.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            game.getCar().pushBrake();
            textArea1.setText(game.toString());
        });

        Button button5 = new Button("Next Level");
        button5.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            game.nextLevel();
            textArea1.setText(game.toString());
        });


        BorderPane pane = new BorderPane();
        pane.setCenter(textArea1);

        HBox buttonsBox = new HBox();
        buttonsBox.setAlignment(Pos.CENTER);
        buttonsBox.setSpacing(20);
        buttonsBox.getChildren().addAll(button1, button2, button3, button4, button5);
        pane.setBottom(buttonsBox);


        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("State Design Patter - Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
