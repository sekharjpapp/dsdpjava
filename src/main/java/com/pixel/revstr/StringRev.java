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
    }
}
