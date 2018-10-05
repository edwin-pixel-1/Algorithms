package com.edwin.cobos.patterns.mediator.mediators;

import javafx.scene.Group;

public interface GameMediator {

    boolean isGameOver();

    void gameOver();

    Group getParent();

    void resetGame();

    void updateCounterUI(boolean increase);

    void updateCounterUI(int value);
}
