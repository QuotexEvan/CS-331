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
    protected String requiredGrade; // e.g. "A", "B", etc.
    protected boolean isCapstone;

    public MajorRequirement(String title, String courseNumber, String description,
                            String department, int credits, int level,
                            String major, String requiredGrade, boolean isCapstone) {
        super(title, courseNumber, description, department, true, credits, level);
        this.major = major;
        this.requiredGrade = requiredGrade;
        this.isCapstone = isCapstone;
    }

    public String getMajor() { return major; }
    public String getRequiredGrade() { return requiredGrade; }
    public boolean isCapstone() { return isCapstone; }

    @Override
    public String toString() {
        return super.toString() +
               "\nMajor: " + major +
               "\nRequired Grade: " + requiredGrade +
               "\nCapstone: " + isCapstone;
    }
}
