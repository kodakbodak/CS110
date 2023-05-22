// Author: Isaac Smith
// Date: 05/04/2023
// File: Lab 6 Three Methods

import java.util.Scanner;

public class MyProgramWithThreeMethods {
 
   // Method to print the instructions
   public static void printInstructions() {
   
      System.out.println("This program calculates the nth power of a base " +
                         "integer input by the user.");
   
   }
   
   // Method to prompt user for number and returns that number's value  
   public static int getUserInput() {
   
      Scanner keyboard = new Scanner(System.in);
      int keyboardInput = keyboard.nextInt();
      return keyboardInput;
       
   }
   
   // Method to calculate the final result
   public static int calcExponentValue(int integerValue, int exponentValue) {
   
      int integerPower = integerValue;
      
      for (int i = 2; i <= exponentValue; i++) {
         integerPower *= integerValue;  
      }
      return integerPower;
   }
   
    // the main routine
    public static void main(String[] args) {

        // print to the screen, instructions
        printInstructions();
        System.out.print("Please input your base; an integer less than 10 : ");

        // receive user's input
        int myInteger = getUserInput();
        System.out.print("Please input your exponent; a positive integer less than 10 : ");
        int myExponent = getUserInput();

        // output result
        System.out.println("The integer " + myInteger +
                           " raised to the " + myExponent + "th power: "
                           + calcExponentValue(myInteger, myExponent));
    }
    
}
