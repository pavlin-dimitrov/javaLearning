package com.company;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 1;

        while (result < 1000){
            result *= number;
            if (result < 1000) {
                System.out.println(result);
            }
        }
    }
}
