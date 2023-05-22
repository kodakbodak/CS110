// Author: Isaac Smith
// Date: 05/06/2023
// File: Homework 4 - Convert Units

// 1. Create a method to convert kilometers and miles
//   - takes user input to determine units to convert
//   - uses K = M*1.60934 or M = K*0.621371
// 2. Create a method to convert centigrade and farenheit
//   - same basic structure as temp converterm different formuli
// 3. Create a main method which calls upon the other methods I create
//   - ask what to convert
//   - depending on answer, call appropriate method and do calcs


// Bad Inputs:
// 1. Entering a string when prompted for distance causes a runtime error (same for temperature prompt)
// 2. 
// 3.

import java.util.Scanner;

public class TravelToEurope {
   
   // Method to convert miles to kilos, and other way around
   public static void convertDistance(double distance, String distanceMeasurement) {
      
      // To store the value of the converted units
      double convertedDistance; 
      
      // Miles >> Kilometers
      if (distanceMeasurement.equals("m")) {
         
         convertedDistance = distance * 1.60934;
         System.out.println(distance + " miles converted to Kilometers is: " + convertedDistance + " kilometers");
      
      }
      
      // Kilometers >> Miles
      else if (distanceMeasurement.equals("k")) {
         
         convertedDistance = distance * 0.621371;
         System.out.println(distance + " kilometers converted to Miles is: " + convertedDistance + " miles");
      
      }else{
         
         System.out.println("Invalid option was selected"); // Invalid input error
      
      }
        
      
   }   
   
   // Method to convert fahrenheit to centigrade, and other way around
   public static void convertTemp(double temp, String tempScale) {
      
      // Store the value of the converted temperature
      double convertedTemp;
      
      // Fahrenheit >> Celcius
      if (tempScale.equals("f")) {
         
         convertedTemp = 5/9 * (temp - 32);
         System.out.println(temp + " F converted to C is " + convertedTemp);

      }
      // Celcius >> Fahrenheit
      else if (tempScale.equals("c")) {
         
         convertedTemp = 32.0 + (temp * 1.8);       
         System.out.println(temp + " C converted to F is " + convertedTemp);
      // for invalid user input
      }else{
         System.out.println("Invalid option was selected");
      }
      
   
   }
   
   // Main method
   public static void main (String [] args) {
            
      // Create a new scanner object for user input
      Scanner keyboard = new Scanner(System.in);
      
      // Description of program
      System.out.println("Hello, this program will convert Miles to Kilometers, or vise-versa");
      
      // Ask to convert miles or kilos
      System.out.println("Would you like to convert to Miles or Kilometers?");
      System.out.println("Type \"m\" for Kilometers >> Miles\nType \"k\" for Miles >> Kilometers");
      
      // Create a String variable to hold the value "m" or "k" (units)
      String distanceMeasurement = keyboard.nextLine(); 
      
      // Prompt user for distance to convert
      System.out.print("Please enter a distance: ");
      
      // Create a double to hold the distance value
      double distance = keyboard.nextDouble();
           
      keyboard.nextLine(); // Remove "\n" from user pressing enter button, avoids scanner skipping next string input
      
      // Invoke distance converter method using user imput values  
      convertDistance(distance, distanceMeasurement);
      
      // Prompt user for converting temperature
      // "f" for F to C, "c" for C to F
      System.out.println("Would you like to convert to Celcius or Fahrenheit?");
      System.out.println("Type \"f\" for Celcius >> Fahrenheit\nType \"c\" for Fahrenheit >> Celcius");
      
      // Store value of which units to use 
      String tempScale = keyboard.nextLine();
      
      System.out.print("Please enter the temperature to convert: ");
      
      // Store the temperature value
      double temp = keyboard.nextDouble();
      
      // Call the temp converter method written above using the user input as args
      convertTemp(temp, tempScale);
   
   }
}