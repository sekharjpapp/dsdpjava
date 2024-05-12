package com.pixel.isnullempty;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;

public class IsNullEmptyCheck {
    public static final Predicate<String> isNullEmpty = (t) -> Objects.isNull(t) || t.isBlank();

    public static void main(String[] args) {

        List<String> words = Arrays.asList("apple", "", "banana", null, "orange", "");
        List<String> nonEmptyWords = words.stream()
                .filter(isNullEmpty.negate())
                .toList();

        System.out.println(nonEmptyWords);
    }
}
