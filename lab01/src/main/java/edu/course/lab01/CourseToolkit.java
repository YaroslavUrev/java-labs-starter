package edu.course.lab01;

import java.util.Arrays;

/**
 * Небольшие методы для первой лабораторной работы.
 */
public final class CourseToolkit {

    private CourseToolkit() {
        // Утилитарный класс не должен иметь экземпляров.
    }

    /**
     * Возвращает true, если число четное.
     */
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static boolean isPrime(int number) {
        if (number < 2) {return false;}
        for(int i = 2; i < number; i++){if (number % i == 0){return false;}}
        return true;
    }
    public static boolean isPalindrome(String text) {
        if (text == null) {throw new IllegalArgumentException("IllegalArgumentException");}
        for(int i = 0; i < text.length() / 2; i++){if (text.charAt(i) != text.charAt(text.length() - i - 1)) {return false;}}
        return true;
    }
    public static double average(int[] values) {
        if (values.length == 0){throw new IllegalArgumentException("IllegalArgumentException");}
        int ValuesSum = 0;
        for (int elem:values){
            ValuesSum += elem;
        }
        return (double)ValuesSum / values.length;
    }
}
