package com.company;

public class TeenNum {
    public static void main(String[] args) {
        int a = 6;
        int b = 14;

        boolean isAGreaterThen13 = a >= 13;
        boolean isASmallerThen19 = a <= 19;
        boolean isAInRange = isAGreaterThen13 && isASmallerThen19;

        boolean isBGreaterThen13 = b >= 13;
        boolean isBSmallerThen19 = b <= 19;
        boolean isBInRange = isBGreaterThen13 && isBSmallerThen19;

        boolean isInputInRange = isAInRange || isBInRange;

        System.out.println(isInputInRange ? 19 : a + b);
    }
}
