package com.company;

public class TaskTwo {
    public static void main(String[] args) {
        int agesOfCar = 3;
        int carPrice = 25600;

        boolean highClassA = agesOfCar >= 5 && carPrice > 20000;
        boolean highClassB = agesOfCar <= 5 && carPrice > 40000;

        boolean highClass = highClassA || highClassB;
        System.out.println(highClass ? "This car is HIGH CLASS" : "This car is LOW CLASS");
    }
}
