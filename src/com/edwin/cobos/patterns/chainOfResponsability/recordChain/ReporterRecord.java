package com.edwin.cobos.patterns.chainOfResponsability.recordChain;

import com.edwin.cobos.patterns.chainOfResponsability.CallRecord;

public class ReporterRecord extends AbstractRecord {

    @Override
    public void handleRequest(CallRecord req) {
        System.out.println(req.toString());
    }
}
