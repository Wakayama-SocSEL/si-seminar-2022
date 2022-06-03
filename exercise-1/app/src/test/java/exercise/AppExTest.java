package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.*;

class AppExTest {
    @Test void testcase_ex_01() {
        try{
            Path file = Paths.get("./src/main/java/exercise/App.java");
            String text = Files.readString(file);
            assertTrue(text.length() <= 300);
        }catch(Exception e){
            fail();
        }
    }
}
