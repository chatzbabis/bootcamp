/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package individualprojectbrief;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author chatz
 */
public class Assignment {
    private String title;
    private String description;
    private double totalMark;
    private LocalDate subDateTime;

    public Assignment(String title, String description, String subDateTime) {
        this.title = title;
        this.description = description;
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("d/M/yyyy");
        this.subDateTime =LocalDate.parse(subDateTime, dateFormat);
    }

    public Assignment() {
    }

   

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(double totalMark) {
        this.totalMark = totalMark;
    }

    public LocalDate getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(LocalDate subDateTime) {
        this.subDateTime = subDateTime;
    }

    @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", description=" + description + ", totalMark=" + totalMark + ", subDateTime=" + subDateTime + '}';
    }
    
    
}
