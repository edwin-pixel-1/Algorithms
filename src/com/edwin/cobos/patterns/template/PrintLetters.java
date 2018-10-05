package com.edwin.cobos.patterns.template;

public class PrintLetters {

    public static void main(String[] args) {
        //Letter A
        String fileLetterA = DataService.getLetterA();
        String[] letterASplit = fileLetterA.split("\n");

        Letter letterA = new Letter(letterASplit);

        letterA.print();

        //Letter B
        String fileLetterB = DataService.getLetterB();
        String[] letterBSplit = fileLetterB.split("\n");

        Letter letterB = new Letter(letterBSplit);

        letterB.print();

        //Letter C
        String fileLetterC = DataService.getLetterC();
        String[] letterCSplit = fileLetterC.split("\n");

        Letter letterC = new Letter(letterCSplit);

        letterC.print();
    }

}
