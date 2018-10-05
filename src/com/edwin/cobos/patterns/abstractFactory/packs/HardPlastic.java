package com.edwin.cobos.patterns.abstractFactory.packs;

class HardPlastic implements Packaging {

    private float cost;

    public HardPlastic(float cost) {
        this.cost = cost;
    }

    @Override
    public float getCost() {
        return cost;
    }
}
