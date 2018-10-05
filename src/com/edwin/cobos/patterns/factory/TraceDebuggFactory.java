package com.edwin.cobos.patterns.factory;

public class TraceDebuggFactory implements TraceFactory {

    private static TraceFactory factory = new TraceDebuggFactory();

    public static TraceFactory getFactory(){
        return factory;
    }

    @Override
    public Trace createTrace(TraceType type) {
        Trace trace = null;

        switch (type) {
            case FILE_TRACE:
                trace = new FileTrace();
                break;
            case CONSOLE_TRACE:
                trace = new ConsoleTrace();
                break;
        }

        return trace;
    }
}
