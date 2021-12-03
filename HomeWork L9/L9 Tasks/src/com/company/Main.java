package com.company;

public class Main {
    public static void main(String[] args) {

        // New array whose elements are result of multiplication of another array elements and their indexes.
        int[] numbersBefore = {1, 2, 3, 4, 5};
        int[] numbersAfter = new int[numbersBefore.length];
        for (int i = 0; i < numbersBefore.length; i++)
        {
            for(int j = 0; j < numbersBefore.length; j++) {
                numbersAfter[j] = numbersBefore[i] * i;
            }
            System.out.println(numbersAfter[i] + ", ");
        }
    }
}
