package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppTest {
    public static String execute(String problem) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(problem.getBytes()));
        System.setOut(new PrintStream(out));

        App.main(new String[1]);

        return out.toString().replaceAll("\n+$", "");
    }

    @Test public void testcase_01() {
        String correct = "4";
        String answer = execute("10");
        assertEquals(correct, answer);
    }

    @Test public void testcase_02() {
        String correct = "1";
        String answer = execute("2");
        assertEquals(correct, answer);
    }

    @Test public void testcase_03() {
        String correct = "15";
        String answer = execute("50");
        assertEquals(correct, answer);
    }
}
