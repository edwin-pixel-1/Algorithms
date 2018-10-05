package com.edwin.cobos.patterns.mediator;

import javafx.application.Application;
import javafx.stage.Stage;

public class Game extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Director director = new Director();

        primaryStage.setTitle("Mediator Design Patter - Minesweeper");
        primaryStage.setScene(director.getScene());
        primaryStage.show();
    }
}
