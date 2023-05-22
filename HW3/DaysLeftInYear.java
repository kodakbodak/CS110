// Author: Isaac Smith
// Date: 04/19/2023
// File: Homework 3 - A simple program to calculate how many days are left in the year specified

// 1. Declare variables for dayOfMonth and year
// 2. Declare variables for monthName isLeapYear
// 3. Create a scanner object to read user input for month, day
//    and year
// 4. Determine whether the year is a leap year
// 5. Use switch to determine how many day are left in the year
// 6. Output the results to the user, remembering to enforce correct grammar

// Issues and Bad Inputs
// 1. Entering a month incorrectly will cause a logical error in which
//    the program will run, but the result will not make sense
// 2. Entering a non-integer value when prompted for the day of month
//    will cause a crash - java.util.InputMismatchException since 
//    it is expecting an integer (runtime error)


import java.util.Scanner;

public class DaysLeftInYear {
	
	public static void main (String [] args) {

		// Create a new scanner object
		Scanner scanner = new Scanner(System.in);

		// Declare variables for later
		int dayOfMonth = 0;
		int year = 0;
		String monthName;

		// Get values for the variables using scanner object
		System.out.print("What month is it? ");
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

}