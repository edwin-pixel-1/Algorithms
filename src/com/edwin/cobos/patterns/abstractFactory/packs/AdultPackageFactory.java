package com.edwin.cobos.patterns.abstractFactory.packs;

public class AdultPackageFactory extends PackageFactory {
    @Override
    public Packaging createBag() {
        return new ReusableShopper(0);
    }

    @Override
    public Packaging createBox() {
        return new PlainPaper(0.25f);
    }

    @Override
    public Packaging createWrap() {
        return new EverydayValue(0);
    }
}
