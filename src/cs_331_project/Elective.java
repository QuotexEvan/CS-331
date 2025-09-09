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
    
    protected List<String> relatedMajors;
    protected boolean isOpenToAll;

    public Elective(String title, String courseNumber, String description,
                    String department, int credits, int level,
                    boolean isOpenToAll) {
        super(title, courseNumber, description, department, false, credits, level);
        this.relatedMajors = new ArrayList<>();
        this.isOpenToAll = isOpenToAll;
    }

    public void addRelatedMajor(String major) {
        relatedMajors.add(major);
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nOpen to All: " + isOpenToAll +
               "\nRelated Majors: " + relatedMajors;
    }
}
