// Name: Isaac Smith
// Date: 04/13/2023
// Description: Lab 3 Nested If Statements

// Import the Scanner class
import java.util.Scanner;

public class NestedIfStatements {

   public static void main(String[] args) {
            
      // Create a new Scanner object
      Scanner tempInput = new Scanner(System.in);   
      
      // Print a line to give user instructions to input temperature
      System.out.print("What is the temperature outside (in F): ");
      
      // Declare a variable of type double, using nextDouble() to get the value
      double tempOutsideF = tempInput.nextDouble();
      
      // Print a line to give user instructions for is it raining input
      System.out.print("Is it raining? Enter 1 for YES, enter 0 for NO: ");
      
      // Declare a variable of type int, using input nextInt() to get the value
      int isRaining = tempInput.nextInt();
                      
      // Indicate what clothing to wear, based on temperature
      
      // For temperatures above 70f
      if (tempOutsideF > 70) {
         // Execute this if isRaining is equal to 1
         if (isRaining == 1) {
             System.out.println("Wear t-shirt, shorts, and sandals, and bring an umbrella ");        
         }
         // Execute this for any other conditions         
         else {
            System.out.println("Wear t-shirt, shorts, and sandals, and wear sunglasses. ");  
         }                   
      }
      
      // For temps below 30f
      else if (tempOutsideF < 30) {
         // Execute this if isRaining is equal to 1
         if (isRaining == 1) {
             System.out.println("Wear hat, gloves, sweater, and bring an umbrella. ");        
         }
         // Execute this for any other conditions         
         else {
            System.out.println("Wear hat, gloves, sweater, and wear sunglasses. ");  
         }                   
      }
      
      // For temperatures not listed above
      else {
         // Execute this if isRaining is equal to 1
         if (isRaining == 1) {
             System.out.println("Wear long-sleeve shirt, pants, shoes, and bring an umbrella.  ");        
         }
         // Execute this for any other conditions         
         else {
            System.out.println("Wear long-sleeve shirt, pants, shoes, and wear sunglasses. ");  
         }                   
      }
   
   }

}