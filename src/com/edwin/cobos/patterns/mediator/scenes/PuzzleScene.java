package com.edwin.cobos.patterns.mediator.scenes;

import com.edwin.cobos.patterns.mediator.mediators.GameMediator;
import com.edwin.cobos.patterns.mediator.mediators.MinesManager;
import com.edwin.cobos.patterns.mediator.mediators.UIManager;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class PuzzleScene extends Scene implements GameMediator {

    private UIManager uiManager;
    private boolean isGameOver = false;
    private int counterPlays = 0;

    private final MinesManager minesManager;

    public PuzzleScene(Group root, double width, double height) {
        super(root, width, height);

        minesManager = new MinesManager(this);

        uiManager = new UIManager(this);

        this.setFill(Color.BLACK);
    }

    @Override
    public boolean isGameOver() {
        return isGameOver;
    }

    @Override
    public void gameOver() {
        isGameOver = true;
    }

    @Override
    public Group getParent() {
        return (Group) this.getRoot();
    }

    @Override
    public void resetGame() {
        isGameOver = false;
        minesManager.reset();
    }

    @Override
    public void updateCounterUI(boolean increase) {
        if (increase)
            counterPlays++;
        else
            counterPlays--;

        uiManager.updateCounter(String.valueOf(counterPlays));
    }

    @Override
    public void updateCounterUI(int value) {
        uiManager.updateCounter(String.valueOf(value));
    }
}
