package calculator;

import org.calculator.Calculator;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void shouldSum() {
        int valueOne = 1;
        int valueTwo = 2;
        Calculator calculator = new Calculator();
        int sum = calculator.sum(valueOne, valueTwo);
        assertEquals(3, sum);

    }

    @Test
    public void shouldSub() {
        int valueOne = 2;
        int valueTwo = 1;
        Calculator calculator = new Calculator();
        int sub = calculator.sub(valueOne, valueTwo);
        assertEquals(1, sub);

    }

    @Test
    public void shouldDivide() {
        float valueOne = 4f;
        float valueTwo = 2f;
        Calculator calculator = new Calculator();
        float divide = calculator.divide(valueOne, valueTwo);
        assertEquals(2, divide, 0.02);

    }

    @Test
    public void shouldMultiple() {
        float valueOne = 4f;
        float valueTwo = 0f;
        Calculator calculator = new Calculator();
        float multiply = calculator.multiple(valueOne, valueTwo);
        assertEquals(0, multiply, 0.02);

    }

    @Test
    public void shouldResolveMathExpression() throws IOException {
        String expressionMock="(1+2)*3";
        Calculator calculator= new Calculator();
        float resultExpression=calculator.processExpression(expressionMock);
        assertEquals(9,resultExpression,2);

    }
}
