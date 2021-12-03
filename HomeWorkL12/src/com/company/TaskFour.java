package com.company;

import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char x = scanner.next().charAt(0);
        System.out.println("The letter is vowel?");
        System.out.println(isLetterVowel(x));
    }
    public static boolean isLetterVowel(char letter){
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'
            || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){
            return true;
        } else {
            return false;
        }
    }
}
