/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs_331_project;

/**
 *
 * @author evanranjitkar
 */
public class MajorRequirement extends Course {  
    // Inheriting properties and methods from the Course class
    
    // Declaring protected variable for the major
    protected String major;  
    
    // Declaring protected variable for the required grade (e.g. "A", "B", etc.)
    protected String requiredGrade;  
    
    // Declaring protected variable to check if the course is a capstone
    protected boolean isCapstone;

    // Constructor to initialize course details, major, required grade, and capstone status
    public MajorRequirement(String title, String courseNumber, String description,
                            String department, int credits, int level,
                            String major, String requiredGrade, boolean isCapstone) {
        super(title, courseNumber, description, department, true, credits, level);  
        // Calling the superclass (Course) constructor
        this.major = major;  // Setting the major
        this.requiredGrade = requiredGrade;  // Setting the required grade
        this.isCapstone = isCapstone;  // Setting whether it is a capstone course
    }

    // Getter method for major
    public String getMajor() { return major; }
    
    // Getter method for required grade
    public String getRequiredGrade() { return requiredGrade; }
    
    // Getter method to check if the course is a capstone
    public boolean isCapstone() { return isCapstone; }

    @Override
    // Overriding toString() to include major, required grade, and capstone details
    public String toString() {
        return super.toString() +
               "\nMajor: " + major +
               "\nRequired Grade: " + requiredGrade +
               "\nCapstone: " + isCapstone;
    }
}
