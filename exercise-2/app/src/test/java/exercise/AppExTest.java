package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class AppExTest {
    public static String question(String problem) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setIn(new ByteArrayInputStream(problem.getBytes()));
        System.setOut(new PrintStream(out));

        App.main(new String[1]);

        return out.toString().replaceAll("\n+$", "");
    }

    @Test void testcase_ex_01() {
        long start = System.currentTimeMillis();
        question("10000000");
        long end = System.currentTimeMillis();
        assertTrue(end-start <= 2000);
    }
}
