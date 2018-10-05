package com.edwin.cobos.patterns.abstractFactory.packs;

class EverydayValue implements Packaging {

    private float cost;

    public EverydayValue(float cost) {
        this.cost = cost;
    }

    @Override
    public float getCost() {
        return cost;
    }
}
