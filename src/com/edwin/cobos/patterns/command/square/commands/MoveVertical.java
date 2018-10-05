package com.edwin.cobos.patterns.command.square.commands;

import com.edwin.cobos.patterns.command.Command;
import com.edwin.cobos.patterns.command.square.Square;

public class MoveVertical implements Command {

    private Square square;
    private final int spaces;

    public MoveVertical(Square square, int spaces) {
        this.square = square;
        this.spaces = spaces;
    }

    @Override
    public void execute() {
        this.square.moveY(spaces);
    }

    @Override
    public void undo() {
        this.square.moveY(-spaces);
    }
}
