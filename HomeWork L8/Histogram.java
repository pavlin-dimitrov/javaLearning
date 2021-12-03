package com.company;

import java.util.Scanner;

public class Histogram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert number 100 - 30 000: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber > 100 && inputNumber < 1000) {

            System.out.println(inputNumber % 10);
            System.out.println((inputNumber / 10) % 10);
            System.out.println(inputNumber / 100);

        } else if (inputNumber >= 1000 && inputNumber < 10000) {

            System.out.println(inputNumber % 10);
            System.out.println((inputNumber / 10) % 10);
            System.out.println((inputNumber / 100) % 10);
            System.out.println(inputNumber / 1000);

        } else if (inputNumber >= 10000 && inputNumber <= 30000) {

            System.out.println(inputNumber % 10);
            System.out.println((inputNumber / 10) % 10);
            System.out.println((inputNumber / 100) % 10);
            System.out.println((inputNumber / 1000) % 10);
            System.out.println(inputNumber / 10000);

        } else {
            System.out.print("Number is not in range.");
        }
    }
}
