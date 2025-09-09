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
    
    protected String jaxMixCategory;
    
    public JaxMixRequirement(String title, String courseNumber, String description, String department, String jaxMixCategory){
        super(title, courseNumber, description, department, true );
        this.jaxMixCategory = jaxMixCategory;
    }
    
     @Override
    public String toString() {
        // Use the parent's toString() method and append new information
        return super.toString() + "\n" +
               "JaxMix Category: " + jaxMixCategory;
    }
}
