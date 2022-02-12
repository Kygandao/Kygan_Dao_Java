import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private static Calculator calc = new Calculator();

//INTEGERS
    //testing sum of two ints
    @Test
    public void shouldReturnSumOfInts() {
        String failMsg = "Expected to handle two integer sum";

        assertEquals(failMsg, 7, calc.add(5, 2));
        assertEquals(failMsg,-2, calc.add(-5, 3));
        assertEquals(failMsg, -10, calc.add(-5, -5));
    }

    //testing difference of two ints
    @Test
    public void shouldReturnDifferenceOfInts() {
        String failMsg = "Expected to handle two integer sum";

        assertEquals(failMsg, 3, calc.subtract(5, 2));
        assertEquals(failMsg,-8, calc.subtract(-5, 3));
        assertEquals(failMsg, 0, calc.subtract(-5, -5));
    }

    //testing multiplication of two ints
    @Test
    public void shouldReturnProductOfInts() {
        String failMsg = "Expected to handle two integer sum";

        assertEquals(failMsg, 10, calc.multiply(5, 2));
        assertEquals(failMsg,-15, calc.multiply(-5, 3));
        assertEquals(failMsg, 25, calc.multiply(-5, -5));
    }

    //testing division of two ints
    @Test
    public void shouldReturnDividedInts() {
        String failMsg = "Expected to handle two integer sum";

        assertEquals(failMsg, 2, calc.divide(5, 2));
        assertEquals(failMsg,-1, calc.divide(5, -3));
        assertEquals(failMsg, 1, calc.divide(-5, -5));
    }

// DOUBLES
    //testing sum of two doubles
    @Test
    public void shouldReturnSumOfDoubles() {
        String failMsg = "Expected to handle two Double sum";

        assertEquals(failMsg, 10.75, calc.add(5.5, 5.25), .0001);
        assertEquals(failMsg,-2, calc.add(-5, 3), .0001);
        assertEquals(failMsg, -10, calc.add(-5, -5), .0001);
    }

    //testing difference of two doubles
    @Test
    public void shouldReturnDifferenceOfDoubles() {
        String failMsg = "Expected to handle two Double sum";

        assertEquals(failMsg, 6.25, calc.subtract(11.5, 5.25), .0001);
        assertEquals(failMsg,-9.25, calc.subtract(-5.5, 3.75), .0001);
        assertEquals(failMsg, 1.25, calc.subtract(-8.25, -9.5), .0001);
    }

    //testing multiplication of two doubles
    @Test
    public void shouldReturnProductOfDoubles() {
        String failMsg = "Expected to handle two Double sum";

        assertEquals(failMsg, 60.375, calc.multiply(11.5, 5.25), .0001);
        assertEquals(failMsg,-20.625, calc.multiply(-5.5, 3.75), .0001);
        assertEquals(failMsg, 78.375, calc.multiply(-8.25, -9.5), .0001);
    }

    //testing division of two doubles
    @Test
    public void shouldReturnDividedDoubles() {
        String failMsg = "Expected to handle two Double sum";

        assertEquals(failMsg, 0.4313, calc.divide(2.2, 5.1), .0001);
        assertEquals(failMsg,-1.4666, calc.divide(-5.5, 3.75), .0001);
        assertEquals(failMsg, 0.8684, calc.divide(-8.25, -9.5), .0001);
    }
}