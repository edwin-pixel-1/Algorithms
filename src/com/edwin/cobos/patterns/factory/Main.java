package com.edwin.cobos.patterns.factory;

public class Main {

    public static void main(String[] args) {
        TraceFactory factory = TraceDebuggFactory.getFactory();

        Trace trace = factory.createTrace(TraceType.FILE_TRACE);

        trace.debug("This is a debug message For File!!!");

        trace.error("This is an error message for File");



        Trace trace2 = factory.createTrace(TraceType.CONSOLE_TRACE);

        trace2.debug("This is a debug message For Console!!!");

        trace2.setDebug(false);

        trace2.error("This is an error message for Console");
    }

}
