import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void testDiv() {
        double result = calculator.Division(2, 2);
        double expectedResult = 1;
        Assert.assertEquals(expectedResult, result, 0);
    }

}