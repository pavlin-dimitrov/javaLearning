package com.company;

public class TaskTwo {
    public static void main(String[] args) {
        //TASK THREE
    //Magic Matrix
    int[][] matrix = {
            {16,3,2,13},
            {5,10,11,8},
            {9,6,7,12},
            {4,15,14,1},
    };
        int count = matrix.length;
        int flag = 0;
        // Check DIAGONALS
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < count; i++){
            diagonal1 += matrix[i][i];
            diagonal2 += matrix[i][count - 1 - i];
        }
            if (diagonal1 != diagonal2){
                flag = 0;
            } else {
                flag++;
            }
        for (int k = 0; k < count; k++){
            int rows = 0, cols = 0;
            for (int j = 0; j < count; j++){
                rows += matrix[k][j];
                cols += matrix[j][k];
            }
                if (rows != cols || cols != diagonal1){
                    flag = 0;
                } else {
                    flag++;
                }
        }
            if (flag >= 2){
                System.out.println("The matrix is magic!");
            } else {
                System.out.println("Not magic matrix!");
            }
    }
}