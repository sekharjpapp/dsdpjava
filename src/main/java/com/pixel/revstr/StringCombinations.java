package com.pixel.revstr;

import java.util.ArrayList;
import java.util.List;

public class StringCombinations {
    public static void main(String[] args) {
        String input = "ABC";
        List<String> combinations = generateCombinations(input);

        System.out.println("Combinations for \"" + input + "\":");
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
    public static List<String> generateCombinations(String input) {
        List<String> combinations = new ArrayList<>();
        generateCombinationsHelper(input, "", 0, combinations);
        return combinations;
    }

    private static void generateCombinationsHelper(String input, String current, int index, List<String> combinations) {
        if (index == input.length()) {
            combinations.add(current);
            return;
        }
        // Include current character
        generateCombinationsHelper(input, current + input.charAt(index), index + 1, combinations);
        // Exclude current character
        generateCombinationsHelper(input, current, index + 1, combinations);
    }
}
