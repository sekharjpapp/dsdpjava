package com.pixel.stringgroupby;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringGroupSample {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("apple", "orange", "apple", "Grapes",null,""," ");

        Map<String, Long> stringLongMap = stringList.stream()
                .filter(Objects::nonNull)
                .filter(s-> !s.isEmpty())
                .filter(s-> !s.isBlank())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringLongMap);

        List<Integer> salaries = Arrays.asList(1000, 2000, 1500, 3000, 2500, 2500);
        int n = 2; // Find the 2nd highest salary

        Optional<Integer> nthHighestSalary = salaries.stream()
                .distinct() // Remove duplicates if any
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(n - 1) // Skip first (n-1) elements
                .findFirst(); // Find the first element, which is the nth highest salary

        if (nthHighestSalary.isPresent()) {
            int targetSalary = nthHighestSalary.get();
            List<Integer> occurrences = salaries.stream()
                    .filter(s -> s == targetSalary)
                    .toList(); // Collect occurrences into a list
            System.out.println("Occurrences of the " + n + "th highest salary: " + occurrences);
        } else {
            System.out.println("There are not enough distinct salaries to find the " + n + "th highest salary.");
        } 
    }
}
