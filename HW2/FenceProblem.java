// Author: Isaac Smith
// Date: 4/12/2023
// File: Homework 2 Fence Problem

// 1. Set up variables for radius, langth of rectangle, and width of rectangle
//    using type double to account for non-integer measurements
// 2. Using Scanner class, have user input the values for the variables
// 3. Calculate the circumference and diameter of the shapes
// 4. Print the results to console

import java.util.Scanner;

public class FenceProblem {
	
	public static void main(String [] args) {
      
      // Initiate the radius, length, and width variables (type = double)
      double radius;
      double length;
      double width;

      // Create a new Scanner object
      Scanner scanner = new Scanner(System.in);
           		
      // Assign values to the variables using Scanner class
      // using the nextDouble() method      
      System.out.print("What is the radius of the circle? ");
      radius = scanner.nextDouble();
            
      System.out.print("What is the length of the rectangle? ");
      length = scanner.nextDouble();
            
      System.out.print("What is the width of the rectangle? ");
      width = scanner.nextDouble();
      
      // Calculate the circumference of the circle
      double circumference = 2 * Math.PI * radius;
      
      // Calculate the diameter of the rectangle
      double diameter = ((2 * length) + (2 * width));
      
      // Print the results to the console
      System.out.println("The circumference of the circle is: " + circumference);
      
      System.out.println("The diameter of the rectangle is: " + diameter);
      
	}

}