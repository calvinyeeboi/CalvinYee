// ************************************************************
// Student.java
//
// Define a student class that stores name, score on test 1, and
// score on test 2. Methods prompt for and read in grades,
// compute the average, and return a string containing student's info.
// ************************************************************

import java.util.Scanner;

public class Student{

    //declare instance data
    private String name;
    private int test1Score;
    private int test2Score;
    Scanner scan = new Scanner(System.in);

    //constructor
    public Student(String studentName){
        name = studentName;
    }
    
    // ---------------------------------------------
    //inputGrades: prompt for and read in student's grades for test1 and test2.
    //Use name in prompts, e.g., "Enter's Joe's score for test1".
    // ---------------------------------------------
    public void inputGrades(){
        System.out.print("Enter " + name + "'s score on first test: ");
        test1Score = scan.nextInt();
        System.out.print("Enter " + name + "'s score on second test: ");
        test2Score = scan.nextInt();
    }
    
    // ---------------------------------------------
    //getAverage: compute and return the student's test average
    // ---------------------------------------------
    public double getAverage(){
        double average;
        average = (double) (test1Score + test2Score) / 2;
        return average;
    }
    
    // ---------------------------------------------
    //getName: print the student's name
    // ---------------------------------------------
    public String getName(){
        return name;
    }
    
    // ---------------------------------------------
    //toString: returns a string
    // ---------------------------------------------
    public String toString(){
        return (" | Name: " + name + " | Test1: " + test1Score
                + " | Test2: " + test2Score + " | ");
    }
    
}