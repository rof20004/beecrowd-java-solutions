package com.beecrowd._1046;

import java.util.Scanner;

/**
 * Challenge 1046
 */
public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var startTime = scanner.nextInt();
        var endTime = scanner.nextInt();

        if (is24HoursDuration(startTime, endTime)) {
            System.out.println("O JOGO DUROU 24 HORA (S)");
        } else if (isStartTimeLessThanEndTime(startTime, endTime)) {
            System.out.format("O JOGO DUROU %d HORA (S)\n", endTime - startTime);
        } else {
            var totalTime = (24 - startTime) + endTime;
            System.out.format("O JOGO DUROU %d HORA (S)\n", totalTime);
        }
    }

    private static boolean is24HoursDuration(final int start, final int end) {
        return start == end;
    }

    private static boolean isStartTimeLessThanEndTime(final int start, final int end) {
        return start < end;
    }

}
