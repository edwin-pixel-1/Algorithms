package com.edwin.cobos.patterns.command.square.commands;

import com.edwin.cobos.patterns.command.Command;
import com.edwin.cobos.patterns.command.square.Square;

public class Scale implements Command {

    private Square square;
    private float value;

    public Scale(Square square, float scale) {
        this.square = square;
        this.value = scale;
    }

    @Override
    public void execute() {

        square.scale(value);
    }

    @Override
    public void undo() {
        square.scale(-value);
    }
}
