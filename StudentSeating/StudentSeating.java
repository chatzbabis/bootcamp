/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentseating;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author chatz
 */
public class StudentSeating {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random=new Random();
        
       Scanner sc = new Scanner(System.in);
        System.out.println("How many rows does the class have?");
       int rows=sc.nextInt();
        System.out.println("How many students does the class have?");
       int students=sc.nextInt();
       /* while (rows>students){
            System.out.println("The rows must be smaller than students");
            System.out.println("How many rows does the class have?");
        rows=sc.nextInt();
        System.out.println("How many students does the class have?");
       students=sc.nextInt();
        }*/
       int seatsOfRow=(students/rows);
       int studentsForLastRows=(students%rows);
        String [][] names = new String[rows][]; //dhlwnoume tis seires twn thraniwn
    for (int i = 0; i < rows-1; i++) {
        
             names[i]=new String[seatsOfRow]; //arithmos kathismatwn kathe seiras
       // System.out.println(i+","+seatsOfRow);
        
    }
     names[rows-1] = new String [seatsOfRow+studentsForLastRows];
    for (int i=0; i<rows;i++){
            for(int j=0; j<names[i].length; i++){
                
                    System.out.println(names[i][j]+",");
            }
        }
       
        
    while (fillOrNotFill(names,rows)) {
        //System.out.printf("the class has %d null seats",howManySeats(names,rows));
        // pairnei tyxaio arithmo apo 0 mexri to plhthos twn mathitwn
        
        int x=getRandomNumberBetween(1,students);
        //int x=;
        int seiraMathiti=(x/rows)-1;
        int kathismaMathiti=(x%rows)-1;
        
        if (names[seiraMathiti][kathismaMathiti]==null){
            System.out.println("Please write the name of student");
            String nameOfStudent=sc.next();
            System.out.printf("Can entered '%s' at the rows %d and seat %d type y or n",nameOfStudent,seiraMathiti+1,kathismaMathiti+1 );
            String answer=sc.next();
            if (answer=="y"){
                names[seiraMathiti][kathismaMathiti]=nameOfStudent;
            }
            else
                continue;
        }
        else continue;
        
    }   
    
    for (int i=0; i<rows;i++){
            for(int j=0; j<names[i].length; j++){
                if (names[i][j]==null)
                    System.out.print(names[i][j]+",");
                    }
            System.out.println();
        }
        
      
       
    }
    static boolean fillOrNotFill(String names[][],int rows){
        for (int i=0; i<rows;i++){
            for(int j=0; j<names[i].length; i++){
                if (names[i][j]==null)
                    return true;
            }
        }
        return false;
    }
    
    static int getRandomNumberBetween(int a,int b){
        Random random=new Random();
        int result=random.nextInt((b+1)-a);
        int myNumber=result+a;
        
        return myNumber;
       
    }
    
    /*static int howManySeats(String names[][],int rows){
        int k=0;
        for (int i=0; i<rows;i++){
            for(int j=0; j<names[i].length; j++){
                if (names[i][j]==null)
                    k++;
            }
        }
        return k;
    }*/
}
