package com.edwin.cobos.patterns.factory;

import java.util.logging.ConsoleHandler;
import java.util.logging.SimpleFormatter;

public class ConsoleTrace implements Trace {

    private ConsoleHandler consoleHandler;
    private boolean debugEnabled = true;

    public ConsoleTrace() {
        consoleHandler = new ConsoleHandler();
        logger.addHandler(consoleHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        consoleHandler.setFormatter(formatter);
    }

    @Override
    public void setDebug(boolean debug) {
        debugEnabled = debug;
    }

    @Override
    public void debug(String message) {
        if (debugEnabled)
            logger.info(message);
    }

    @Override
    public void error(String message) {
        if (debugEnabled)
            logger.severe(message);
    }
}
