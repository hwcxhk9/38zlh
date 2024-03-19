package KaiY;

import static org.junit.Assert.assertEquals;

import KaiY.Two;
import org.junit.Test;

public class TwoTest {

    @Test
    public void testCalculateFactorial() {
        Two to = new Two();

        // 测试计算0的阶乘
        assertEquals(1, to.calculateFactorial(0));

        // 测试计算正整数的阶乘
        assertEquals(1, to.calculateFactorial(1));
        assertEquals(2, to.calculateFactorial(2));
        assertEquals(6, to.calculateFactorial(3));
        assertEquals(24, to.calculateFactorial(4));
        assertEquals(120, to.calculateFactorial(5));
    }
}
