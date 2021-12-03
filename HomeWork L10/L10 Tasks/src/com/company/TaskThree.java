package com.company;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        // TASK TWO
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter triangle size like number of stars per side: ");
        int n = sc.nextInt(), m = 1;
        for (int i = 0; i < n; i++){

            for (int j = 0; j < m; j++){
                System.out.print("*");
            }
            m += 2;
            System.out.println();
        }
    }
}
