package com.pixel.revstr;

public class RemoveDuplicateStr {
    public static void main(String[] args) {
        String str = "programming";

        StringBuilder stringBuilder = new StringBuilder();
        str.chars().distinct().forEach(c->stringBuilder.append((char)c));
        System.out.println(stringBuilder);
    }
}
