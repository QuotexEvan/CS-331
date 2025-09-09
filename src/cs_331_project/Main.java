/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cs_331_project;

/**
 *
 * @author evanranjitkar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // Create a base course
        Course introCS = new Course(
                "Intro to Computer Science",
                "CS101",
                "Introduction to programming concepts",
                "Computer Science",
                true,
                3,
                100
        );
        introCS.setInstructor("Dr. Smith");
        introCS.addSemesterOffered("Fall");
        introCS.addSemesterOffered("Spring");

        // Create a JaxMixRequirement course
        JaxMixRequirement ethics = new JaxMixRequirement(
                "Ethics in Technology",
                "PHIL220",
                "Study of ethics in modern technology",
                "Philosophy",
                3,
                200,
                JaxMixRequirement.Category.EXPERIENCE
        );
        ethics.setInstructor("Dr. Johnson");
        ethics.addSemesterOffered("Fall");

        // Create a MajorRequirement course
        MajorRequirement dataStructures = new MajorRequirement(
                "Data Structures",
                "CS201",
                "In-depth study of data structures and algorithms",
                "Computer Science",
                4,
                200,
                "Computer Science",
                "C",
                false
        );
        dataStructures.setInstructor("Prof. Allen");
        dataStructures.addSemesterOffered("Spring");
        dataStructures.addPrerequisite(introCS); // CS201 requires CS101

        // Create an Elective course
        Elective musicTech = new Elective(
                "Music Technology",
                "MUS150",
                "Exploration of digital tools in music creation",
                "Music",
                2,
                100,
                true
        );
        musicTech.setInstructor("Dr. Williams");
        musicTech.addSemesterOffered("Summer");
        musicTech.addRelatedMajor("Music");
        musicTech.addRelatedMajor("Computer Science");

        // Print all course information
        System.out.println("==== Base Course ====");
        System.out.println(introCS);

        System.out.println("\n==== JaxMix Requirement ====");
        System.out.println(ethics);

        System.out.println("\n==== Major Requirement ====");
        System.out.println(dataStructures);

        System.out.println("\n==== Elective ====");
        System.out.println(musicTech);

        // Test prerequisite
        System.out.println("\nDoes Data Structures have CS101 as prerequisite? "
                + dataStructures.hasPrerequisite(introCS));
    }
    
}
