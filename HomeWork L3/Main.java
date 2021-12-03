package com.company;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 4;

        boolean isASix = a == 6;
        boolean isBSix = b == 6;
        boolean isSumSix = a + b == 6;
        boolean isAbDiffSix = a - b == 6;
        boolean isBaDiffSix = b - a == 6;

        boolean areConditionsMet = isASix || isBSix || isSumSix || isAbDiffSix || isBaDiffSix;

        System.out.println(areConditionsMet);
    }
}
