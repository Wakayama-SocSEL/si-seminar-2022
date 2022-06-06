package exercise;

import org.junit.Test;
import static org.junit.Assert.*;

import java.nio.file.*;

public class AppExTest {
    @Test public void testcase_ex_01() {
        try{
            Path file = Paths.get("./src/main/java/exercise/App.java");
            String text = Files.readString(file);
            assertTrue(text.length() <= 300);
        }catch(Exception e){
            fail();
        }
    }
}
