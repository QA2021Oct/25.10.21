package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

           System.out.println("Enter your grade: ");
            int grade =  scanner.nextInt();
            //System.out.println(grade);

        // <
        // >
        // <=
        // >=
        // ==  equal
        // !=  not equal

                if ( grade < 55 ) {  // true  אם
                    System.out.println("Fail!");
                }
                else{  // grade > 55  אחרת
                    System.out.println("Good!");
                }

        System.out.println("after first If statement ");

                if ( grade >= 85){
                    System.out.println("Vary Good!");
                }

        System.out.println("after second If statement ");

    }
}

