// Name: Isaac Smith
// Date: 04/13/2023
// Description: Lab 3 Clothing Picker If Else

// Import the Scanner class
import java.util.Scanner;

public class ClothingPickerIfElseIf {

   public static void main(String[] args) {
           
      // Create a new Scanner object
      Scanner tempInput = new Scanner(System.in);   
      
      // Print a line to give user instructions to input temperature
      System.out.print("What is the temperature outside (in F): ");
      
      // Declare a variable of type double, using user input as the value
      double tempOutsideF = tempInput.nextDouble();
      
      // Indicate what clothing to wear, based on temperature
      
      // For temperatures above 70f
      if (tempOutsideF > 70) {
         System.out.println("Wear t-shirt, shorts, and sandals. ");                    
      }
      
      // For temps below 30f
      else if (tempOutsideF < 30) {
         System.out.print("Wear boots, pants, sweater, and gloves. ");
      }
      
      // For temperatures not listed above
      else {
         System.out.println("Wear a long sleeve shirt, pants, and shoes. ");
      } 
   
   }

}