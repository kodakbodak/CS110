// Author: Isaac Smith
// Date: 04/27/2023
// File: Lab 5 Upside Down ASCII Triangle

import java.util.Scanner;

public class UpsideDownTriangle {

   public static void main (String [] args) {
   
      // Create a new scanner object
      Scanner keyboard = new Scanner(System.in);
      
      // Print instructions to user and declare triangle height int variable
      System.out.println("How tall should the triangle be? ");
      int triangleHeight = keyboard.nextInt();
      
      // Use for loops to print the triangle
      for (int row = triangleHeight; row > 0; row --) {
      
         for (int column = 0; column < row; column ++) {
         
            System.out.print("%");
         
         }
         
         System.out.println();
      
      }
     
   
   }

}