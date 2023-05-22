// Name: Isaac Smith
// Date: 4/6/2023 
// Description:  Simple program that takes user input as radius of circle
// and uses that value to calculate the circumference of that circle
import java.util.Scanner;

public class CircumferenceOfCirlce { 
   
   public static void main(String[] args) { 

      // create an object of type Scanner
      Scanner keyboard = new Scanner(System.in);		
     
      // Ask the user to input a number with decimals
      System.out.print("Enter a decimal number, and press enter  ");
      
      // place the user's input into the variable radius
      double radius = keyboard.nextDouble();
      
      
      //Create a variable of type double to calclate the circles' diameter
      double diameter = 2 * radius; 
		

      // Step 3: Define a variable, circumference, of type double, and 
      // use the Math library's PI value to assign it a value that is 
      // the circumference, which has the formula pi * diameter. 
      // Hint: to use the Math Library's pi value, you use: Math.PI. 
      
      double circumference = Math.PI * diameter; 		
      
      // Output the result to the screen 
      System.out.println("The circle with radius " + radius + 
            " has a circumference of " + circumference); 
   } 
}

