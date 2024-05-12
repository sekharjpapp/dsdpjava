package com.pixel.j8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SupplierSample {
    private final Map<Integer, Integer> cache = new HashMap<>();

    public int calculateFibonacci(int n) {
        return fibonacciSupplier(n).get();
    }

    private Supplier<Integer> fibonacciSupplier(int n) {
        return () -> {
            // Base case
            if (n <= 1) {
                return n;
            }

            // Check if already computed
            if (!cache.containsKey(n)) {
                // Compute Fibonacci number (with caching)
                int fib = fibonacciSupplier(n - 1).get() + fibonacciSupplier(n - 2).get();
                cache.put(n, fib);
            }

            return cache.get(n);
        };
    }
    public static void main(String[] args) {
        SupplierSample  calculator = new SupplierSample();
        int fib10 = calculator.calculateFibonacci(10);
            System.out.println("Fibonacci of 10: " + fib10);

        LocalDate date1 = LocalDate.of(2024, 1, 1);
        LocalDate date2 = LocalDate.of(2024, 4, 1);

        // Create a Supplier to compute the difference between the dates
        Supplier<Long> dateDifferenceSupplier = () -> ChronoUnit.DAYS.between(date1, date2);

        // Get the difference between the dates when needed
        long difference = dateDifferenceSupplier.get();
        System.out.println("Difference in days: " + difference);
    }
}
