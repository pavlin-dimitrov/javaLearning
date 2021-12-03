package com.company;

public class Main {

    public static void main(String[] args) {
	// Multidimensional Array

        int[][] review = {
                {4, 6, 2, 5},
                {7, 9, 4, 8},
                {6, 9, 3, 7},
        };
        int sum = 0;
        int count = 0;

        for (int i = 0; i < review.length; i++){
            for (int j = 0; j < review[i].length; j++){
                sum = sum + review[i][j];
                count++;
                //System.out.print(review[i][j]+" ");
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        double avgRating = (double)sum / (double)count;
        System.out.println("Average rating: " + avgRating);
    }
}
