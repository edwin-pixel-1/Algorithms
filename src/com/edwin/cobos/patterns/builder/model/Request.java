package com.edwin.cobos.patterns.builder.model;

public class Request {

    //opening
    private String reqId;
    private Customer requester;
    private Agent agent;

    //response
    private String reqContent;
    private String respContent;

    //closing
    private boolean isAnswered;
    private boolean isSaleLead;
    private boolean needCallBack;

    public Request() {
    }

    public String getReqId() {
        return reqId;
    }

    public void setReqId(String reqId) {
        this.reqId = reqId;
    }

    public Customer getRequester() {
        return requester;
    }

    public void setRequester(Customer requester) {
        this.requester = requester;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getReqContent() {
        return reqContent;
    }

    public void setReqContent(String reqContent) {
        this.reqContent = reqContent;
    }

    public String getRespContent() {
        return respContent;
    }

    public void setRespContent(String respContent) {
        this.respContent = respContent;
    }

    public boolean isAnswered() {
        return isAnswered;
    }

    public void setAnswered(boolean answered) {
        isAnswered = answered;
    }

    public boolean isSaleLead() {
        return isSaleLead;
    }

    public void setSaleLead(boolean saleLead) {
        isSaleLead = saleLead;
    }

    public boolean isNeedCallBack() {
        return needCallBack;
    }

    public void setNeedCallBack(boolean needCallBack) {
        this.needCallBack = needCallBack;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("---REQUEST---\n");

        sb.append("--Opening");
        sb.append("Id: ");
        sb.append(reqId);
        sb.append("\n");
        sb.append("Customer: ");
        sb.append(requester);
        sb.append("\n");
        sb.append("Agent: ");
        sb.append(agent);
        sb.append("\n");
        sb.append("---End-Opening");
        sb.append("\n");

        sb.append("--Response");
        sb.append("\n");
        sb.append("Request Content: ");
        sb.append(reqContent);
        sb.append("\n");
        sb.append("Response Content: ");
        sb.append(respContent);
        sb.append("\n");
        sb.append("--End-Response");
        sb.append("\n");

        sb.append("--Closing");
        sb.append("\n");
        sb.append("Is Answered: ");
        sb.append(isAnswered);
        sb.append("\n");
        sb.append("Is Sale Lead: ");
        sb.append(isSaleLead);
        sb.append("\n");
        sb.append("Need CallBack: ");
        sb.append(needCallBack);
        sb.append("\n");
        sb.append("--End-Closing");
        sb.append("\n");

        sb.append("---END-REQUEST---\n");
        return sb.toString();
    }
}
