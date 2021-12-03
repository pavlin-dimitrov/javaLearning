package com.company;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        // PERFECT NUMBER
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number here:");
        int numToCheck = scanner.nextInt();

        int sumOfDividers = 0;
        int i = 1;
        while (i <= numToCheck / 2) { // loop dividers from 1 until the half of our number, increasing the divider by one.
            if (numToCheck % i == 0) { // check if can we divide without remainder, if yes - add this divider to the sum of dividers.
                sumOfDividers = sumOfDividers + i;
            }
            i++;
        }
        if (sumOfDividers == numToCheck) {
            System.out.println(numToCheck + " is a perfect number!");
        } else {
            System.out.println(numToCheck + " is not a perfect number!");
        }
    }
}
