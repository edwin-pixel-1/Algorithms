package com.edwin.cobos.patterns.chainOfResponsability.recordChain;

public class RecordChainBuilder {

    private AbstractRecord handler;

    public RecordChainBuilder() {
        AbstractRecord ar1 = new ValidatorRecord();
        AbstractRecord ar2 = new DataWasherRecord();
        AbstractRecord ar3 = new ReporterRecord();
        ar1.setNextAgent(ar2);
        ar2.setNextAgent(ar3);

        handler = ar1;
    }

    public AbstractRecord getHandler() {
        return handler;
    }
}
