package com.edwin.cobos.patterns.abstractFactory;

import com.edwin.cobos.patterns.abstractFactory.packs.Packaging;

public class GiftItem {

    private String giftId;
    private String giftName;
    private String description;
    private PackagingType packagingType; //"bag", "box", or "wrap".
    private Packaging packaging;

    public GiftItem(String giftId, String giftName, String description, PackagingType packagingType) {
        this.giftId = giftId;
        this.giftName = giftName;
        this.description = description;
        this.packagingType = packagingType;
    }

    public String getGiftId() {
        return giftId;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PackagingType getPackagingType() {
        return packagingType;
    }

    public void setPackagingType(PackagingType packagingType) {
        this.packagingType = packagingType;
    }

    public Packaging getPackaging() {
        return packaging;
    }

    public void setPackaging(Packaging packaging) {
        this.packaging = packaging;
    }

    public float getPackagingCost() {
        return packaging.getCost();
    }
}
