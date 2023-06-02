// Author: Isaac Smith
// File: CS110 Final Project Farm Class
// Due: 05/30/2023

// Methods for tasks to do on the farm

import java.util.Scanner;

public class Farm {
   
   
   // Calculate the length of a fence to build (returns diameter of rectangle)
   public double fenceLength() {
      
      double radius;
      double length;
      double width;
      double totalDistance;

      // Create a new Scanner object
      Scanner scanner = new Scanner(System.in);
           		
      // Assign values to the variables using Scanner class
      // using the nextDouble() method      
            
      System.out.print("What is the length of the rectangle? ");
      length = scanner.nextDouble();
            
      System.out.print("What is the width of the rectangle? ");
      width = scanner.nextDouble();
            
      // Calculate the diameter of the rectangle
      double diameter = ((2 * length) + (2 * width));
      
      return diameter;
   
   }
  
   
   // Convert C to F or vice-versa (returns value as a double)
   public double convertTemp() {
   
      return 0.0;
   
   }
   
   
   // Convert M to KM or vice-versa (returns value as a double)
   public double convertDistance() {
   
      return 0.0;
   
   }
  
   
   // Calculate how many days are left in a year (returns nothing, prints to console)
   public void daysLeftInYear() {
   
      // Create a new scanner object
		Scanner scanner = new Scanner(System.in);

		// Declare variables for later
		int dayOfMonth = 0;
		int year = 0;
		String monthName;

		// Get values for the variables using scanner object
		System.out.print("What month is it? (type name of month): ");
		monthName = scanner.nextLine();

		System.out.print("What day of the month is it? ");
		dayOfMonth = scanner.nextInt();

		System.out.print("What year is it? ");
		year = scanner.nextInt();

		// Determine whether the year is a leap year or not
      
      // Declare a boolean variable
      boolean isLeapYear;
      
      if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
         isLeapYear = true;
      }
      
      else {
         isLeapYear = false;   
      }
	               
      // Declare two integer variables to hold days left in year and month
      
      int daysLeftInYear = 0;
      int daysLeftInMonth = 0;
      
      // Use a switch statement to determine the final output
      
      switch(monthName) {
         
         case "December":
            daysLeftInYear = 31; // Always 31 days
            daysLeftInYear -= dayOfMonth;
            break;
         
         case "November":
            daysLeftInYear = 61; // Always 30 days
            daysLeftInYear -= dayOfMonth;
            break;
         
         case "October":
            daysLeftInYear = 92; // Always 31 days
            daysLeftInYear -= dayOfMonth;
            break;
         
         case "September":
            daysLeftInYear = 122; // Always 30 days
            daysLeftInYear -= dayOfMonth;
            break;
         
         case "August": 
            daysLeftInYear = 153; // Always 31 days
            daysLeftInYear -= dayOfMonth;
            break;
         
         case "July":
            daysLeftInYear = 184; // Always 31 days
            daysLeftInYear -= dayOfMonth;
            break;
         
         case "June": 
            daysLeftInYear = 214; // Always 30 days
            daysLeftInYear -= dayOfMonth;
            break;
         
         case "May":
            daysLeftInYear = 245; // Always 31 days
            daysLeftInYear -= dayOfMonth;
            break;
         
         case "April":
            daysLeftInYear = 275; // Always 30 days
            daysLeftInYear -= dayOfMonth;
            break;
         
         case "March":
            daysLeftInYear = 306; // Always 31 days
            daysLeftInYear -= dayOfMonth;
            break;
         
         case "February":
            if(isLeapYear) {
               daysLeftInYear = 335; // 29 days during leap year
               daysLeftInYear -= dayOfMonth;
            }  
            else {
               daysLeftInYear = 334; // Usually 28 days
               daysLeftInYear -= dayOfMonth;
            }   
            break;
         
         case "January":
            if(isLeapYear) {
               daysLeftInYear = 366; //Days per leap year
               daysLeftInYear -= dayOfMonth;
            }
            else{
               daysLeftInYear = 365; // Days per regular year
               daysLeftInYear -= dayOfMonth;
            }
            break;
            
      }       
      // Print the results to the console, using if statements for singular vs plural grammar
      if (isLeapYear) {
         if (daysLeftInYear == 1) { // Enforcing correct grammar for only 1 day left in the year
            System.out.println("There is " + daysLeftInYear + " complete day left in the leap year " + year + ".");
         }
         else{
            System.out.println("There are " + daysLeftInYear + " complete days left in the leap year " + year + ".");
         }      
      }
      else { 
         if (daysLeftInYear == 1) {
            System.out.println("There is " + daysLeftInYear + " complete day left in the non-leap year " + year + ".");   
         }
         else {
            System.out.println("There are " + daysLeftInYear + " complete days left in the non-leap year " + year + ".");
         }   
           
      }
      
   }
   
   
   // Method to give the farmers a nickname
   public String farmerName (String nameOfFarmer) {
      
      Scanner farmerInput = new Scanner(System.in);
      
      System.out.println("Please enter the farmer's first name: ");
      
      String farmerFirstName = farmerInput.nextLine();
      
      farmerInput.nextLine();
      
      String farmerNickName = "Farmer " + farmerFirstName;
      
      return farmerNickName;
   
   }


}