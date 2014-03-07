// ************************************************************
// Grades.java
//
// Use Student class to get test grades for two students
// and compute averages
//
// ************************************************************

public class Grades{

    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike"); //create student2, "Mike"
        
        student1.inputGrades(); //input grades for Mary
        System.out.println(student1.getName() + "'s average is: "
                            + student1.getAverage()); //print average for Mary
        
        System.out.println();
        
        student2.inputGrades();//input grades for Mike
        System.out.println(student2.getName() + "'s average is: "
                            + student2.getAverage());//print average for Mike
        
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
    }
}