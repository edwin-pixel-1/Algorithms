package com.edwin.cobos.patterns.template;

public abstract class SymmetricLetter {

    protected String type;
    protected String fullLetter;

    public final void reconstructLetter(String asciiLetter, int cols, int rows) {
        switch (type) {
            case "VERTICAL":
                fullLetter = reconstructVerticalLetter(asciiLetter, cols, rows);
                break;
            case "HORIZONTAL":
                fullLetter = reconstructHorizontalLetter(asciiLetter, cols, rows);
                break;
            default:
                fullLetter = asciiLetter;
        }

    }

    public abstract String reconstructHorizontalLetter(String asciiLetter, int cols, int rows);

    public abstract String reconstructVerticalLetter(String asciiLetter, int cols, int rows);

    public final void print() {
        System.out.print(fullLetter);
    }
}
