import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        this.calculator = new Calculator();
    }

    @Test
    public void canAdd(){
        assertEquals(3,calculator.add(1,2));
    }

    @Test
    public void canSubtract(){
        assertEquals(1,calculator.subtract(3,2));
    }

    @Test
    public void canMultiply(){
        assertEquals(12,calculator.multiply(2,6));
    }

    @Test
    public void canDivide(){
        assertEquals(2,calculator.divide(12,6));
    }
}
