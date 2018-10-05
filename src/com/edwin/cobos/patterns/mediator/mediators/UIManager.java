package com.edwin.cobos.patterns.mediator.mediators;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;

public class UIManager {

    private final GameMediator mediator;
    private Text counterText;

    public UIManager(GameMediator parent) {
        mediator = parent;
        createResetButton(mediator.getParent());
        createCounter(mediator.getParent());
    }

    private void createCounter(Group parent) {
        counterText = new Text("0");
        counterText.setTranslateX(710);
        counterText.setTranslateY(100);
        counterText.setFont(Font.font("Verdana", FontWeight.BOLD, 70));
        counterText.setFill(Color.WHITE);
        parent.getChildren().add(counterText);
    }

    private void createResetButton(Group parent) {
        Button resetButton = new Button("Reset");
        resetButton.setTranslateX(730);
        resetButton.setTranslateY(250);

        resetButton.addEventHandler(MouseEvent.MOUSE_CLICKED, x -> mediator.resetGame());

        parent.getChildren().add(resetButton);
    }

    public void updateCounter(String value) {
        counterText.setText(value);
    }
}
