package com.edwin.cobos.patterns.template;

public class DataService {
    public static String getLetterA() {
        String result = "VERTICAL\n"+
                "5\n"+
                "14\n"+
                "-----\n"+
                "----+\n"+
                "---++\n"+
                "--++-\n"+
                "--++-\n"+
                "-++--\n"+
                "-++--\n"+
                "-++--\n"+
                "-++++\n"+
                "-++--\n"+
                "-++--\n"+
                "-++--\n"+
                "-++--\n"+
                "-++--\n";
        return result;
    }

    public static String getLetterB() {
        String result = "NONE\n"+
                "9\n"+
                "14\n"+
                "---------\n"+
                "-+++++---\n"+
                "-++--++--\n"+
                "-++---++-\n"+
                "-++---++-\n"+
                "-++---++-\n"+
                "-++--++--\n"+
                "-++++++--\n"+
                "-++---++-\n"+
                "-++----++\n"+
                "-++----++\n"+
                "-++----++\n"+
                "-++---++-\n"+
                "-++++++--\n";
        return result;
    }

    public static String getLetterC() {
        String result = "HORIZONTAL\n"+
                "9\n"+
                "8\n"+
                "---------\n"+
                "---++++--\n"+
                "--++--++-\n"+
                "-++----++\n"+
                "-++------\n"+
                "-++------\n"+
                "-++------\n"+
                "-++------\n";
        return result;
    }
}
