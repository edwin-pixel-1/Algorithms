package com.edwin.cobos.patterns.abstractFactory.packs;

class HappyKid implements Packaging {

    private float cost;

    public HappyKid(float cost) {
        this.cost = cost;
    }

    @Override
    public float getCost() {
        return cost;
    }
}
