package com.edwin.cobos.patterns.strategy;

import java.util.List;

public class PricingCalculator {

    private Model pricinModel;

    public void setPricinModel(Model pricinModel) {
        this.pricinModel = pricinModel;
    }

    public long calculateRevenue(List<Flight> flights) {
        return pricinModel.getRevenue(flights);
    }
}
