import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayActAssertTest {
    private ArrayActAssert AAA;
    @Before
    public void setUp(){
        AAA=new ArrayActAssert();
        System.out.println("Setup completed");
    }
    @After
    public void tearDown(){
        System.out.println("Teardown completed");
        AAA=null;
    }
    @Test
    public void testAdd(){
        int result=AAA.add(5,3);
        assertEquals(8,result);
    }
    @Test
    public void testSub(){
        int result=AAA.sub(10,4);
        assertEquals(6,result);
    }
}
