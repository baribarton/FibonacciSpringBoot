package fibonacci.FibonacciSpringBoot;

import com.fibonacci.spring.Fibonacci;
import com.fibonacci.spring.StringsUtil;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class FibonacciTests {

    @Test
    public void testFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        assertEquals(StringsUtil.INVALID_FIBONACCI_INPUT, fibonacci.getFibonacciNumber(-1));
        assertEquals("[]", fibonacci.getFibonacciNumber(0));
        assertEquals("[0]", fibonacci.getFibonacciNumber(1));
        assertEquals("[0, 1]", fibonacci.getFibonacciNumber(2));
        assertEquals("[0, 1, 1, 2, 3]", fibonacci.getFibonacciNumber(5));
    }
}
