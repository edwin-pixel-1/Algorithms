package com.edwin.cobos.patterns.chainOfResponsability;

import com.edwin.cobos.patterns.chainOfResponsability.recordChain.RecordChainBuilder;

public class Main {

    public static void main(String[] args) {
        Address address1 = new Address("Street 1", "City 1", "State 1", "1111");
        Address address2 = new Address("Street 2", "City 2", "State 2", "1112");
        Address address3 = new Address("Street 3", "City 3", "State 3", "1113");
        Address address4 = new Address("Street 4", "City 4", "State 4", "1114");
        Address address5 = new Address("", "", "State 5", "1115");

        Customer customer1 = new Customer("Name 1", "Last Name 1", address1, "", "");
        Customer customer2 = new Customer("Name 2", "Last Name 2", address2, "1234567892", "email2@mum.edu");
        Customer customer3 = new Customer("Name 3", "Last Name 3", address3, "1234567893", "email3@mum.edu");
        Customer customer4 = new Customer("Name 4", "Last Name 4", address4, "1234567894", "email4@mum.edu");
        Customer customer5 = new Customer("Name 5", "Last Name 5", address5, "1234567895", "email5@mum.edu");

        Agent agent1 = new Agent("1", address1);
        Agent agent2 = new Agent("2", address2);
        Agent agent3 = new Agent("3", address3);
        Agent agent4 = new Agent("4", address4);
        Agent agent5 = new Agent("5", address5);

        CallRecord callRecord1 = new CallRecord(customer1, agent1, "information 1");
        CallRecord callRecord2 = new CallRecord(customer2, agent2, "information 2");
        CallRecord callRecord3 = new CallRecord(customer3, agent3, "information 3");
        CallRecord callRecord4 = new CallRecord(customer4, agent4, "information 4");
        CallRecord callRecord5 = new CallRecord(customer5, agent5, "information 5");

        RecordChainBuilder recordChainBuilder = new RecordChainBuilder();

        recordChainBuilder.getHandler().handleRequest(callRecord1);
        recordChainBuilder.getHandler().handleRequest(callRecord2);
        recordChainBuilder.getHandler().handleRequest(callRecord3);
        recordChainBuilder.getHandler().handleRequest(callRecord4);
        recordChainBuilder.getHandler().handleRequest(callRecord5);
    }

}
