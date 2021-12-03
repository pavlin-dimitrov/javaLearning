package com.company;

public class Problem3 {
    public static void main(String[] args) {
        int[] arrayOne = {5, 3, 1, 12,};
        int[] arrayTwo = {10, 7, 9, 20};
        int[] arrayThree = new int[4];
        for (int i = 0; i < arrayOne.length; i++) {
                if (i % 2 == 0) {
                    arrayThree[i] = arrayOne[i];
                    System.out.println(arrayThree[i]);
                } else {
                    arrayThree[i] = arrayTwo[i];
                    System.out.println(arrayThree[i]);
                }
        }
    }
}

