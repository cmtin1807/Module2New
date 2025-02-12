package ss9_Automated_Testing_TDD.bai_tap.chuong_trinh_tinh_ket_qua_fizzbuzz;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static ss9_Automated_Testing_TDD.bai_tap.chuong_trinh_tinh_ket_qua_fizzbuzz.FizzBuzz.fizzBuzz;

public class FizzBuzzTest {
    @Test
    void testFizz3() {
        int number = 3;
        String expected = "Fizz";
        String result = fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizz6() {
        int number = 6;
        String expected = "Fizz";

        String result = fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testBuzz5() {
        int number = 5;
        String expected = "Buzz";

        String result = fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testBuzz10() {
        int number = 10;
        String expected = "Buzz";

        String result = fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz15() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = fizzBuzz(number);
        assertEquals(expected, result);
    }

    @Test
    void testFizzBuzz30() {
        int number = 30;
        String expected = "FizzBuzz";

        String result = fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    void testFizzBuzz44() {
        int number = 44;
        String expected = "bon bon";

        String result = fizzBuzz(number);
        assertEquals(expected, result);
    }
}
