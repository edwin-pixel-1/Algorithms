package com.edwin.cobos.patterns.memento;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.nio.file.Files;

public class Client extends Application {
    private CareTaker careTaker;
    private TextArea textArea1;
    private final FileChooser fileChooser = new FileChooser();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        createGUI(primaryStage);
    }

    private void createGUI(Stage primaryStage) {
        careTaker = new CareTaker();

        textArea1 = new TextArea();
        textArea1.setWrapText(true);
        textArea1.setOnKeyTyped(event -> {
            careTaker.push(new Memento(textArea1.getText()));
        });

        Button button1 = new Button("Load File");
        button1.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            openFile(primaryStage);
        });

        Button button2 = new Button("Save File");
        button2.addEventHandler(MouseEvent.MOUSE_CLICKED, event -> {
            saveFile(primaryStage);
        });

        Button button3 = new Button("Undo");
        button3.addEventHandler(MouseEvent.MOUSE_PRESSED, event -> {
            Memento state = careTaker.pop();
            if (state != null)
                textArea1.setText(state.getState());
        });


        BorderPane pane = new BorderPane();
        pane.setCenter(textArea1);

        HBox buttonsBox = new HBox();
        buttonsBox.setAlignment(Pos.CENTER);
        buttonsBox.setSpacing(20);
        buttonsBox.getChildren().addAll(button1, button2, button3);
        pane.setBottom(buttonsBox);


        Scene scene = new Scene(pane, 400, 300);
        primaryStage.setTitle("Memento Design Patter - Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setupSaveFileChooser() {
        fileChooser.setTitle("Saving text file");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.dir")));
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("TXT", "*.txt")
        );
    }

    private void saveFile(Stage primaryStage) {
        setupSaveFileChooser();
        File file = fileChooser.showSaveDialog(primaryStage);
        if (file != null) {
            writeFile(file);
        }
    }

    private void writeFile(File file) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write(textArea1.getText());
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void setupOpenFileChooser() {
        fileChooser.setTitle("Load text files");
        fileChooser.setInitialDirectory(new File(System.getProperty("user.dir")));
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Text Files", "*.*"),
                new FileChooser.ExtensionFilter("TXT", "*.txt")
        );
    }

    private void openFile(Stage primaryStage) {
        setupOpenFileChooser();
        File file = fileChooser.showOpenDialog(primaryStage);
        if (file != null) {
            readFile(file);
        }
    }

    private void readFile(File file) {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null)
            {
                result.append(line).append("\n");
            }
            br.close();
            result.setLength(result.length() - 1);
            result.append(" ");
        } catch (IOException e) {
            e.printStackTrace();
        }

        textArea1.setText(result.toString());
        careTaker.clear();
    }
}
