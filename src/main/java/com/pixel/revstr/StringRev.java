package com.pixel.revstr;

public class StringRev {
    public static void main(String[] args) {
        String str = "hello";
        char[] charArray = str.toCharArray();

        for (int i=charArray.length-1; i>=0; i--){
            System.out.print(charArray[i]);
        }
        for (int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
        String str1 = "Hello World!";
        System.out.println("Original String is " + str1);
        System.out.print(" Reversed String is ");
        String reversed = reverseString(str1);
        System.out.println(reversed);
    }
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left++] = charArray[right];
            charArray[right--] = temp;
        }
        return new String(charArray);
    }
    }
