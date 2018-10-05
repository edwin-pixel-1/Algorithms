package com.edwin.cobos.patterns.abstractFactory.packs;

class ReusableShopper implements Packaging {

    private float cost;

    public ReusableShopper(float cost) {
        this.cost = cost;
    }

    @Override
    public float getCost() {
        return cost;
    }
}
