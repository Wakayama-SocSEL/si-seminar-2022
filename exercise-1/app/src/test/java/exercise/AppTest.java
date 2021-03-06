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
        String correct = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz";
        String answer = execute("10");
        assertEquals(correct, answer);
    }

    @Test public void testcase_02() {
        String correct = "1";
        String answer = execute("1");
        assertEquals(correct, answer);
    }

    @Test public void testcase_03() {
        String correct = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n16\n17\nFizz\n19\nBuzz\nFizz\n22\n23\nFizz\nBuzz\n26\nFizz\n28\n29\nFizzBuzz\n31\n32\nFizz\n34\nBuzz\nFizz\n37\n38\nFizz\nBuzz\n41\nFizz\n43\n44\nFizzBuzz\n46\n47\nFizz\n49\nBuzz\nFizz\n52\n53\nFizz\nBuzz\n56\nFizz\n58\n59\nFizzBuzz\n61\n62\nFizz\n64\nBuzz\nFizz\n67\n68\nFizz\nBuzz\n71\nFizz\n73\n74\nFizzBuzz\n76\n77\nFizz\n79\nBuzz\nFizz\n82\n83\nFizz\nBuzz\n86\nFizz\n88\n89\nFizzBuzz\n91\n92\nFizz\n94\nBuzz\nFizz\n97\n98\nFizz\nBuzz";
        String answer = execute("100");
        assertEquals(correct, answer);
    }
}
