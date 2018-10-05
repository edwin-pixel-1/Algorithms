package com.edwin.cobos.patterns.abstractFactory.packs;

class HolidaySurprise implements Packaging {

    private float cost;

    public HolidaySurprise(float cost) {
        this.cost = cost;
    }

    @Override
    public float getCost() {
        return cost;
    }
}
