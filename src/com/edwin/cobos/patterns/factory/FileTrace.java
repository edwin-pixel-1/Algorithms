package com.edwin.cobos.patterns.factory;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.SimpleFormatter;

public class FileTrace implements Trace {

    private FileHandler fileHandler;

    boolean debugEnabled = true;

    public FileTrace() {
        try {
            fileHandler = new FileHandler("MyLogFile.log");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
