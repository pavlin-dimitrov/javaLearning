package com.company;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseNum = scanner.nextInt();
        int a = 5;
        int b = 4;

        switch (caseNum){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(b -1);
                break;
            case 4:
                System.out.println(a * b);
                break;
            case 5:
                System.out.println(a / b);
                break;
            case 6:
                System.out.println(b / a);
                break;
        }
    }
}
