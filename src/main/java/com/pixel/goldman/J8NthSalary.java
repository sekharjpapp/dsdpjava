package com.pixel.goldman;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class J8NthSalary {
    public static void main(String[] args) {
          Map<String,Integer> map = new HashMap<>();

          map.put("John", 1000);
          map.put("Tom", 2000);
          map.put("Steve", 1500);
          map.put("Alice", 3000);
          map.put("Sam", 2500);
          map.put("Jen", 2500);
          map.put("Bill", 2500);

          System.out.println(findNthHighestSalary(map, 1));
    }

    private static Optional<Map.Entry<String, Integer>> findNthHighestSalary(Map<String, Integer> map, int i) {
        Optional<Map.Entry<String, Integer>> first = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .skip(i - 1)
                .findFirst();
        return first;
    }
}
