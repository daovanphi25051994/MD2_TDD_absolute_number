import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    @DisplayName("test 0 => 0")
    void testGetAbsolute() {
        int input = 0;
        int expected = 0;
        int actual = AbsoluteNumberCalculator.getAbsolute(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("test 1 => 1")
    void testGetAbsolute1() {
        int input = 1;
        int expected = 1;
        int actual = AbsoluteNumberCalculator.getAbsolute(input);
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("test -1 => 1")
    void testGetAbsolute2() {
        int input = -1;
        int expected = 1;
        int actual = AbsoluteNumberCalculator.getAbsolute(input);
        assertEquals(expected, actual);
    }
}