package edu.course.lab01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void returnsTrueForZero() {
        boolean result = CourseToolkit.isEven(0);

        assertTrue(result);
    }

    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {6, 9})
    void returnsFalseForPrime(int value) {
        boolean result = CourseToolkit.isPrime(value);

        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 11})
    void returnsTrueForPrime(int value) {
        boolean result = CourseToolkit.isPrime(value);

        Assertions.assertTrue(result);
    }

    @Test
    void returnsTrueForPalindrome() {
        boolean result = CourseToolkit.isPalindrome("ОззО");

        assertTrue(result);
    }

    @Test
    void returnsFalseForCaseError() {
        boolean result = CourseToolkit.isPalindrome("ОзЗО");

        assertFalse(result);
    }

    @Test
    void returnsFalseForNotPalindrome() {
        boolean result = CourseToolkit.isPalindrome("1234");

        assertFalse(result);
    }

    @Test
    void returnsFalseForNull() {
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.isPalindrome(null));
    }

    @Test
    void returnsPositiveRes() {
        int[] numbers = {1, 2, 3};
        double result = CourseToolkit.average(numbers);

        assertEquals(2, result, 1e-9);
    }

    @Test
    void returnsNegativeRes() {
        int[] numbers = {1, -2, -5};
        double result = CourseToolkit.average(numbers);

        assertEquals(-2, result, 1e-9   );
    }

    @Test
    void returnsFalseForWrongArgument() {
        int[] numbers = {};
        assertThrows(IllegalArgumentException.class, () -> CourseToolkit.average(numbers));
    }
}
