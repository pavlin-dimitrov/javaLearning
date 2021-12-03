package com.company;

public class Main {

    public static void main(String[] args) {
	int[] numbersBefore = {2, 3, 4 , 5 , 6};
    int[] numbersAfter = new int[5];
        for (int i = 0; i < numbersBefore.length ; i++) {
            numbersAfter[i] = numbersBefore[i] * i;
            System.out.println(numbersAfter[i]);
        }
    }
}
