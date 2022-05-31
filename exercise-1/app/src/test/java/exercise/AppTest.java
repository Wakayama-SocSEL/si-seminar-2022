package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        //assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
        assertEquals("Hello World!", classUnderTest.getGreeting());
    }

    @Test void appHasAGreeting2() {
        App classUnderTest = new App();
        //assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
        assertEquals("Hello World", classUnderTest.getGreeting());
    }
}
