package com.edwin.cobos.patterns.chainOfResponsability;

public class Agent {

    private String agentId;
    private Address workLocation;

    public Agent(String agentId, Address workLocation) {
        this.agentId = agentId;
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("----Agent----");
        sb.append("\n\t");
        sb.append("Agent Id: ");
        sb.append(agentId);
        sb.append("\n\t");
        sb.append(workLocation.toString());
        sb.append("\n\t");
        sb.append("----End-Agent----");
        return sb.toString();
    }
}
