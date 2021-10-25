package com.company;

import java.util.Scanner;

// Write a Java program to get a number from the user and print whether it is positive or negative.

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int input = scanner.nextInt();

        if (input > 0 ){
            System.out.println("Positive");
        }

        if (input < 0 ){
            System.out.println("Negative");
        }
        else {
            System.out.println("number is 0");
        }

    }
}

