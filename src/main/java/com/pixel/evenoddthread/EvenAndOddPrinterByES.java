package com.pixel.evenoddthread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class EvenAndOddPrinterByES {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        evenCompleteTable(executorService);
        executorService.shutdown();
    }

    private static void evenCompleteTable(ExecutorService executorService) {
        IntStream.rangeClosed(1, 10)
                .forEach(num -> {
                    oddCompleteTable(num, executorService);

                    CompletableFuture<Integer> evenCompletableFuture = CompletableFuture.completedFuture(num)
                            .thenApplyAsync(x -> {
                                if (x % 2 == 0) {
                                    System.out.println("Thread Name " + Thread.currentThread().getName() + " : " + x);
                                }
                                return num;
                            }, executorService);
                    evenCompletableFuture.join();
                });
    }

    private static void oddCompleteTable(int num, ExecutorService executorService) {
        CompletableFuture<Integer> oddCompletableFuture = CompletableFuture.completedFuture(num)
                .thenApplyAsync(x -> {
                    if (x % 2 != 0) {
                        System.out.println("Thread Name " + Thread.currentThread().getName() + " : " + x);
                    }
                    return num;
                }, executorService);
        oddCompletableFuture.join();
    }
}
