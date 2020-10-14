package cn.hitwh.edu.test;

import cn.hitwh.edu.junit.Calculator;
import org.junit.*;

public class CalculatorTest {
    private Calculator cal = null;
    private int result;

    @Before
    public void init() {
        cal = new Calculator();
        System.out.println("init.......");
    }

    @Test
    public void testAdd() {
        result = cal.add(1, 2);
        System.out.println("test add............");
        Assert.assertEquals(3, result);
    }

    @Test
    public void testSub() {
        result = cal.sub(1, 2);
        System.out.println("test sub............");
        Assert.assertEquals(-1, result);
    }

    @After
    public void close() {
        System.out.println("close.......");
    }
}


