// Author: Isaac Smith
// Date: 04/20/2023
// File: Lab 4 - Decimal math using integers

import java.util.Scanner;

public class DecimalMathUsingIntegers {

   public static void main (String [] args){
      
      // Declare variables and assign values
      int wholePart = 0, fractionalPart = 0;
      double composedDecimalValue = 0.0;
      Scanner keyboard = new Scanner(System.in);
      
      // Instruct User
      System.out.print("Input an integer for digits left of the decimal: ");
      wholePart = keyboard.nextInt();
      
      System.out.print("Input an integer >= for digits right of the decmial: ");
      fractionalPart = keyboard.nextInt();
      
      // Output status message and calculations
      
      System.out.println("The wholePart variable has the value: " + wholePart);
      System.out.println("The fractionalPart variable has the value: " + fractionalPart);
      
      composedDecimalValue = wholePart + fractionalPart/100.0;
      System.out.println("The composedDecimalValue value is: " + composedDecimalValue);
      
      // mult composedDecimalValue by 10,000 and format with commas and 6 decimal places
      System.out.printf("The formatted composedDecimalValue times 10,000 is: %,.6f \n",
                        (composedDecimalValue * 10000));
   
   }

}