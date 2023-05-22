// Author: Isaac Smith
// Date: 04/27/2023
// File: Lab 5 ASCII Triangle

import java.util.Scanner;

public class AsciiTriangle {

   public static void main (String [] args) {
      
      // Declare variables and create a new scanner object
      int triangleHeight = 0;
      String asciiCharacter = "*";     
      Scanner keyboard = new Scanner(System.in);
      
      //Print instructions, ask user for height of triangle
      System.out.println("This program prints out an ASCII triangle.");
      System.out.print("How tall should the triangle be? ");
      triangleHeight = keyboard.nextInt() + 1;
      
      // Ask user which character should be used
      System.out.print("Which character should be used to print the triangle? ");
      asciiCharacter = keyboard.next();
      
      int triangleRow = 1;
      String triangleRowChars = "";
      int rowCharacterPosition = 1;
      
      while (triangleRow < triangleHeight) {
      
         triangleRowChars = "";
         rowCharacterPosition = 1;
         
         while (rowCharacterPosition <= triangleRow) {
         
            triangleRowChars = triangleRowChars + asciiCharacter;
            rowCharacterPosition ++;
         
         }
      
         System.out.println(triangleRowChars);
         triangleRow ++;
      
      }
      
         
   }

}