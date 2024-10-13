package calculator;

import org.calculator.Calculator;
import org.junit.Test;

import java.io.IOException;
import java.util.EmptyStackException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.mock;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void shouldSum() {
        int valueOne = 1;
        int valueTwo = 2;

        int sum = calculator.sum(valueOne, valueTwo);
        assertEquals(3, sum);

    }

    @Test
    public void shouldSub() {
        int valueOne = 2;
        int valueTwo = 1;

        int sub = calculator.sub(valueOne, valueTwo);
        assertEquals(1, sub);

    }

    @Test
    public void shouldDivide() {
        float valueOne = 4f;
        float valueTwo = 2f;

        float divide = calculator.divide(valueOne, valueTwo);
        assertEquals(2, divide, 0.02);

    }

    @Test
    public void shouldMultiple() {
        float valueOne = 4f;
        float valueTwo = 2f;

        float multiply = calculator.multiple(valueOne, valueTwo);
        assertEquals(8, multiply, 0.02);

    }

    @Test
    public void shouldResolveMathExpression() throws IOException {
        String expressionMock = "(1+2)*3";

        float resultExpression = calculator.processExpression(expressionMock);
        assertEquals(9, resultExpression, 2);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldErrorInDivisionZero() {
        String expressionMock = "(10+3)/0";

        calculator.processExpression(expressionMock);

    }
    @Test(expected = EmptyStackException.class)
    public void shouldErrorEmptyStack() {
        String expressionMock = "+1";

        calculator.processExpression(expressionMock);

    }
}
