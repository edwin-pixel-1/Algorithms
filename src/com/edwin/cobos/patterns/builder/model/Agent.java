package com.edwin.cobos.patterns.builder.model;

public class Agent {

    private String id;
    private String name;

    public Agent(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Agent Id: ");
        sb.append(id);
        sb.append("\n");

        sb.append("Agent Name: ");
        sb.append(name);
        sb.append("\n");
        return sb.toString();
    }
}
