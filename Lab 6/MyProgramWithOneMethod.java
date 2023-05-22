// Author: Isaac Smith
// Date: 05/04/2023
// File: Lab 6 One Method

import java.util.Scanner;

public class MyProgramWithOneMethod {
 
    // Method to print the instructions
   public static void printInstructions() {
   
      System.out.println("This program calculates the nth power of a base " +
                         "integer input by the user.");
   
   }
   
   
    // the main routine
    public static void main(String[] args) {

        // print to the screen, instructions
        printInstructions();
        System.out.print("Please input your base; an integer less than 10 : ");

        // receive user's input
        Scanner keyboard = new Scanner(System.in);
        int myInteger = keyboard.nextInt();
        System.out.print("Please input your exponent; a positive integer less than 10 : ");
        int myExponent = keyboard.nextInt();
        int myIntegerPower = myInteger;

        // perform calculation
        for (int i = 2; i <= myExponent; i++) {
            myIntegerPower *= myInteger;
        }

        // output result
        System.out.println("The integer " + myInteger + " raised to the " + myExponent + "th power: " + myIntegerPower);
    }
    
       



}
