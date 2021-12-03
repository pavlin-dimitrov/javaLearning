package com.company;

import java.util.Random;
import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args) {
        //GUESS THE NUMBER WITH HINTS
        Scanner scanner = new Scanner(System.in);

        Random rand = new Random();
        int numToGuess = rand.nextInt(20) + 1;

        boolean match = false;
        while (!match){
            System.out.println("Enter your number:");
            int yourGuessNum = scanner.nextInt();
            if (numToGuess == yourGuessNum){
                match = true;
                System.out.println("You guessed right. " + numToGuess + " is the correct number!");
            } else if (yourGuessNum < numToGuess){
                System.out.println("Too low, try again!");
            } else if (yourGuessNum > numToGuess){
                System.out.println("Too high, try again");
            }
        }
    }
}
