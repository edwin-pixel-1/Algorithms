package com.edwin.cobos.patterns.abstractFactory.packs;

class PlainPaper implements Packaging {

    private float cost;

    public PlainPaper(float cost) {
        this.cost = cost;
    }

    @Override
    public float getCost() {
        return cost;
    }
}
