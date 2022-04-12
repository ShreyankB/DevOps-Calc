import Calculator.calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    calculator cal = new calculator();

    @Test
    public void sqrt_test(){
        assertEquals("Positive Testing for squart root funcition", 6.0, cal.square_root(36), 0);
        assertNotEquals("Negative Testing for squart root function", 9.0, cal.square_root(100), 0);
    }

    @Test
    public void factorial_test(){
        assertEquals("Positive Testing for factorial funcition", 6.0, cal.factorial(3), 0);
        assertNotEquals("Negative Testing for factorial function", 25.0, cal.factorial(5), 0);
    }

    @Test
    public void natural_test(){
        assertEquals("Positive Testing for natural log funcition", 1.6094379124341003, cal.logarithm(5), 0);
        assertNotEquals("Negative Testing for natural log function", 10.0, cal.logarithm(10), 0);
    }

    @Test
    public void power_test(){
        assertEquals("Positive Testing for power funcition", 25.0, cal.power(5, 2), 0);
        assertNotEquals("Negative Testing for power function", 5.0, cal.power(5, 2), 0);
    }
}
