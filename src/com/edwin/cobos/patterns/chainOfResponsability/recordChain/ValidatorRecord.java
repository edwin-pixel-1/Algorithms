package com.edwin.cobos.patterns.chainOfResponsability.recordChain;

import com.edwin.cobos.patterns.chainOfResponsability.CallRecord;
import com.edwin.cobos.patterns.chainOfResponsability.Customer;

public class ValidatorRecord extends AbstractRecord {

    @Override
    public void handleRequest(CallRecord req) {
        Customer customer = req.getCustomer();
        if(customer != null && customer.isValid()) {
            callNextAgent(req);
        }
    }
}
