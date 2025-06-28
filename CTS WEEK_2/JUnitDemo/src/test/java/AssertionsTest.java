import org.junit.Test;
import static org.junit.Assert.*;
public class AssertionsTest {
    @Test
    public void testAssertions() {
      Assertions obj=new Assertions();
        assertEquals(5, obj.add(2,3));
        assertTrue(obj.isGreat(5,3));
        assertFalse(obj.isLess(5,3));
        assertNull(obj.getNullObject());
        assertNotNull(obj.getNotNullObject());
    }

}
