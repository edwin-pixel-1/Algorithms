package com.edwin.cobos.patterns.command.square.commands;

import com.edwin.cobos.patterns.command.Command;
import com.edwin.cobos.patterns.command.square.Square;

public class Create implements Command {

    private Square square;
    private int size;

    public Create(int size) {
        this.size = size;
    }

    @Override
    public void execute() {
        square = new Square(size);
    }

    @Override
    public void undo() {
        square = null;
    }

    public Square getSquare() {
        return square;
    }
}
