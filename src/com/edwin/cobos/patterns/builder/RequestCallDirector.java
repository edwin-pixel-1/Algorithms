package com.edwin.cobos.patterns.builder;

import com.edwin.cobos.patterns.builder.builder.RequestBuilder;
import com.edwin.cobos.patterns.builder.builder.RequestCallBuilder;
import com.edwin.cobos.patterns.builder.model.Call;
import com.edwin.cobos.patterns.builder.model.Request;

public class RequestCallDirector {

    private RequestBuilder requestBuilder = null;

    public RequestCallDirector(RequestBuilder requestBuilder) {
        this.requestBuilder = requestBuilder;
    }

    public void constructRequestCall(Call call) {
        requestBuilder
                .buildOpening("1", call.getCustomer(), call.getAgent())
                .buildResponse("Request dummy data", "Response dummy data")
                .buildClosing(true, true, true);
    }

    public Request getRequest(){
        return requestBuilder.getRequest();
    }
}
