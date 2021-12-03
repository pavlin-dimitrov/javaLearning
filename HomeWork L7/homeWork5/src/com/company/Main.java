package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TaskTwo Lection loops in Java - Number pow
	Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");

    int number = scanner.nextInt();

        System.out.println("Enter degree: ");

    int degree = scanner.nextInt();

    int result = 1;

    while ( degree != 0){
        result *= number;
        --degree;
    }
        System.out.println(result);
    }
}
