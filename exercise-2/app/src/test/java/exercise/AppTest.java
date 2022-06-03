package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppTest {
    public static String question(String problem) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(problem.getBytes()));
        System.setOut(new PrintStream(out));

        App.main(new String[1]);

        return out.toString().replaceAll("\n+$", "");
    }

    @Test void testcase_01() {
        String correct = "4";
        String answer = question("10");
        assertEquals(correct, answer);
    }

    @Test void testcase_02() {
        String correct = "1";
        String answer = question("2");
        assertEquals(correct, answer);
    }

    @Test void testcase_03() {
        String correct = "15";
        String answer = question("50");
        assertEquals(correct, answer);
    }
}
