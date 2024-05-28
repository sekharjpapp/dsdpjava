package com.pixel.backtracking;

import java.util.ArrayList;
import java.util.List;

public class SeatingArrangements {
    public static void main(String[] args) {
        char[] people = {'B', 'C', 'G'};
        List<List<Character>> results = new ArrayList<>();
        backtrack(people, new ArrayList<>(), new boolean[people.length], results);
        results.forEach(System.out::println);
    }
    private static void backtrack(char[] people, List<Character> current, boolean[] used, List<List<Character>> results) {
        if (current.size() == people.length) {
            results.add(new ArrayList<>(current));
            return;
        }

        for (int i = 0; i < people.length; i++) {
            if (used[i]) continue;  // Skip if this person is already used in the current arrangement

            // Make a choice
            used[i] = true;
            current.add(people[i]);

            // Explore further with this choice
            backtrack(people, current, used, results);

            // Undo the choice (backtrack)
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
}
