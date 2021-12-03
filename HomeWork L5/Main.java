package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	    Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();
//        String movieName = scanner.nextLine();
//
//        System.out.println("Hello, my name is: " + name);
//        System.out.println("My favorite movie is: " + movieName);

        //Task 2
//        Scanner scanner = new Scanner(System.in);
//        String inputNumber = scanner.nextLine();
//        double decimalNumber = Double.parseDouble(inputNumber);
//        long intNumber = (long) decimalNumber;
//        System.out.println(intNumber);

        //Task 3
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        int digitA = inputNumber / 100;
        int digitB = (inputNumber / 10) % 10;
        int digitC = inputNumber % 10;

        boolean isEven = digitA % 2 == 0;
        boolean isBEven = digitB % 2 == 0;
        boolean isCEven = digitC % 2 == 0;

        boolean areAllEven = isEven && isBEven && isCEven;
        boolean areAllOdd = !isEven && !isBEven && !isCEven;
        String result = areAllEven || areAllOdd ? "Magic" : "Regular";
        System.out.println(result);

    }
}
