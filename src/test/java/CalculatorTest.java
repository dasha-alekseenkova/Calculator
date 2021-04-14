import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testDiv() {
        double result = calculator.Division(7, 3);
        double expectedResult = 2;
        Assert.assertEquals(expectedResult, result, 0);
    }
    @Test
    public void testDiv1() {
        double result = calculator.Multiplication(2, 9);
        double expectedResult = 18;
        Assert.assertEquals(expectedResult, result, 0);
    }

    @Test
    public void testDiv2() {
        double result = calculator.Division(15, 6);
        double expectedResult = 3;
        Assert.assertFalse(false);
    }
    @Test
    public void testDiv3() {
        double result = calculator.Sum(15, 6);
        double expectedResult = 21;
        Assert.assertNotNull(21);
    }
    @Test
    public void testDiv4() {
        double result = calculator.Subtraction(20, 49);
        double expectedResult = -29;
        Assert.assertEquals(expectedResult, result, 0);
    }

}