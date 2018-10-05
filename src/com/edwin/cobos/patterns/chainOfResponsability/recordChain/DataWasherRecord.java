package com.edwin.cobos.patterns.chainOfResponsability.recordChain;

import com.edwin.cobos.patterns.chainOfResponsability.CallRecord;

public class DataWasherRecord extends AbstractRecord {
    @Override
    public void handleRequest(CallRecord req) {
        req.setASalesLead(true);
        callNextAgent(req);
    }
}
