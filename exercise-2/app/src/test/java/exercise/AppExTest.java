package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class AppExTest {
    public static String execute(String problem) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(problem.getBytes()));
        System.setOut(new PrintStream(out));

        App.main(new String[1]);

        return out.toString().replaceAll("\n+$", "");
    }

    @Test public void testcase_ex_01() {
        long start = System.currentTimeMillis();
        execute("10000000");
        long end = System.currentTimeMillis();
        assertTrue(end-start <= 2000);
    }
}
