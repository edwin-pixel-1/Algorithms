package com.edwin.cobos.patterns.command.square.commands;

import com.edwin.cobos.patterns.command.Command;
import com.edwin.cobos.patterns.command.square.Square;

public class MoveHorizontal implements Command {

    private Square square;
    private final int spaces;

    public MoveHorizontal(Square square, int spaces) {
        this.square = square;
        this.spaces = spaces;
    }

    @Override
    public void execute() {
        this.square.moveX(spaces);
    }

    @Override
    public void undo() {
        this.square.moveX(-spaces);
    }
}
