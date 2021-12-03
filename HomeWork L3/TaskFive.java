package com.company;

public class TaskFive {
    public static void main(String[] args) {
        int a, b, c;
        a = 4;
        b = 5;
        c = 10;

        boolean triangleExist = a > 0 && b > 0 && c > 0 && (a + b) > c && (b + c) > a && (a + c) > b;

        System.out.println(triangleExist ? "This triangle is possible" : "Not possible!");
    }
}
