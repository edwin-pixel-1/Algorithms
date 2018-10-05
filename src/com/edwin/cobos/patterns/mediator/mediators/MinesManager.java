package com.edwin.cobos.patterns.mediator.mediators;

import com.edwin.cobos.patterns.mediator.models.CellStatus;
import com.edwin.cobos.patterns.mediator.models.MineCell;
import com.edwin.cobos.patterns.mediator.utils.RandomUtil;
import javafx.scene.Group;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.IntStream;

public class MinesManager {

    private final double mineCellSize = 40;
    private final int gridW = 16;
    private final int gridH = 16;
    private int minesNumber;
    private ArrayList<MineCell> cells;
    private final GameMediator mediator;
    HashMap<Integer, Integer> minesPositionsMap;

    public MinesManager(GameMediator parent) {
        mediator = parent;
        minesNumber = (int) ((gridW * gridH) * 0.2);
        createBackground(mediator.getParent());
        initGrid();
    }

    private void initGrid() {
        createMineCells();
        renderMineCells(mediator.getParent());
    }

    private void createMineCells() {
        cells = new ArrayList<>();
        int size = gridW * gridH;
        int[] minesPositions = RandomUtil.randomSerialNumberRange(minesNumber, 0, size);
        minesPositionsMap = new HashMap<>();
        for (int i : minesPositions) {
            minesPositionsMap.put(i, i);
        }

        IntStream.range(0, size).forEach(i -> {
            MineCell cell = new MineCell(mineCellSize, i);
            if (minesPositionsMap.containsKey(i)) {
                cell.setHasMine(true);
            }
            cells.add(cell);
        });
    }

    private void renderMineCells(Group parent) {
        for (int j = 0; j < gridH; j++) {
            for (int i = 0; i < gridW; i++) {
                int index = i + (gridW * j);
                MineCell cell = cells.get(index);
                cell.setXY(i, j);
                cell.setTranslateX(i * mineCellSize);
                cell.setTranslateY(j * mineCellSize);
                calculateMinesAround(cell);
                cell.addEventHandler(MouseEvent.MOUSE_CLICKED, x -> {
                    if (x.getButton() == MouseButton.SECONDARY || x.getButton() == MouseButton.PRIMARY) {
                        mineCellClick((MineCell) x.getSource(), x.getButton() == MouseButton.SECONDARY);
                    }
                });
            }
        }
        parent.getChildren().addAll(cells);
    }

    private void calculateMinesAround(MineCell cell) {
        if (cell.hasMine())
            return;

        int x = cell.getPosX();
        int y = cell.getPosY();

        int startX = x;
        int startY = y;
        if (x - 1 >= 0) {
            startX -= 1;
        }
        if (y - 1 >= 0) {
            startY -= 1;
        }

        int endX = x;
        int endY = y;
        if (x + 1 < gridW) {
            endX += 1;
        }
        if (y + 1 < gridH) {
            endY += 1;
        }

        int minesCounter = 0;
        for (int j = startY; j <= endY; j++) {
            for (int i = startX; i <= endX; i++) {
                int index = i + (gridW * j);
                MineCell cellAround = cells.get(index);
                cell.addNeighbor(cellAround);
                if (cellAround.hasMine()) {
                    minesCounter++;
                }
            }
        }
        cell.setNumberOfMines(minesCounter);
    }

    private void mineCellClick(MineCell cell, boolean rightClick) {
        if (cell.isOpened() || mediator.isGameOver())
            return;

        if (rightClick) {
            cell.toggleStatus();
        } else {
            playMineCell(cell);
        }
    }

    private void playMineCell(MineCell cell) {
        if (cell.getStatus() == CellStatus.RED_FLAG)
            return;

        if (cell.hasMine()) {
            cell.setOpened(true);
            cell.updateStatus(CellStatus.BOMB);
            mediator.gameOver();
            explodeAllMines();
        } else {
            openSurroundedMines(cell);
            mediator.updateCounterUI(true);
        }
    }

    private void openSurroundedMines(MineCell cell) {
        if (cell.isOpened())
            return;

        cell.setOpened(true);
        cell.updateStatus(CellStatus.OPENED);
        if (cell.getNumberOfMines() == 0) {
            cell.getNeighbors().forEach(this::openSurroundedMines);
        }
    }

    private void explodeAllMines() {
        minesPositionsMap.keySet().forEach(i -> cells.get(i).updateStatus(CellStatus.BOMB));
    }

    private void createBackground(Group parent) {
        double w = gridW * mineCellSize;
        double h = gridH * mineCellSize;
        Rectangle bg = new Rectangle(w, h);
        bg.setFill(Color.web("#BF8F2C"));
        parent.getChildren().add(bg);
    }

    public void reset() {
        cells.forEach(x -> mediator.getParent().getChildren().remove(x));
        mediator.updateCounterUI(0);
        initGrid();
    }


}
