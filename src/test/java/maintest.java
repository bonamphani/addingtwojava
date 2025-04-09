import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testAddNumbers() {
        int result = Main.addNumbers(10, 20);
        assertEquals(30, result);
    }

    @Test
    public void testAddNegativeNumbers() {
        int result = Main.addNumbers(-5, -3);
        assertEquals(-8, result);
    }

    @Test
    public void testAddZero() {
        int result = Main.addNumbers(0, 0);
        assertEquals(0, result);
    }
}

