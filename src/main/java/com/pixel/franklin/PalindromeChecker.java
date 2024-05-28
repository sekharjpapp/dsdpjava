package com.pixel.franklin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PalindromeChecker {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(isPalindrome(str));
        List<String> words = Arrays.asList("level", "java", "radar", "apple", "noon", "banana");

        List<String> palindromes = words.stream()
                .filter(PalindromeChecker::isPalindrome)
                .collect(Collectors.toList());
        System.out.println(palindromes);
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
