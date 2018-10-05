package com.edwin.cobos.patterns.abstractFactory.packs;

public class KidPackageFactory extends PackageFactory {
    @Override
    public Packaging createBag() {
        return new Micky(0.25f);
    }

    @Override
    public Packaging createBox() {
        return new Cartoon(0.50f);
    }

    @Override
    public Packaging createWrap() {
        return new HappyKid(0.10f);
    }
}
