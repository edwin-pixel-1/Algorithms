package com.edwin.cobos.patterns.interpreter.operations;

import com.edwin.cobos.patterns.interpreter.Expression;

public class Addition implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public Addition(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret() {
        return leftOperand.interpret() + rightOperand.interpret();
    }


}
