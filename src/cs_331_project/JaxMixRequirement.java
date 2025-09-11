/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs_331_project;

/**
 *
 * @author evanranjitkar
 */
public class JaxMixRequirement extends Course {  
    // Inheriting properties and methods from the Course class
    
    public enum Category { COMMUNICATION, EXPERIENCE, EXPRESSION, INQUIRY }
    // Declaring protected variable for the JaxMix category
    protected Category jaxMixCategory;

    // Constructor to initialize course details and JaxMix category
    public JaxMixRequirement(String title, String courseNumber, String description,
                             String department, int credits, int level, Category jaxMixCategory) {
        super(title, courseNumber, description, department, true, credits, level);  
        // Calling the superclass (Course) constructor
        this.jaxMixCategory = jaxMixCategory;  
        // Setting the JaxMix category
    }

    @Override
    // Overriding toString() to include JaxMix category in course details
    public String toString() {
        return super.toString() + "\nJaxMix Category: " + jaxMixCategory;
    }
}