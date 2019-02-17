package test;

import calculation.*;
import org.junit.*;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestArithmetics {

    private static Arithmetics arithmetics;

    @Rule
    public final ExpectedException exp = ExpectedException.none();

    @Rule
    public Timeout timeout = new Timeout(1000);

    @BeforeClass
    public static  void runT() {
        arithmetics = new Arithmetics();

    }

    @Test
    public void testAdd() {
        double res = arithmetics.add(3, 7);
//        if (res != 10) Assert.fail();
//        Assert.assertTrue("Wrong",res == 10);
//        Assert.assertFalse(res == 9);
//        Assert.assertNull(null);
//        Assert.assertNotNull(arithmetics);
        Assert.assertEquals(res,10.0, 0.00001);
    }

    @Ignore
    @Test
    public void testDeduct() {
        double res = arithmetics.deduct(3, 7);
        Assert.assertEquals(res,-4.0, 0.00001);
    }

    @Test
    public void testMult() {
        double res = arithmetics.mult(3, 7);
        Assert.assertEquals(res,21.0, 0.00001);
    }

    @Test
    public void testDiv() {
        double res = arithmetics.div(10, 5);
        Assert.assertEquals(res,2.0, 0.00001);
    }

//    @Test(expected = ArithmeticException.class)
    @Test
    public void testDivException() {
        exp.expect(ArithmeticException.class);
        arithmetics.div(10.0, 0.0);
    }

//    @Test(timeout = 1000)
    @Test
    public void TestN() {

        while (true) {}
//    arithmetics.div(10.0, 2.0);
    }


}

