/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs_331_project;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author evanranjitkar
 */
public class Elective extends Course {  
    // Inheriting properties and methods from the Course class
    
    // Declaring protected variable for the list of related majors
    protected List<String> relatedMajors;  
    
    // Declaring protected variable to check if the course is open to all students
    protected boolean isOpenToAll;

    // Constructor to initialize course details and elective-specific attributes
    public Elective(String title, String courseNumber, String description,
                    String department, int credits, int level,
                    boolean isOpenToAll) {
        super(title, courseNumber, description, department, false, credits, level);  
        // Calling the superclass (Course) constructor
        this.relatedMajors = new ArrayList<>();  // Initializing the related majors list
        this.isOpenToAll = isOpenToAll;  // Setting whether the elective is open to all
    }

    // Method to add a related major to the elective
    public void addRelatedMajor(String major) {
        relatedMajors.add(major);
    }

    @Override
    // Overriding toString() to include elective-specific details
    public String toString() {
        return super.toString() +
               "\nOpen to All: " + isOpenToAll +
               "\nRelated Majors: " + relatedMajors;
    }
}
