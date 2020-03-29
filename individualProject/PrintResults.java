/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectbrief;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author chatz
 */
public class PrintResults {

    public static void printAllStudents(List<Student> studentList) {
        System.out.println("*******Students*******");
        for (Student s : studentList) {

            System.out.println(s);
        }

    }
    
    public static void printAllTrainers(List<Trainer> trainerList){
         System.out.println("*********Trainers*****");
                for (Trainer t : trainerList) {

                    System.out.println(t);
    
    }}
     public static void printAllAssignments(List<Assignment> assignmentList){
     System.out.println("*********Assignments*****");
                for (Assignment assig : assignmentList) {

                    System.out.println(assig);

                }
     
     }
     public static void printAllCourses(List<Course>courseList){
             System.out.println("*********Course*****");
                for (Course c : courseList) {

                    System.out.println(c.getTitle());
                }
     }
     public static void printAllStudentsPerCourses(List<Course>courseList){
          System.out.println("**********Students Per Course******** ");
                for (Course c : courseList) {

                    System.out.println("the" + c.getTitle() + " course has these students:");
                    System.out.println(c.getStudent());
                }
     
     }
     public static void printAllTrainersPerCourse(List<Course>courseList){
          System.out.println("**************Trainers Per Course*******");
                for (Course c : courseList) {

                    System.out.println("the " + c.getTitle() + " course has these students:");
                    System.out.println(c.getTrainer());
                }

     }
     
     public static void printAllAssignmentsPerCourse(List<Course>courseList){
         System.out.println("**********Assignments Per Course******** ");
                for (Course c : courseList) {

                    System.out.println("the" + c.getTitle() + " course has these Assignment:");
                    System.out.println(c.getAssignment());
     
     }
     }
     public static void printAllAssignmentsPerStudent(List<Student>studentList){
     System.out.println("**********Assignments Per Student******** ");
                for (Student s : studentList) {

                    System.out.println("the" + s.getFirstName() + " " + s.getLastName() + " has these Assignment:");
                    System.out.println(s.getAssignmentListOfStudent());

                }
     }
     public static void printAllStudentWithMoreThanOneCourse(List<Student>studentList){
         System.out.println("**********Students that belong to more than one Courses**********");
     for (Student s : studentList) {
                    
                    if (s.getCourseListOfStudent().size() > 1) {
                        System.out.println(s.getFirstName() + " " + s.getLastName());
                    }

                }
     }
     
     public static void listWithStudentsWithNotSubmitAssignment(List<Student>studentList){
         boolean flag;
        System.out.print("Enter the Ending Date ");
        LocalDate newDate;
        newDate = AddingData.dateInput("(like: 25/11/2017): ");
        

        DayOfWeek myDayOfWeek = newDate.getDayOfWeek();
        System.out.println("DayOfWeek: " + myDayOfWeek);
        LocalDate firstDateOfWeek = newDate;
        while (firstDateOfWeek.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstDateOfWeek = firstDateOfWeek.minusDays(1);
        }
        

        LocalDate lastDateOfWeek = firstDateOfWeek.plusDays(4);
        //System.out.println("lastDayOfWeek: " + lastDateOfWeek);
        System.out.println("th students who need to submit one or more assignments after "+firstDateOfWeek+" and before "+lastDateOfWeek+" are: ");
        for (Student s : studentList) {
            flag = false;
            for (Assignment assig : s.getAssignmentListOfStudent()) {
                if (assig.getSubDateTime().isBefore(lastDateOfWeek.plusDays(1)) && assig.getSubDateTime().isAfter(firstDateOfWeek.minusDays(1))){
                    flag=true;
//                    System.out.println(s.getFirstName()+ " "+s.getLastName());
                }
            }
            if (flag==true)
            {System.out.println(s.getFirstName()+" "+ s.getLastName());}
        }
     }
}
