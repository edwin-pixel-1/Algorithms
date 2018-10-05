package com.edwin.cobos.patterns.mediator.utils;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;

import java.util.HashMap;

public class ImageFactory {
    private static HashMap<String, ImagePattern> patterns;

    static {
        patterns = new HashMap<>();
    }

    public static ImagePattern getImagePattern(String url) {
        ImagePattern image;
        if (!patterns.containsKey(url)) {
            image = new ImagePattern(new Image(url));
            patterns.put(url, image);
        } else {
            image = patterns.get(url);
        }

        return image;
    }
}
