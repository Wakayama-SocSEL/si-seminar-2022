package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppExTest {
    @Test void testcase_ex_01() {
        long start = System.currentTimeMillis();
        App.primeNumberCount(10000000);
        long end = System.currentTimeMillis();
        assertTrue(end - start<=2000);
    }
}
