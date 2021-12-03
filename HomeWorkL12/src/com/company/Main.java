package com.company;

import java.util.Scanner;

public class Main {
    //TaskOne
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
	    boolean result = isRemaindersEqual(x, y);
        System.out.println(result);
    }
    public static boolean isRemaindersEqual(int numA, int numB){
        int resultA = numA % 3;
        int resultB = numB % 3;
        return (resultA == resultB);

    }
}
