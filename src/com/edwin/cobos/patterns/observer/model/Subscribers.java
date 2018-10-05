package com.edwin.cobos.patterns.observer.model;

import com.edwin.cobos.patterns.observer.observer.Observer;
import javafx.scene.Group;
import javafx.scene.control.TextArea;

import java.util.ArrayList;
import java.util.List;

public class Subscribers extends Group implements Observer {

    private List<String> names;
    private TextArea textArea;

    public Subscribers() {
        names = new ArrayList<>();
        createGui();
    }

    private void createGui() {
        textArea = new TextArea();
        this.getChildren().add(textArea);
    }

    @Override
    public void updateNames(List<String> list) {
        names = list;
        display();
    }

    @Override
    public void addName(String user) {
        names.add(user);
        textArea.appendText(user + "\n");
    }

    private void display() {
        StringBuilder result = new StringBuilder();
        names.forEach(x -> {
            result.append(x).append("\n");
        });
        textArea.setText(result.toString());
    }
}
