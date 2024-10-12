package org.calculator;


import java.util.Stack;

public class Calculator {

    public int sum(final int valueA, final int valueB) {
        return valueA + valueB;
    }

    public int sub(final int valueA, final int valueB) {
        return valueA - valueB;
    }

    public float divide(final float valueA, final float valueB) {
        return valueA / valueB;
    }

    public float multiple(final float valueA, final float valueB) {
        return valueA * valueB;
    }

    public Float processExpression(String expression) {
        Stack<Float> values = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == ' ')
                continue;

            if (Character.isDigit(c)) {
                StringBuilder sbuf = new StringBuilder();


                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    sbuf.append(expression.charAt(i++));
                }
                values.push((float)Integer.parseInt(sbuf.toString()));

                i--;
            }

            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operators.isEmpty() && hasPrecedence(c, operators.peek())) {
                    values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(c);
            }
        }

        while (!operators.isEmpty()) {
            values.push(applyOperator(operators.pop(), values.pop(), values.pop()));
        }


        return values.pop();
    }


    private boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')')
            return false;
        return (op1 != '*' && op1 != '/') || (op2 != '+' && op2 != '-');
    }

    private float applyOperator(char op, float b, float a) {
        return switch (op) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '/' -> {
                if (b == 0)
                    throw new UnsupportedOperationException("Division error");
                yield a / b;
            }
            default -> 0;
        };
    }


}
