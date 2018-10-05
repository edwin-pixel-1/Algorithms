package com.edwin.cobos.patterns.strategy;

import java.util.List;

public class TwoClasses implements Model {

    public TwoClasses() {
    }

    @Override
    public long getRevenue(List<Flight> flights) {
        long total = 0;
        for (Flight flight : flights) {
            int businessClassNumber = flight.getPassengersNumber() / 3;
            total += businessClassNumber * (baseTicketPrice * 1.5);
            int coachClassNumber = flight.getPassengersNumber() - businessClassNumber;
            total += coachClassNumber * (baseTicketPrice * 0.75);
        }

        total = (long) (total - (fixedCost * 1.1));
        return total;
    }
}
