package com.edwin.cobos.patterns.strategy;

import java.util.List;

public class MultiClass implements Model {

    public MultiClass() {
    }

    @Override
    public long getRevenue(List<Flight> flights) {
        long total = 0;
        for (Flight flight : flights) {
            int firstClassNumber = flight.getPassengersNumber() / 10;
            total += firstClassNumber * (baseTicketPrice * 4);

            int businessClassNumber = flight.getPassengersNumber() / 5;
            total += businessClassNumber * (baseTicketPrice * 1.5);

            int coachClassNumber = flight.getPassengersNumber() - firstClassNumber;
            total += coachClassNumber * (baseTicketPrice * 0.75);
        }

        total = (long) (total - (fixedCost * 1.2));
        return total;
    }
}
