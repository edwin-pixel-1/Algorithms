package com.edwin.cobos.patterns.chainOfResponsability;

public class CallRecord {

    private Customer customer;
    private Agent agent;
    private String requestInformation;
    private boolean isValid;
    private boolean isASalesLead;

    public CallRecord(Customer customer, Agent agent, String requestInformation) {
        this.customer = customer;
        this.agent = agent;
        this.requestInformation = requestInformation;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public String getRequestInformation() {
        return requestInformation;
    }

    public void setRequestInformation(String requestInformation) {
        this.requestInformation = requestInformation;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public boolean isASalesLead() {
        return isASalesLead;
    }

    public void setASalesLead(boolean ASalesLead) {
        isASalesLead = ASalesLead;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----CallRecord----");
        sb.append("\n\t");
        sb.append("Request Information: ");
        sb.append(requestInformation);
        sb.append("\n\t");
        sb.append("Is Valid:");
        sb.append(isValid);
        sb.append("\n\t");
        sb.append("Is A Sales Lead:");
        sb.append(isASalesLead);
        sb.append("\n\t");
        sb.append(customer.toString());
        sb.append("\n\t");
        sb.append(agent.toString());
        sb.append("\n");
        sb.append("----End-CallRecord----");
        return sb.toString();
    }
}
