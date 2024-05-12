package com.pixel.revstr;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCountSample {
    public static void main(String[] args) {
        printNumbers(0);
    }
    public static void printNumbers(int a) {
        if (a  > 1) {
            printNumbers(a - 1);
        }
        System.out.println(a);
    }

}
