// Name : Isaac Smith
// Date : 05/18/2023
// File: Lab 8 Intro to Arrays

import java.util.Scanner;
import java.util.Random;

public class ArrayOfExamScores {

    // The main method
    public static void main(String[] args) {    
        int runningTotal = 0;
        double result;
        int maximumScore = 0;
        int maximumScoreStudent = 0;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.print("How many students are in the class? ");
        int numStudentsInClass = keyboard.nextInt();
        
        // New array for holding test scores
        int [] arrayOfTestScores = new int [numStudentsInClass];
        
        // New random object for random test scores   
        Random rand = new Random();
        
        for (int i = 0; i < numStudentsInClass; i++) {
            
            // Highest possible score is 100
            arrayOfTestScores[i] = rand.nextInt(101);
            
            // Print out the score for each student
            System.out.println("Student number " + (i+1) + " has a score of " + arrayOfTestScores[i]);
            
            // Add scores to use for calculating average score
            runningTotal += arrayOfTestScores[i];
            
            // Calculte highest score and determine student who achieved it
            if (arrayOfTestScores[i] > maximumScore) {
            
               maximumScore = arrayOfTestScores[i];   
               
               maximumScoreStudent = i+1;
               
            }
        }
        
        // calculate average score for all scores
        result = runningTotal / (double)numStudentsInClass;
        
        // Print out the average score
        System.out.println("The average score is " + result);
        
        // print out the maximum score and who achieved it
        System.out.println("The maximum score is " + maximumScore + " by student " + maximumScoreStudent);
        
    }
}
