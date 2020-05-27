package org.apache.dubbo.demo.provider;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello";
        });

        completableFuture.whenComplete((result, t) -> {
            System.out.println(Thread.currentThread().getName());
            System.out.println(result);
        });

        System.out.println("main...");
        Thread.sleep(4000);

    }
}
