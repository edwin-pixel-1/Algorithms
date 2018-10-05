package com.edwin.cobos.patterns.template;

public class Letter extends SymmetricLetter {

    public Letter(String[] letter) {
        this.type = letter[0];
        int cols = Integer.parseInt(letter[1]);
        int rows = Integer.parseInt(letter[2]);
        StringBuilder asciiLetter = new StringBuilder();
        for(int i = 3; i < letter.length; i++) {
            asciiLetter.append(letter[i]);
            asciiLetter.append("\n");
        }
        reconstructLetter(asciiLetter.toString(), cols, rows);
    }

    @Override
    public String reconstructHorizontalLetter(String asciiLetter, int cols, int rows) {
        String[] letterSplit = asciiLetter.split("\n");
        StringBuilder result = new StringBuilder(asciiLetter);
        for (int i = letterSplit.length - 1; i >= 0; i--) {
            String line = letterSplit[i] + "\n";
            result.append(line);
        }
        return result.toString();
    }

    @Override
    public String reconstructVerticalLetter(String asciiLetter, int cols, int rows) {
        String[] letterSplit = asciiLetter.split("\n");
        StringBuilder result = new StringBuilder();
        for (String line : letterSplit) {
            StringBuilder sb = new StringBuilder(line);
            sb.reverse();
            sb.insert(0, line);
            sb.append("\n");
            result.append(sb.toString());
        }
        return result.toString();
    }
}
