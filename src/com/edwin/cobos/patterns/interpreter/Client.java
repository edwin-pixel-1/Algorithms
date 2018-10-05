package com.edwin.cobos.patterns.interpreter;

public class Client {

    public static void main(String[] args) {
        String expression = "- + 10 5 - 8 2";

        Evaluator sentence = new Evaluator(expression);
        int result = sentence.interpret();
        System.out.println(result);
    }

}
