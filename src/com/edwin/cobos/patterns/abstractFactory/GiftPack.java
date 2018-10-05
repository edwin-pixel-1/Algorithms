package com.edwin.cobos.patterns.abstractFactory;

import com.edwin.cobos.patterns.abstractFactory.packs.AdultPackageFactory;
import com.edwin.cobos.patterns.abstractFactory.packs.BusinessPackageFactory;
import com.edwin.cobos.patterns.abstractFactory.packs.KidPackageFactory;
import com.edwin.cobos.patterns.abstractFactory.packs.PackageFactory;

import java.util.List;

public class GiftPack {

    private List<GiftItem> giftItems;
    private Address shippingAddress;
    private PackType packType;
    private PackageFactory factory;

    public GiftPack(Address shippingAddress, PackType packType) {
        this.shippingAddress = shippingAddress;
        this.packType = packType;

        switch (packType) {
            case BUSINESS:
                factory = new BusinessPackageFactory();
                break;
            case ADULTS:
                factory = new AdultPackageFactory();
                break;
            case KIDS:
                factory = new KidPackageFactory();
                break;
        }
    }

    public List<GiftItem> getGiftItems() {
        return giftItems;
    }

    public void setGiftItems(List<GiftItem> giftItems) {
        this.giftItems = giftItems;

        if (giftItems != null) {
            for (GiftItem item : giftItems) {
                switch (item.getPackagingType()) {
                    case BAG:
                        item.setPackaging(factory.createBag());
                        break;
                    case BOX:
                        item.setPackaging(factory.createBox());
                        break;
                    case WRAP:
                        item.setPackaging(factory.createWrap());
                        break;
                }
            }
        }
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public PackType getPackType() {
        return packType;
    }

    public void setPackType(PackType packType) {
        this.packType = packType;
    }

    public PackageFactory getFactory() {
        return factory;
    }

    public void setFactory(PackageFactory factory) {
        this.factory = factory;
    }

    public float calculateTotalCost() {
        float result = 0;
        for (GiftItem item : giftItems) {
            result += item.getPackagingCost();
        }
        return result;
    }
}
