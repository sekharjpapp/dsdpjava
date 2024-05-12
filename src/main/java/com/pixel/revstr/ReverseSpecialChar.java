package com.pixel.revstr;

public class ReverseSpecialChar {
    public static void main(String[] args) {
        String str = "@J!a$v*a";

        String s = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
    }
}
