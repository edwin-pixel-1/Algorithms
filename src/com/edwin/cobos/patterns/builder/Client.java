package com.edwin.cobos.patterns.builder;

import com.edwin.cobos.patterns.builder.builder.RequestCallBuilder;
import com.edwin.cobos.patterns.builder.model.Agent;
import com.edwin.cobos.patterns.builder.model.Call;
import com.edwin.cobos.patterns.builder.model.Request;

public class Client {

    public static void main(String[] args) {
        Agent agent = new Agent("789", "Edwin");

        Call call = new Call();
        call.callPop(agent);

        RequestCallDirector requestCallDirector = new RequestCallDirector(new RequestCallBuilder());

        requestCallDirector.constructRequestCall(call);

        Request request = requestCallDirector.getRequest();

        System.out.println(request);
    }
}
