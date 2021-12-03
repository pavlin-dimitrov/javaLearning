package com.company;

import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int rows = 0; rows <= n; rows++) {
            for (int blank = n; blank >= rows; blank--) {
                System.out.print(" ");
            }
            for (int dots = 1; dots <= rows * 2 + 1; dots++) {
                System.out.print("o");
            }
            System.out.println();
        }
    }
}