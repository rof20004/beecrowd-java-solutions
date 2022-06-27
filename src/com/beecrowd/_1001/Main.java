package com.beecrowd._1001;

import java.util.Scanner;

/**
 * beecrowd challenge 1001
 */
public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var n1 = scanner.nextInt();
        var n2 = scanner.nextInt();

        System.out.format("X = %d\n", n1 + n2);
    }

}
