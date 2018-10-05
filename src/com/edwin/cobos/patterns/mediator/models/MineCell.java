package com.edwin.cobos.patterns.mediator.models;

import com.edwin.cobos.patterns.mediator.utils.ImageFactory;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.List;

public class MineCell extends StackPane {

    private int index;
    private boolean hasMine = false;
    private boolean isOpened = false;
    private CellStatus status;
    private ImagePattern bombImage;
    private ImagePattern redFlagImage;
    private Rectangle background;
    private Text numberLabel;
    private int numberOfMines = 0;
    private int posX;
    private int posY;
    private List<MineCell> neighbors;

    public MineCell(double size, int index) {
        super();
        this.index = index;
        background = new Rectangle(size, size);
        numberLabel = new Text();
        neighbors = new ArrayList<>();
        this.getChildren().addAll(background, numberLabel);
        init();
    }

    private void init() {
        status = CellStatus.NORMAL;
        bombImage = ImageFactory.getImagePattern("file:resources/bomb.png");
        redFlagImage = ImageFactory.getImagePattern("file:resources/red-flag.png");

        background.setStroke(Color.WHITE);
        updateStatus(status);
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public boolean hasMine() {
        return hasMine;
    }

    public void setHasMine(boolean hasMine) {
        this.hasMine = hasMine;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }

    public CellStatus getStatus() {
        return status;
    }

    public void setNumberOfMines(int numberOfMines) {
        this.numberOfMines = numberOfMines;
    }

    public void toggleStatus() {
        CellStatus previousState = status;
        CellStatus newState = null;
        switch (status) {
            case NORMAL:
                newState = CellStatus.RED_FLAG;
                break;
            case RED_FLAG:
                newState = CellStatus.NORMAL;
                break;
        }
        updateStatus(newState);
    }

    public void updateStatus(CellStatus newState) {
        if (newState == CellStatus.NORMAL) {
            background.setFill(Color.TRANSPARENT);
        } else if (newState == CellStatus.RED_FLAG) {
            background.setFill(redFlagImage);
        } else if (newState == CellStatus.OPENED) {
            open();
        } else if (newState == CellStatus.BOMB) {
            background.setFill(bombImage);
        }
        status = newState;
    }

    private void open() {
        background.setFill(Color.web("#CACACA"));
        if(numberOfMines > 0)
            numberLabel.setText(String.valueOf(numberOfMines));
    }

    public void setXY(int x, int y) {
        this.posX = x;
        this.posY = y;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public void addNeighbor(MineCell cell) {
        neighbors.add(cell);
    }

    public List<MineCell> getNeighbors() {
        return neighbors;
    }

    public int getNumberOfMines() {
        return numberOfMines;
    }
}
