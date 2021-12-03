package com.company;

import java.util.Scanner;

public class matrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int rows = 1; rows <= n; rows++) {
            for (int counter = rows; counter <= n + (rows-1); counter++) {
                System.out.print(counter + " ");
            }
            System.out.println();
        }

    }
}