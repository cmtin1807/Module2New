package ss9_Automated_Testing_TDD.thuc_hanh.tim_gia_tri_tuyet_doi;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AbsoluteNumberCalculatorTest {
    @Test
    @DisplayName("Absolute0")
    public void testAbsolute0() {
        int number = 0;
        int expected = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(0);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Absolute10")
    public void testAbsolute10() {
        int number = 10;
        int expected = 10;
        int result = AbsoluteNumberCalculator.findAbsolute(10);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("AbsoluteNegavite10")
    public void testAbsoluteNegavite10() {
        int number = -10;
        int expected = 10;
        int result = AbsoluteNumberCalculator.findAbsolute(10);
        assertEquals(expected, result);
    }

}
