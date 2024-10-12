import org.calculator.Calculator;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        Calculator calculator= new Calculator();
        System.out.println(calculator.processExpression("100*20/2"));
    }
}
