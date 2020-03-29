/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectbrief;

import java.util.List;

/**
 *
 * @author chatz
 */
public class SyntheticData {

    public static void insertSyntheticData(List<Student> studentList, List<Course> courseList, List<Trainer> trainerList, List<Assignment> assignmentList) {
        Course course1 = new Course("java", "full time", "back end", "01/02/2020", "31/04/2020");
        Course course2 = new Course("c##", "full time", "back end", "01/01/2020", "31/03/2020");

        courseList.add(course1);
        courseList.add(course2);

        Assignment assig = new Assignment("individualProjectBrief", "part a", "30/3/2020");
        Assignment assig2 = new Assignment("individualProjectBriefWithSql", "part b", "30/4/2020");
        Assignment assig3 = new Assignment("project1", "part a", "5/4/2020");
        Assignment assig4 = new Assignment("project2", "part b", "25/4/2020");
        assignmentList.add(assig);
        assignmentList.add(assig2);
        assignmentList.add(assig3);
        assignmentList.add(assig4);

        Student student1 = new Student("Babis", "Chatz", 1000, "27/06/1991");
        Student student2 = new Student("Nick", "Kara", 500, "27/07/1991");
        Student student3 = new Student("George", "Mel", 800, "22/01/1997");
        Student student4 = new Student("Semina", "Man", 1200, "10/11/1995");
        Student student5 = new Student("Eliza", "Dalton", 1500, "8/06/1993");
        Student student6 = new Student("Kwnstantina", "Syne", 1000, "24/03/1992");
        Student student7 = new Student("George", "Prist", 900, "27/02/1991");
        Student student8 = new Student("Nick", "Richard", 850, "27/09/1999");
        Student student9 = new Student("John", "Chatz", 750, "15/06/1990");
        Student student10 = new Student("Christin", "Chatz", 300, "1/06/1997");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        studentList.add(student9);
        studentList.add(student10);
        // Assignment assig1=new Assignment("Individual Project Brief","");

        Trainer trainer1 = new Trainer("George", "Kavouras", "java developer");
        Trainer trainer2 = new Trainer("Nick", "Titsia", "Unknown");
        Trainer trainer3 = new Trainer("Peter", "Tosch", "Unknown");
        trainerList.add(trainer1);
        trainerList.add(trainer2);
        trainerList.add(trainer3);

        System.out.println("*********************");
        //menu2

    }

}
