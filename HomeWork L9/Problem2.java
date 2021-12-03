package com.company;

public class Problem2 {
    public static void main(String[] args) {
        int[] arrayOne = {2, 5, 4, 11, 3};
        int[] arrayTwo = {12, 9, 5, 1, 11};
        int[] arrayThree = new int[5];
        int k = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    arrayThree[k] = arrayOne[i];
                    k++;
                }
            }
        }

        int[] finalArray = new int[k];

        for (int i = 0; i < finalArray.length; i++) {
            finalArray[i] = arrayThree[i];
        }






        for (int i = 0; i < finalArray.length; i++) {
            System.out.println(finalArray[i]);
        }
    }
}


