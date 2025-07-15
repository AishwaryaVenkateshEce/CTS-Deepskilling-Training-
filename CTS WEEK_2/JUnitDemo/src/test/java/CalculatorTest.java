import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void testMul(){
        Calculator calculator=new Calculator();
        int result=calculator.mul(2,3);
        assertEquals(6,result);
    }

}
