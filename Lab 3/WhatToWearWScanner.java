// Name: Isaac Smith
// Date: 04/13/2023
// Description: Lab 3 hat to Wear with Scanner

// Import the Scanner class
import java.util.Scanner;

public class WhatToWearWScanner {

   public static void main(String[] args) {
           
      // Create a new Scanner object
      Scanner tempInput = new Scanner(System.in);   
      
      // Print a line to give user instructions to input temperature
      System.out.print("What is the temperature outside (in F): ");
      
      // Declare a variable of type double, using user input as the value
      double tempOutsideF = tempInput.nextDouble();
      
      // Indicate what clothing to wear, based on temperature
      
      if (tempOutsideF < 32) {
         System.out.println("Wear hat, boots, jacket, and gloves. ");                    
      }
      
      if (tempOutsideF > 32) {
         System.out.println("Wear a sun-hat, t-shirt, shorts, and sandals. ");
      } 
   
   }

}