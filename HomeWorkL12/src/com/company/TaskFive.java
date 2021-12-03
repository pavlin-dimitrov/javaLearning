package com.company;

import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year to check if it is leap year:");
        int x = scanner.nextInt();
        System.out.println(isYearLeap(x));
    }
    public static boolean isYearLeap(int year){
        int remainder = year % 4;
        int divHundred = year % 100;
        int divFourHundred = year % 400;
        boolean result = remainder == 0 && divHundred != 0;
        boolean leapYear = result || divFourHundred == 0;
        return leapYear;
    }
}
