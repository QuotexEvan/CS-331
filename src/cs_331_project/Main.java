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
        // Main method to test different types of courses
        
        // Create a base course
        Course introCS = new Course(
                "Introduction to Information Technology",
                "CS201",
                "A brief exposure to theory and operations of information technology. Concepts presented include computer systems, hardware and software. Hands-on experience with selected productivity software packages. (Department credit not given for CS/CIS majors and/or minors.)",
                "Computer Science",
                true,
                3,
                200
        );
        introCS.setInstructor("Jensen Cynthia");  // Setting instructor
        introCS.addSemesterOffered("Fall");  // Adding semester availability
        introCS.addSemesterOffered("Spring");

        // Create a JaxMixRequirement course
        JaxMixRequirement ethics = new JaxMixRequirement(
                "English Composition I",
                "EH101",
                "Introduction to critical reading, thinking, and writing through student interaction with textual and digital materials.",
                "English",
                3,
                100,
                JaxMixRequirement.Category.COMMUNICATION
        );
        ethics.setInstructor("Dr. Johnson");  // Setting instructor
        ethics.addSemesterOffered("Fall");    // Adding semester availability

        // Create a MajorRequirement course
        MajorRequirement dataStructures = new MajorRequirement(
                "Data Structures",
                "CS331",
                "Design, analysis, and implementation of fundamental data structures: trees, heaps, and graphs. Basic algorithmic analysis and strategies. Basic computability and introduction to distributed algorithms.",
                "Computer Science",
                3,
                300,
                "Computer Science",
                "C",
                false
        );
        dataStructures.setInstructor("Trifas Monica");   // Setting instructor
        dataStructures.addSemesterOffered("Fall");   // Adding semester availability
        dataStructures.addPrerequisite(introCS);       // Setting prerequisite (CS331 requires CS101)

        // Create an Elective course
        Elective elective = new Elective(
                "Rock Climbing and Rappelling",
                "HPE164",
                "Students will participate in on-campus skill sessions and two weekends of natural rock climbing and cliff rappelling",
                "Kinesiology",
                2,
                100,
                true
        );
        elective.setInstructor("Killen Paul");        // Setting instructor
        elective.addSemesterOffered("Fall");         // Adding semester availability
        elective.addRelatedMajor("Kinesiology");             // Adding related major
        elective.addRelatedMajor("Computer Science");

        // Print all course information
        System.out.println("==== Base Course ====");
        System.out.println(introCS);

        System.out.println("\n==== JaxMix Requirement ====");
        System.out.println(ethics);

        System.out.println("\n==== Major Requirement ====");
        System.out.println(dataStructures);

        System.out.println("\n==== Elective ====");
        System.out.println(elective);

        // Test prerequisite
        System.out.println("\nDoes Data Structures have CS101 as prerequisite? "
                + dataStructures.hasPrerequisite(introCS));
    }
}
