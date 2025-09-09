/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cs_331_project;

/**
 *
 * @author evanranjitkar
 */
public class MajorRequirement extends Course{
    
    protected String major;
    public MajorRequirement(String title, String courseNumber, String description, String department, String jaxMixCategory, String major){
        super(title, courseNumber, description, department, true );
        this.major = major;
    }
    
    public String getMajor(){
        return this.major;
    }
    
     @Override
    public String toString() {
        // Use the parent's toString() method and append new information
        return super.toString() + "\n" +
               "Major " + this.major;
    }
}
