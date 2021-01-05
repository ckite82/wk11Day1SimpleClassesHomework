import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp(){
        calculator = new Calculator(150, 10, 8.5, 2.0);
    }

    @Test
    public void canAdd(){
        assertEquals(160, calculator.getAdd());
    }

    @Test
    public void canSubtract(){
        assertEquals(140, calculator.getSubtract());
    }

    @Test
    public void canMultiply(){
        assertEquals(1500, calculator.getMultiply());
    }

    @Test
    public void canDivide(){
        assertEquals(4.25, calculator.getDivide(), 0.01);
    }

}

//    Create a Calculator class. This should have functions for Add, Subtract, Multiply and Divide.