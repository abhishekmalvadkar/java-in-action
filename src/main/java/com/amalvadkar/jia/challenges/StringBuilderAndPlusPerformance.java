package com.amalvadkar.jia.challenges;

public class StringBuilderAndPlusPerformance {

    public static void main(String[] args) {
        usingPlusWithoutForLoop();
    }

    // Took 0 ms
    private static void usingStringBuilderWithoutForLoop() {
        long startTime = System.currentTimeMillis();
        String name = "abhi";
        String greet = new StringBuilder().append("hello").append(name).append("!!").toString();
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);
    }

    // Took 10 ms
    // Took 0 ms if you take final String name = "abhi";
    private static void usingPlusWithoutForLoop() {
        long startTime = System.currentTimeMillis();
//        final String name = "abhi"; // will make it 0 ms because of constant folding
        String name = "abhi";
        String greet = "hello" + name + "!!";
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);
    }

    // Took 12 ms
    private static void usingStringBuilderWithForLoop() {
        long startTime = System.currentTimeMillis();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            result.append(i);
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);
    }

    // Took 3438 ms
    private static void usingPlusWithForLoop() {
        long startTime = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < 100000; i++) {
            result = result + i;
        }
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;
        System.out.println(elapsedTime);
    }

}
