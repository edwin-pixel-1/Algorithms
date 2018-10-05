package com.edwin.cobos.patterns.builder.model;

import java.util.Date;
import java.util.Random;

public class Call {

    private String requestId;
    private Agent agent;

    public void callPop(Agent agent) {
        this.agent = agent;
        this.requestId = "" + (new Date()).getTime();
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Customer getCustomer() {
        Random rand = new Random();
        int id = rand.nextInt(100) + 1;
        Customer customer = new Customer(String.valueOf(id), "Ed-" + id);
        return customer;
    }
}
