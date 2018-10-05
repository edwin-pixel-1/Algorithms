package com.edwin.cobos.patterns.builder.builder;

import com.edwin.cobos.patterns.builder.model.Agent;
import com.edwin.cobos.patterns.builder.model.Customer;
import com.edwin.cobos.patterns.builder.model.Request;

public interface RequestBuilder {

    public RequestBuilder buildOpening(String reqId, Customer customer, Agent agent);

    public RequestBuilder buildResponse(String reqContent, String respContent);

    public RequestBuilder buildClosing(boolean isAnswered, boolean isSaleLead, boolean needCallBack);

    public Request getRequest();
}
