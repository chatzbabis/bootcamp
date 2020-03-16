
package user;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*Create a program that accepts input from a user.
The program must ask the user to enter info about his/her family.
The details that we need for each person are the following:
Name, Age, Height, Weight.
Store these details in a file in your Operating System.
The format of the file must be the following:
NAME        AGE        HEIGHT(m)    WEIGHT(kg)
Jack        12            1.85            65
Mary        24            1.76            76
The program should end only when the user enters "exit". But the process cannot be interrupted while entering details of a user. Everytime, the user inserts a person, the program should inform the user that "Person was successfully created".
Finally read the file that you created and print everything in the output
***Use formatted strings to create the format of the file(String.format)
***Create methods*/

public class User {

   static String filename = "C:\\Users\\chatz\\Έγγραφα\\NetBeansProjects\\userInfo.txt";
    public static void main(String[] args) throws FileNotFoundException, IOException {
        createFileAndSetFirstLine();
        
       Scanner sc=new Scanner(System.in);
       boolean notExit=true;
       while(notExit){
        System.out.println("enter 'exit' to exit or enter name: " ); 
       String name=sc.next();
       if(name.equals("exit"))
       {notExit=false; break;}
        System.out.println("enter 'exit' to exit or enter age: "); 
       String age=sc.next();
       if(age.equals("exit"))
       {notExit=false; break;}
        System.out.println("enter 'exit' to exit or enter height: "); 
       String height=sc.next(); 
       if(height.equals("exit"))
       { notExit=false; break;}
        System.out.println("enter 'exit' to exit or enter weight: ");       
       String weight=sc.next();
       if(weight.equals("exit"))
       {  notExit=false; break;}
       getString (name,age,height,weight);
        
       }
       
       

       //String[]userInfo={name,age,height,weight};
       
        
        
        
    }
    
    public static void getString (String name,String age,String height,String weight) throws IOException{
        
        File file = new File(filename); 
       FileWriter fileWriter = new FileWriter(filename, true); //χρειάζεται για να δώσουμε αυτο ως παράμετρο στο printWriter και να μην μας σβήνει τα παλιά δεδομένα όταν γράφουμε στο αρχείο 
        PrintWriter writer = new PrintWriter(fileWriter);
        String details2=String.format("%20s %20s %20s %20s \r\n", name, age,height,weight);
        writer.print(details2);
        writer.close();
    }
   
    public static void createFileAndSetFirstLine() throws IOException{
    
        String details=String.format("%20s %20s %20s %20s \r\n", "NAME", "AGE","HEIGHT(m)","WEIGHT(kg)");
         
         
         File file = new File(filename); 
       FileWriter fileWriter = new FileWriter(filename, true); //χρειάζεται για να δώσουμε αυτο ως παράμετρο στο printWriter και να μην μας σβήνει τα παλιά δεδομένα όταν γράφουμε στο αρχείο 
        PrintWriter writer = new PrintWriter(fileWriter);
        writer.print(details);
        writer.close();
    }
    
    
}
