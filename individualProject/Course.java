/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectbrief;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author chatz
 */
public class Course {
    private String title;
    private String stream;
    private String type;
    private LocalDate start_Date;
    private LocalDate end_Date;
    private List<Student>student=new ArrayList();
    private List<Trainer>trainer=new ArrayList();
    private List<Assignment>assignment=new ArrayList();
    //private Student[] students;

    public Course() {
    }
    
    

    public Course(String title, String stream, String type, String start_Date, String end_Date) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
        this.start_Date = LocalDate.parse(start_Date,dateFormat);
        this.end_Date = LocalDate.parse(end_Date,dateFormat);
    }

    
    public LocalDate getStart_Date() {
        return start_Date;
    }

    public void setStart_Date(LocalDate startDate) {
        this.start_Date = startDate;
    }

    public LocalDate getEnd_Date() {
        return end_Date;
    }

    public void setEnd_Date(LocalDate endDate) {
        this.end_Date = end_Date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
   
    public void setStudent(List<Student> student){
        this.student=student;
    }

    /**
     *
     * @return
     */
    public List<Student> getStudent(){
        return student;
    }

    public List<Trainer> getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer.add(trainer);
    }

    public List<Assignment> getAssignment() {
        return assignment;
    }

    public void setAssignment(List<Assignment> assignment) {
        this.assignment=assignment;
    }
    

    
    
    @Override
    public String toString() {
        return "Course{" + "title=" + title + ", stream=" + stream + ", type=" + type + ", start_Date=" + start_Date + ", end_Date=" + end_Date + ", student=" + student + '}';
    }
    
   
}
