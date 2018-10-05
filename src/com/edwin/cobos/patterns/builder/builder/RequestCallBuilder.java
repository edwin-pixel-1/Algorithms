package com.edwin.cobos.patterns.builder.builder;

import com.edwin.cobos.patterns.builder.model.Agent;
import com.edwin.cobos.patterns.builder.model.Customer;
import com.edwin.cobos.patterns.builder.model.Request;

public class RequestCallBuilder implements RequestBuilder {

    private Request request;

    public RequestCallBuilder() {
        this.request = new Request();
    }

    @Override
    public RequestBuilder buildOpening(String reqId, Customer customer, Agent agent) {
        request.setReqId(reqId);
        request.setRequester(customer);
        request.setAgent(agent);
        return this;
    }

    @Override
    public RequestBuilder buildResponse(String reqContent, String respContent) {
        request.setReqContent(reqContent);
        request.setRespContent(respContent);
        return this;
    }

    @Override
    public RequestBuilder buildClosing(boolean isAnswered, boolean isSaleLead, boolean needCallBack) {
        request.setAnswered(isAnswered);
        request.setSaleLead(isSaleLead);
        request.setNeedCallBack(needCallBack);
        return this;
    }

    @Override
    public Request getRequest() {
        return request;
    }
}
