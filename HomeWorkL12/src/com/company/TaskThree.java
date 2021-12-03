package com.company;

import java.util.Scanner;

public class TaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        System.out.print(x + " % " + y + " = " + x % y);
        System.out.println();
        System.out.print(x + " % " + z + " = " + x % z);
        System.out.println();
        System.out.println(divisionWithoutRemainder(x, y, z));

    }
   public static boolean divisionWithoutRemainder (int num, int devOne, int devTwo){
        int checkOne = num % devOne;
        int checkTwo = num % devTwo;
        boolean result = checkOne == 0 && checkTwo == 0;
        return result;
    }
}
