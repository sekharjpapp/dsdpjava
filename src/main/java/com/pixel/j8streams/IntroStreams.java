package com.pixel.j8streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntroStreams {
    public static void main(String[] args) {
        int[] primitivesData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] objectsData = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] stringsData = {"apple", "orange", "banana", "mango"};
        String str = "Student techniques";

        Arrays.stream(primitivesData).forEach(System.out::println);
        Stream.of(objectsData).forEach(System.out::println);
        Map<String, Long> groupByStr = Stream.of(stringsData)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //System.out.println(groupByStr);
        LinkedHashMap<Character, Long> collect = str.chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        Optional<Character> nonRepeating = collect.entrySet().stream().filter(e -> e.getValue() > 1)
                .map(e -> e.getKey()).findFirst();
        System.out.println(nonRepeating.get());
    }
}
