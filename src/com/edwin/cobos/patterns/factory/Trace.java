package com.edwin.cobos.patterns.factory;

import java.util.logging.Logger;

public interface Trace {

    Logger logger = Logger.getLogger("MyLog");

    // turn on and off debugging
    public void setDebug(boolean debug);

    // write out a debug message
    public void debug(String message);

    // write out an error message
    public void error(String message);

}
