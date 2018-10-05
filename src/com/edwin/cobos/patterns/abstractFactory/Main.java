package com.edwin.cobos.patterns.abstractFactory;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        GiftItem item1 = new GiftItem("1", "product - 1", "This is the product 1", PackagingType.WRAP);
        GiftItem item2 = new GiftItem("2", "product - 2", "This is the product 2", PackagingType.BOX);
        GiftItem item3 = new GiftItem("3", "product - 3", "This is the product 3", PackagingType.BAG);
        GiftItem item4 = new GiftItem("4", "product - 4", "This is the product 4", PackagingType.BOX);
        GiftItem item5 = new GiftItem("5", "product - 5", "This is the product 5", PackagingType.WRAP);
        GiftItem item6 = new GiftItem("6", "product - 6", "This is the product 6", PackagingType.BAG);


        GiftPack pack1 = new GiftPack(null, PackType.BUSINESS);
        pack1.setGiftItems(Arrays.asList(item1, item2, item3, item4, item5, item6));
        float packTotal1 = pack1.calculateTotalCost();
        System.out.println(packTotal1);

        GiftPack pack2 = new GiftPack(null, PackType.ADULTS);
        pack2.setGiftItems(Arrays.asList(item1, item2, item3, item4, item5, item6));
        float packTotal2 = pack2.calculateTotalCost();
        System.out.println(packTotal2);

        GiftPack pack3 = new GiftPack(null, PackType.KIDS);
        pack3.setGiftItems(Arrays.asList(item1, item2, item3, item4, item5, item6));
        float packTotal3 = pack3.calculateTotalCost();
        System.out.println(packTotal3);
    }

}
