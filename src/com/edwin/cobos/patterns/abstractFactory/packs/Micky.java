package com.edwin.cobos.patterns.abstractFactory.packs;

class Micky implements Packaging {

    private float cost;

    public Micky(float cost) {
        this.cost = cost;
    }

    @Override
    public float getCost() {
        return cost;
    }
}
