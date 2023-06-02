// Author: Isaac Smith
// File: Homework 6
// Due: 06/01/2023

// 1. Ask user fo input to determine array size
// 2. Generate random values and add them to that array
// 3. Use a method to summ all of the members of the array
// 4. Use a method to get the average, minimum, and maximum
// 5. Print those values to the user using System.out.println

// !!!!!INPUTS THAT BREAK CODE!!!!!
// 1. If user enters a String, we get a runtime error
// 2. If user enters a double, we get a runtime error
// 3. Entering too large of an integer will exceed the JVM limitations and not run
//  - 1059999999 was the largest number I could get to run before I needed to work on something else

// Thank you Professor H and TA's, all the feedback throughout the quarter has been very helpful!!!

import java.util.Scanner;
import java.util.Random;

public class ArrayExercise {
               
   public static void main (String [] args) {    
      
      // Create a scanner to use for user input
      Scanner keyboard = new Scanner(System.in);     
      
      // Prompt user for how many values to tally
      System.out.println("How many values would you like to tally? ");     
      
      // keyboard.nextInt is length of the array
      int inputArrayLength = keyboard.nextInt();    
      
      // Add random values to an array
      Random randDoubles = new Random();    
      
      // Create an array of doubles
      double[] userValuesArray = new double[inputArrayLength];
      
      // Use a for loop to add random values to the array
      for (int i = 0; i < inputArrayLength; i++) {
         // Create random values to use in the array
         userValuesArray[i] = randDoubles.nextDouble();        
         // Debug print statement 
         //System.out.println(userValuesArray[i]);     
      } 
      
      // Call the sumArray method which will total the values in the array
      sumArray(userValuesArray);     
      // Call the minMaxAvg method which calculates those values and prints them
      minMaxAvg(userValuesArray); 
   }


   // Sum the values of the user's array of values
   public static void sumArray(double[] userDoubles) {         
      // double to hold value of total value
      double totalValue = 0.0;
      // Use a for loop to sum the elements of the array from main
      for (int i = 0; i < userDoubles.length; i++) {  
         totalValue += userDoubles[i];    
      }     
      // Print the result to the user
      System.out.println("The sum of the values is: " + totalValue);    
   }
 
   
   // Calculate the average, min, max of user's values
   public static void minMaxAvg(double[] userDoubles) {      
      // Double to store value of array sum
      double runningTotal = 0.0;    
      // Calculate the average using the sum divided by total members
      for (int i = 0; i < userDoubles.length; i++) {      
         runningTotal += userDoubles[i];     
      }    
      // Calculate the average
      double averageOfArray = (runningTotal/userDoubles.length);
      // Print the average to the user   
      System.out.println("The average is " + averageOfArray);
           
      // Calculate the minimum and maximum
      // Create doubles to hold min and max
      double max = 0.0;
      double min = 0.0;
      
      // For loop for calculating maxiimum value
      for (int i = 0; i < userDoubles.length; i++) {
         // Check if current iterated member is larger than the current value of max,
         // update max if this is the case
         if (userDoubles[i] > max) {
            max = userDoubles[i];
         }      
      }
      
      // For loop toc calculate the minuimum value
      for (int i = 0; i < userDoubles.length; i++) {
         // Check if current value is less than current value of min,
         // update min if this is the case
         if (userDoubles[i] < min) {
            min = userDoubles[i];
         }     
      }      
      // Print the mimimum and maximum values to the user
      System.out.println("The maximum value is: " + max);
      System.out.println("The minimum value is: " + min);
   }  
}