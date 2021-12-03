package com.company;

public class TaskFour {
    public static void main(String[] args) {
        int a = 21;
        int b = 21;

        boolean greaterThen21 = a > 21 && b > 21;
        boolean aLessThen21 = a <= 21 && b <= 21 && a > b;
        boolean bLessThen21 = a <= 21 && b <= 21 && b > a;
        boolean aGreater = a > 21 && b < 21;
        boolean bGreater = a < 21 && b > 21;
        boolean abEqualUnder21 = a <= 21 && b <= 21 && a == b;
        boolean abEqual21 = a == 21 && b == 21 && a == b;

        System.out.println(greaterThen21 ? 0 :
                aLessThen21 ? a :
                        bLessThen21 ? b :
                                aGreater ? b :
                                        bGreater ? a :
                                                abEqualUnder21 ? a :
                                                        abEqual21 ? a : 0);


    }
}
