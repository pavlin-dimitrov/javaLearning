package com.company;

public class TaskFour {
    public static void main(String[] args) {
        //Create array [10 ... 99];
        int n = 7;
        int[][] arr = new int[n][n];
        int num = 11;
        for (int i = 1; i < n; i++)
        {
            for (int j = 1; j < n; j++)
            {
                arr[i][j] = num;
                num++;
            }
            num += 4;
        }
        //Print array
        for(int a = 1; a<n; a++)
        {
            for(int b = 1; b<n; b++)
            {
                System.out.print(arr[a][b] + ", ");
            }
            System.out.println();
        }
        //Find sum of each odd column
        System.out.println("Find sum of each odd column...");

        for(int c = 1; c<n; c++)
        {
            int sumOfOddCols = 0;
            for(int d = 1; d<n; d++)
            {
                if (c % 2 != 0)
                {
                    System.out.print(arr[d][c] + ", ");
                    sumOfOddCols = sumOfOddCols + arr[d][c];
                }
            }
            if (c % 2 != 0) {
                System.out.println("Sum of the elements for column is: " + sumOfOddCols);
                System.out.println();
            }
        }
    }
}
