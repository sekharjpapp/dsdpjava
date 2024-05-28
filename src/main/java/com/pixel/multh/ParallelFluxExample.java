package com.pixel.multh;

import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

public class ParallelFluxExample {
    public static void main(String[] args) {
        Flux<String> stringFlux = Flux.just("one", "two", "three", "four");

        stringFlux.parallel()
                .runOn(Schedulers.parallel())
                .subscribe(s -> {
                    System.out.println("Processing " + s + " in thread: " + Thread.currentThread().getName());
                });

        // To keep the application alive long enough to see the output
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
