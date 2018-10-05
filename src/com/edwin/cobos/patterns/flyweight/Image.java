package com.edwin.cobos.patterns.flyweight;

import java.util.Random;

public class Image {

    private String id;
    private String data;

    public Image(String id) {
        this.id = id;
        Random rand = new Random();
        data = String.valueOf(rand.nextInt(Integer.MAX_VALUE) + 1);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Image id: " + id + "\nData: " + data;
    }
}
