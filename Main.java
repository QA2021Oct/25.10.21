package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*        System.out.println("Enter your grade 0-100: ");
        int grade =  scanner.nextInt();

        // &&  - And                     ||  - or
        // if( true && true )           if (true || false)   if (false ||true)

        if ( grade < 0 || grade > 100 ) {  // -80 > 100  Or -80 < 0
            System.out.println("Not a grade!");
        }
        else {
            System.out.println("we can work with it");
        }*/

        // take as input x,y,z (int), check if z is the biggest number  // int x;  int y; int z;   ------ int  x, y, z;
        // if so print "Z is the biggest"
        // use 1 condition

        //int x,y,z;  // way to define variables

        //int x;     // way to define variables
        //int y;     // way to define variables
        //int z;     // way to define variables


        System.out.println("Please enter X: ");  // give me number
        int  x = scanner.nextInt(); // waiting until we print number

        System.out.println("Please enter Y: "); // give me number
        int y = scanner.nextInt(); // waiting until we print number

       System.out.println("Please enter Z: ");
        int z = scanner.nextInt();

        if( z > y && z > x){   // && and     || or
            System.out.println("Z is the biggest");
        }else if ( x > y && x > z) {
            System.out.println("X is not the biggest");
        }else if( y > z && y > x ){
            System.out.println("Y is the biggest");
        }else {
            System.out.println("Some of number are equal");
        }

    }
}

