package com.pixel.stringissues;

public class ReverseEvenCharacterGroups {
    public static void main(String[] args) {
        String input = "abcdef";
        String result = reverseEvenCharacterGroups(input);
        System.out.println(result);
    }
    public static String reverseEvenCharacterGroups(String input) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            // Append the characters in reverse order for even indices
            if (i + 1 < input.length()) {
                sb.append(input.charAt(i + 1));
            }
            sb.append(input.charAt(i));
        }

        return sb.toString();
    }
}
