package com.company;

import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++){
           int x = scanner.nextInt();
            arr[i] = x;
        }

        for (int j = 0; j < 10; j++){

            if (j == 0){
                System.out.print(arr[j]);
            } else if (arr[j - 1] > arr[j] ) {
                System.out.print(" > " + arr[j]);
            } else if (arr[j - 1] == arr[j]) {
                System.out.print(" = " + arr[j]);
            } else if (arr[j - 1] < arr[j]){
                System.out.print(" < " + arr[j]);
            }
        }
    }
}
