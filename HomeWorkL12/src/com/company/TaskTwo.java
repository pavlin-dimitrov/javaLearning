package com.company;

import java.util.Scanner;

public class TaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of week as number (between 1 and 7):");
        int dayOfWeek = scanner.nextInt();
        System.out.println(returnWeekDay(dayOfWeek));
    }
    public static String returnWeekDay(int Day){
        return switch (Day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "In another universe!";
        };
    }
}
