package com.edwin.cobos.patterns.command.square;

public class Square {

    private int size;
    private float scale = 1;
    private int posX = 0;
    private int posY = 0;

    public Square(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getScale() {
        return scale;
    }

    public void setScale(float scale) {
        this.scale = scale;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public void moveX(int x) {
        this.posX += x;
    }

    public void moveY(int y) {
        this.posY += y;
    }

    public void scale(float s) {
        this.scale += s;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int s = 0; s < posY; s++) {
            result.append("\n");
        }
        for (int i = 0; i < size * scale; i++) {
            for (int s = 0; s < posX; s++) {
                result.append(" ");
            }
            for (int j = 0; j < size * scale; j++) {
                result.append("0");
            }
            result.append("\n");
        }
        return result.toString();
    }

}
