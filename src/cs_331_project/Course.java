/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs_331_project;

/**
 *
 * @author evanranjitkar
 */
public class Course {
    
    protected String title;
    protected String courseNumber;
    protected String description;
    protected String department;
    private boolean isRequired;
    
    public Course(String title, String courseNumber, String description, String department, boolean isRequired) {
        this.title = title;
        this.courseNumber = courseNumber;
        this.description = description;
        this.department = department;
        this.isRequired = isRequired;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public String getDescription() {
        return description;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Course Number: " + courseNumber + "\n" +
               "Title: " + title + "\n" +
               "Department: " + department + "\n" +
               "Description: " + description;
    }
}
