package com.edwin.cobos.patterns.command.square.commands;

import com.edwin.cobos.patterns.command.Command;

import java.util.Stack;

public class CommandManager {

    private Stack<Command> commandStack;

    public CommandManager() {
        commandStack = new Stack<>();
    }

    public void executeCommand(Command cmd) {
        cmd.execute();
        commandStack.push(cmd);
    }

    public void undo() {
        if(!commandStack.empty()) {
            Command cmd = commandStack.pop();
            cmd.undo();
        }
    }
}
