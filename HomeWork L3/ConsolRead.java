package com.company;

import java.util.Scanner;

public class ConsolRead {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String textFromConsole = console.nextLine();

        System.out.println("Hello " + textFromConsole);
    }
}
