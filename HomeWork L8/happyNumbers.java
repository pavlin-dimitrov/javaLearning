package com.company;

public class happyNumbers {

    public static void main(String[] args) {

        System.out.print("Happy numbers: ");

        for (int counter = 1000; counter <= 9999; counter++) {

            int firstDigit = counter / 1000;
            int secondDigit = (counter / 100) % 10;
            int thirdDigit = (counter / 10) % 10;
            int fourthDigit = counter  % 10;

            if(firstDigit + secondDigit == thirdDigit + fourthDigit) {
                System.out.print(counter + "; ");
            }
        }

    }
}
