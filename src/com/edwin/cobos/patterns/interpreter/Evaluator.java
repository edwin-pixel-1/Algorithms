package com.edwin.cobos.patterns.interpreter;

import com.edwin.cobos.patterns.interpreter.operations.Addition;
import com.edwin.cobos.patterns.interpreter.operations.Number;
import com.edwin.cobos.patterns.interpreter.operations.Substraction;

import java.util.Stack;

public class Evaluator implements Expression {

    private Expression result;

    public Evaluator(String expression) {
        Stack<Expression> expressionStack = new Stack<Expression>();

        String expressionReversed = new StringBuffer(expression).reverse().toString();
        for (String token : expressionReversed.split(" ")) {
            if (token.equals("+")) {
                Expression subExpression = new Addition(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (token.equals("-")) {
                Expression subExpression = new Substraction(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else {
                String number = new StringBuilder(token).reverse().toString();
                expressionStack.push(new Number(Integer.parseInt(number)));
            }
        }

        result = expressionStack.pop();
    }

    public int interpret() {
        return result.interpret();
    }

}
