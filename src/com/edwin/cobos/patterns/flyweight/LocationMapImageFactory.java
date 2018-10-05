package com.edwin.cobos.patterns.flyweight;

import java.util.HashMap;

public class LocationMapImageFactory {

    private static HashMap<String, Image> images = new HashMap<>();

    public static Image getMapImage(String imageId, String coordinates) {
        Image image = null;
        String key = imageId + coordinates;
        if (!images.containsKey(key)) {
            image = new Image(imageId);
            images.put(key, image);
        } else {
            image = images.get(key);
        }
        return image;
    }
}
