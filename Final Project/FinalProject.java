// Author: Isaac Smith
// File: CS110 Final Project
// Due: 05/30/2023

// Import proper and required classes
import java.util.Scanner;
import java.util.Random;
import java.io.File; 

public class FinalProject {   
   // Main method
   // 1. Ask user for which taask to be completed
   // 2. Call other methods depending on user input (switch)
   public static void main (String [] args) {
      
      // Create a new Farm object to use below
      Farm farm = new Farm();
      
      // Intro and user instructions
      System.out.println("This program allows you to run your farm better!");
      System.out.println("Listed below are some modules to make this happen.\n");
      
      
      // Print a list of options for the user to choose from
      System.out.print("1. Calculate the length of a fence\n" +
                       "2. Calculate the days left in a year\n" +
                       "3. Create a nickname for the farmers\n" +
                       "4. Add farmers to a list and save it to a file\n" +
                       "5. Convert a distance or a temperature\n" +
                       "6. Check the current temperature\n" +
                       "7. Quit Program\n\n" +
                       "Please select an option from above: "
                      ); 
      
      // scanner for user input for menu
      Scanner keyboard = new Scanner(System.in);
      
      // declare int choice to store user choice for menu
      int choice = keyboard.nextInt();
      
      // Boolean variable to allow the while loop to run while it is true
      // Can be updated to false if user selects to quit the program
      boolean runAgain = true;
      
      // Run the switch statement in a loop to allow user to quit whole program without "ctrl + c"ing out of it
      while (runAgain) {  
         // Use switch to choose a method depending on user input (int choice)
         switch (choice) { //run this in a while loop to continue the program until it is manually terminated
         
            // Calculate fence length
            case 1:
               // Store length value from Farm fenceLength method
               double length = farm.fenceLength();
               System.out.println("The fence will be " + length + " meters long.");
               break;
         
            // Calculate the days left in a year
            case 2: 
            
               farm.daysLeftInYear();
            
               break;
         
            // Create a nickname for a farmer!!!!!!!!!!!!!!
            case 3:
               System.out.println("This module is still under construction");
               break;
         
            // Add farmers to an array and print them to a file!!!!!!!!!!!!!!!!!!!!
            case 4:
               System.out.println("This module is still under construction");
               break;
         
            // Convert a distance!!!!!!!!!!!!!!!!
            case 5:
            
               System.out.println("Would you like to convert a distance or a temperature? (1 or 2)");
            
               // Use char to store distance or temp for selection
               //Scanner converterSelector = new Scanner(System.in);
            
               int distOrTemp = keyboard.nextInt();
           
               if (distOrTemp == 1){
                  farm.convertDistance();
               }
            
               else if (distOrTemp == 2){
                  farm.convertTemp();
               }
            
               else{
                  System.out.println("Please select a valid option");         
               } 
            
               break;
            
            // Check the current temperature using a random value dependin on scale used
            case 6:
               
               String tempCF = keyboard.nextLine();
               System.out.println("Are you using Celsius or Fahrenheit? (c/f) ");
               
               if (tempCF.equals("c")) {
                  
                  Random tempCelsius = new Random();
                  
                  // Print the current (randomized) temperature using a range
                  // 12 - 38 degrees seems like a decent range for this purpose
                  // Using a double for precision
                  System.out.println("The current temperature is " + tempCelsius.nextInt(12, 38) + " degrees Celsius.");
               
               }
               else if (tempCF.equals("f")) {
                  
                  Random tempFahrenheit = new Random();
                  
                  // Print the current (randomized) temperature using a range
                  // 55 - 100 seems like a decent range for this purpose
                  // Using int because nobody uses decimals for Fahrenheit temperature for weather
                  System.out.println("The current temperature is " + tempFahrenheit.nextInt(55, 101) + " degrees Fahrenheit.");
                  
               }
               else {
                  
                  System.out.println("Please choose a valid option");
                  
               }
            
               break;
               
               
            // Quit program
            case 7:
               runAgain = false;
               break;
            
            // Default for invalid selection
            default:
            
               System.out.println("Please select a valid option");
            
               break;
      
         }
      } 
   }
}