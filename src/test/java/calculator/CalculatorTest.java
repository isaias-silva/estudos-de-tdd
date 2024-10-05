package calculator;

import org.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void shouldSum(){
        int valueOne=1;
        int valueTwo=2;
        Calculator calculator= new Calculator();
        int sum= calculator.sum(valueOne,valueTwo);
        assertEquals(3,sum);

    }
    @Test
    public void shouldSub(){
        int valueOne=2;
        int valueTwo=1;
        Calculator calculator= new Calculator();
        int sub= calculator.sub(valueOne,valueTwo);
        assertEquals(1,sub);

    }
    @Test
    public void shouldDivide(){
        int valueOne=4;
        int valueTwo=2;
        Calculator calculator= new Calculator();
        float divide= calculator.divide(valueOne,valueTwo);
        assertEquals(2,divide,0.02);

    }
    @Test
    public void shouldMultiple(){
        int valueOne=4;
        int valueTwo=2;
        Calculator calculator= new Calculator();
        float multiply= calculator.multiple(valueOne,valueTwo);
        assertEquals(8,multiply,0.02);

    }

}
