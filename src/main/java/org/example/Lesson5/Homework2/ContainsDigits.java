package org.example.Lesson5.Homework2;

public class ContainsDigits {
    public static boolean containsDigits(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                return true;
            }
        }
        return false;
    }
}
