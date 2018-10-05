package com.edwin.cobos.patterns.strategy;

import java.util.Arrays;
import java.util.List;

public class Client {

    public Client() {
        Flight f1 = new Flight(15);
        Flight f2 = new Flight(30);
        Flight f3 = new Flight(50);

        List<Flight> flights = Arrays.asList(f1, f2, f3);

        PricingCalculator pricingCalculator = new PricingCalculator();

        pricingCalculator.setPricinModel(new SinglePrice());
        long total1 = pricingCalculator.calculateRevenue(flights);
        System.out.println(total1);

        pricingCalculator.setPricinModel(new TwoClasses());
        long total2 = pricingCalculator.calculateRevenue(flights);
        System.out.println(total2);

        pricingCalculator.setPricinModel(new MultiClass());
        long total3 = pricingCalculator.calculateRevenue(flights);
        System.out.println(total3);
    }

    public static void main(String[] args) {
        new Client();
    }
}
