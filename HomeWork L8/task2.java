package com.company;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int counter = 0; counter <= n; counter++) {
            if(counter % 5 == 0) {
                System.out.print(counter + "; ");
            }
        }

    }

}
