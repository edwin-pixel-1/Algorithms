package com.edwin.cobos.patterns.abstractFactory.packs;

class Cartoon implements Packaging {

    private float cost;

    public Cartoon(float cost) {
        this.cost = cost;
    }

    @Override
    public float getCost() {
        return cost;
    }
}
