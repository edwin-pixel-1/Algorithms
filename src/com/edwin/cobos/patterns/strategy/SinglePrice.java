package com.edwin.cobos.patterns.strategy;

import java.util.List;

public class SinglePrice implements Model {

    public SinglePrice() {
    }

    @Override
    public long getRevenue(List<Flight> flights) {
        long total = 0;
        for (Flight flight : flights) {
            total += flight.getPassengersNumber() * baseTicketPrice;
        }
        total = total - fixedCost;
        return total;
    }
}
