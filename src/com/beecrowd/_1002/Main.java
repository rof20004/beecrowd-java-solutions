package com.beecrowd._1002;

import java.util.Scanner;

/**
 * beecrowd challenge 1002
 */
public class Main {

    private static final double n = 3.14159;

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var raio = scanner.nextDouble();

        System.out.format("A=%.4f\n", n * (Math.pow(raio, 2)));
    }

}
