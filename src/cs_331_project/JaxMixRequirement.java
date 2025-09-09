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
    
    public enum Category { COMMUNICATION, EXPERIENCE, EXPRESSION, INQUIRY }
    protected Category jaxMixCategory;

    public JaxMixRequirement(String title, String courseNumber, String description,
                             String department, int credits, int level, Category jaxMixCategory) {
        super(title, courseNumber, description, department, true, credits, level);
        this.jaxMixCategory = jaxMixCategory;
    }

    @Override
    public String toString() {
        return super.toString() + "\nJaxMix Category: " + jaxMixCategory;
    }
}
