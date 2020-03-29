
package individualprojectbrief;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;



public class MyMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int x2;
        int x3;
        String x4;
        String valuesOrNo;
        boolean flag = true;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        

        List<Student> studentList = new ArrayList();
        List<Course> courseList = new ArrayList();

        List<Trainer> trainerList = new ArrayList();
        List<Assignment> assignmentList = new ArrayList();

        System.out.println("DO you want to insert values?");

        if (InsertCheckValues.typeDataOrNot().equals("y")) {

            while (flag) {

                x = InsertCheckValues.rightChoice();

                if (x == 1) {

                    AddingData.addStudent(studentList);

                } else if (x == 2) {

                    AddingData.addCourse(courseList);

                } else if (x == 3) {

                    AddingData.addAssingnment(assignmentList);

                } else if (x == 4) {
                    AddingData.addTrainer(trainerList);

                } else if (x == 5) {
                    flag = false;
                }

            }
        } else {

            SyntheticData.insertSyntheticData(studentList, courseList, trainerList, assignmentList);

        }
        flag2 = true;
//        flag4=true;
//        while (flag4){
//            System.out.println("Do you want to enter Assignment to course?");
//            x4=InsertCheckValues.typeDataOrNot();
//            if (x4.equals("y")){
            linkedClasses.insertAssignmentToCourse(courseList, assignmentList);
//            }
//            else{
//                flag4=false;
//            }
//        }
        while (flag2) {
            x2 = InsertCheckValues.rightChoiceForInserts();
            if (x2 == 1) {
                linkedClasses.insertStudentsToCourse(courseList, studentList);
            } else if (x2 == 2) {
                linkedClasses.insertTrainerToCourse(courseList, trainerList);
            
            } else if (x2 == 3) {
                flag2 = false;
            }

            
        }
        flag3 = true;
        while (flag3) {
            x3 = InsertCheckValues.rightChoiceForPrintings();
            if (x3 == 1) {
                PrintResults.printAllStudents(studentList);
                }
             else if (x3 == 2) {
               PrintResults.printAllTrainers(trainerList);
                }
             else if (x3 == 3) {
               PrintResults.printAllAssignments( assignmentList);

            } else if (x3 == 4) {
                PrintResults.printAllCourses(courseList);
            } else if (x3 == 5) {
               PrintResults.printAllStudentsPerCourses(courseList);
            } else if (x3 == 6) {
               PrintResults.printAllTrainersPerCourse(courseList);
            } else if (x3 == 7) {
                PrintResults.printAllAssignmentsPerCourse(courseList);

                }
             else if (x3 == 8) {
                PrintResults.printAllAssignmentsPerStudent(studentList);
            } else if (x3 == 9) {
               PrintResults.printAllStudentWithMoreThanOneCourse(studentList);
            } else if (x3 == 10) {
                PrintResults.listWithStudentsWithNotSubmitAssignment(studentList);
            }
            else if (x3==11){
                flag3 = false;
            }

        }
       
        
        
      

        
                            
                            
    }//end main

//    public static void printAllStudent(List<Student> list) {
//        System.out.printf("%20s %20s %20s %20s\n", "First Name", "Last Name", "Fees", "Date of Birth");
//        for (Student a : list) {
//            System.out.printf("%20s %20s %20d %20s\n", a.getFirstName(), a.getLastName(), a.getFees(), "Date of Birth");
//
//        }
//    }

    

    

   
    

    

    

    



}
