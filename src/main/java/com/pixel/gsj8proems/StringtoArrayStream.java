package com.pixel.gsj8proems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringtoArrayStream {
    public static void main(String[] args) {

        String[] str = {"apple", "orange"};

        Map<String, Long> longMap = Arrays.stream(str).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(longMap);
    }
}
