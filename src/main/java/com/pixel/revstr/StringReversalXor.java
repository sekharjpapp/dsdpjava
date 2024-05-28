package com.pixel.revstr;

public class StringReversalXor {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println("Original String: " + str);
        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);
    }
    public static String reverseString(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap chars[left] and chars[right] using XOR
            chars[left] ^= chars[right];
            chars[right] ^= chars[left];
            chars[left] ^= chars[right];

            left++;
            right--;
        }

        return new String(chars);
    }
}
