package com.edwin.cobos.patterns.interpreter.operations;

import com.edwin.cobos.patterns.interpreter.Expression;

public class Number implements Expression {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }
}
