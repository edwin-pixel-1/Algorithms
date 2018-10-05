package com.edwin.cobos.patterns.abstractFactory.packs;

public abstract class PackageFactory {

    public abstract Packaging createBag();

    public abstract Packaging createBox();

    public abstract Packaging createWrap();

}
