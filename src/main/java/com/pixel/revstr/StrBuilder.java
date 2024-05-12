package com.pixel.revstr;

public class StrBuilder {
    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println("Original string: " + str);

        long startTime = System.nanoTime(); // Start time

        String reversed = reverseString(str);

        long endTime = System.nanoTime(); // End time
        long elapsedTime = endTime - startTime; // Calculate elapsed time

        System.out.println("Reversed string: " + reversed);
        System.out.println("Time taken to reverse the string: " + elapsedTime + " nanoseconds");
        long startTime1 = System.nanoTime(); // Start time

        String reversed1 =reverseStringCustAlgo(str);

        long endTime1 = System.nanoTime(); // End time
        long elapsedTime1 = endTime1 - startTime1; // Calculate elapsed time
        System.out.println("reverseStringCustAlgo string: " + reversed1);
        System.out.println("Time taken to reverseStringCustAlgo the string: " + elapsedTime1 + " nanoseconds");
    }
    public static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();

        // Iterate through the original string from the end to the beginning
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i)); // Append each character to the StringBuilder
        }

        return reversed.toString(); // Convert StringBuilder to String and return
    }
    public static String reverseStringCustAlgo(String str) {
        if (str == null || str.length() <= 1)
            return str;

        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Swap characters at left and right pointers
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            // Move pointers towards each other
            left++;
            right--;
        }

        return new String(chars);
    }
}
