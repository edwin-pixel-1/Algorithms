package com.edwin.cobos.patterns.chainOfResponsability.recordChain;

import com.edwin.cobos.patterns.chainOfResponsability.CallRecord;

public abstract class AbstractRecord {

    private AbstractRecord nextAgent;

    abstract public void handleRequest(CallRecord req);

    protected void callNextAgent(CallRecord req) {
        if(nextAgent != null) {
            nextAgent.handleRequest(req);
        }
    }

    public void setNextAgent(AbstractRecord nextAgent) {
        this.nextAgent = nextAgent;
    }
}
