package com.edwin.cobos.patterns.builder.model;

public class Customer {

    private String id;
    private String name;

    public Customer(String id, String name) {
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
        sb.append("Customer Id: ");
        sb.append(id);
        sb.append("\n");

        sb.append("Customer Name: ");
        sb.append(name);
        sb.append("\n");
        return sb.toString();
    }
}
