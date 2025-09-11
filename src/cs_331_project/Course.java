/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs_331_project;

/**
 *
 * @author evanranjitkar
 */

// Importing ArrayList and List
import java.util.ArrayList;
import java.util.List;

public class Course {

    // Declaring protected variables for the course
    protected String title;
    protected String courseNumber;
    protected String description;
    protected String department;
    protected boolean isRequired;
    protected int credits;
    protected int level; // e.g. 100, 200, 300
    protected String instructor;

    // Declaring a List of Course to store prerequisites
    protected List<Course> prerequisites;
    
    // Declaring a list of String to store semestersOffered
    protected List<String> semestersOffered; // e.g. "Fall", "Spring", "Summer"

    // Constructor
    public Course(String title, String courseNumber, String description, String department,
                  boolean isRequired, int credits, int level) {
        this.title = title;
        this.courseNumber = courseNumber;
        this.description = description;
        this.department = department;
        this.isRequired = isRequired;
        this.credits = credits;
        this.level = level;
        this.instructor = "TBA"; // To be Announced
        this.prerequisites = new ArrayList<>();
        this.semestersOffered = new ArrayList<>();
    }

    // Getter methods
    public String getTitle() { return title; }
    public String getCourseNumber() { return courseNumber; }
    public String getDescription() { return description; }
    public String getDepartment() { return department; }
    public int getCredits() { return credits; }
    public int getLevel() { return level; }
    public String getInstructor() { return instructor; }

    // Setter methods
    public void setInstructor(String instructor) { this.instructor = instructor; }
    
    // Adding to a List
    public void addSemesterOffered(String semester) { semestersOffered.add(semester); }
    public void addPrerequisite(Course course) { prerequisites.add(course); }

    public boolean hasPrerequisite(Course course) {
        return prerequisites.contains(course);
    }

    @Override
    // Overriding toString() method
    public String toString() {
        return "Course Number: " + courseNumber + "\n" +
               "Title: " + title + "\n" +
               "Department: " + department + "\n" +
               "Credits: " + credits + " | Level: " + level + "\n" +
               "Instructor: " + instructor + "\n" +
               "Semesters Offered: " + semestersOffered + "\n" +
               "Description: " + description;
    }
}
