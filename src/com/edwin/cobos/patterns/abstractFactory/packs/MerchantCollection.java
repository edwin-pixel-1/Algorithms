package com.edwin.cobos.patterns.abstractFactory.packs;

class MerchantCollection implements Packaging {

    private float cost;

    public MerchantCollection(float cost) {
        this.cost = cost;
    }

    @Override
    public float getCost() {
        return cost;
    }
}
