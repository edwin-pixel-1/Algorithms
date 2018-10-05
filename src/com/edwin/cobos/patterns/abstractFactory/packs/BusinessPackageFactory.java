package com.edwin.cobos.patterns.abstractFactory.packs;

public class BusinessPackageFactory extends PackageFactory {
    @Override
    public Packaging createBag() {
        return new MerchantCollection(0.50f);
    }

    @Override
    public Packaging createBox() {
        return new HardPlastic(1.0f);
    }

    @Override
    public Packaging createWrap() {
        return new HolidaySurprise(0.25f);
    }
}
