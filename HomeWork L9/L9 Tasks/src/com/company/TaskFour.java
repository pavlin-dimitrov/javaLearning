package com.company;

public class TaskFour {
    public static void main(String[] args) {
        //The problems with relatives
        int[] arr={1,5,29,12,45};
        int high = 0, sHigh = 0;

        for(int i=0; i<arr.length; i++) {
            if(arr[i]>high){
                sHigh=high;
                high=arr[i];
            }else if(arr[i]>sHigh ){
                sHigh = arr[i];
            }
        }
        System.out.println(sHigh );
    }
}
