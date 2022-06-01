package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testcase_01() {
        int correct = 4;
        assertEquals(correct, App.primaryCount(10));
    }

    @Test void testcase_02() {
        int correct = 1;
        assertEquals(correct, App.primaryCount(2));
    }

    @Test void testcase_03() {
        int correct = 15;
        assertEquals(correct, App.primaryCount(50));
    }
}
