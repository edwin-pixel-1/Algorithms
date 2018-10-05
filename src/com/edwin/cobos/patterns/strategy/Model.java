package com.edwin.cobos.patterns.strategy;

import java.util.List;

public interface Model {

    int baseTicketPrice = 300;

    int fixedCost = 500;

    long getRevenue(List<Flight> flights);

}
