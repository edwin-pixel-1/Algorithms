package com.edwin.cobos.patterns.interpreter.operations;

import com.edwin.cobos.patterns.interpreter.Expression;

public class Substraction implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public Substraction(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret() {
        return leftOperand.interpret() - rightOperand.interpret();
    }
}
