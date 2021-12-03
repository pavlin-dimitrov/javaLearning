package com.company;

import java.util.Scanner;

public class seriesOfNumbers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int smallestNumber = Integer.MAX_VALUE;
        int biggestNumber = Integer.MIN_VALUE;

        while(true) {
            int insertNumber = scanner.nextInt();

            if (insertNumber == 0) {
                break;
            }
            if (insertNumber < smallestNumber) {
                smallestNumber = insertNumber;
            }
            if (insertNumber > biggestNumber) {
                biggestNumber = insertNumber;
            }
        }
        System.out.println("Biggest number: " + biggestNumber);
        System.out.println("Smallest number: " + smallestNumber);
    }
}