package com.beecrowd._1046;

import java.util.Scanner;

/**
 * beecrowd challenge 1046
 */
public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var startTime = scanner.nextInt();
        var endTime = scanner.nextInt();

        if (isEqualTime(startTime, endTime)) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
            return;
        }

        if (isStartTimeLessThanEndTime(startTime, endTime)) {
            System.out.printf("O JOGO DUROU %d HORA(S)\n", endTime - startTime);
            return;
        }

        var totalTime = (24 - startTime) + endTime;
        System.out.printf("O JOGO DUROU %d HORA(S)\n", totalTime);
    }

    private static boolean isEqualTime(final int start, final int end) {
        return start == end;
    }

    private static boolean isStartTimeLessThanEndTime(final int start, final int end) {
        return start < end;
    }

}
