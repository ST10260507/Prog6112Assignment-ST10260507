/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignmentoneprog6112;

import java.util.ArrayList;
import java.util.Scanner;

/*
References: 
  -- Farrell, J. (2019). Java programming. Australia: Cengage Learning.
  -- GeeksforGeeks. (2016). Clone() method in Java. [online] Available at:
     https://www.geeksforgeeks.org/clone-method-in-java-2/ [Accessed 20 Sep. 2023].
  -- Jain, S. (2022). matches() in Java | matches() Function in Java. [online] 
     Scaler Topics. Available at: https://www.scaler.com/topics/matches-in-java/ 
     [Accessed 20 Sep. 2023].
  -- Khandelwal, A. (2016). System.exit() in Java. [online] GeeksforGeeks. 
     Available at: https://www.geeksforgeeks.org/system-exit-in-java/. 
     [Accessed 20 Sep. 2023].
*/

public class AssignmentOneProg6112 
{
     // An ArrayList Constructor to call the ArrayLists from the Tasks class
     // Declaring the variables as 'private static' to access them within the same class
      private static ArrayList <String> studName;
      private static ArrayList <Integer> studID;
      private static ArrayList <String> studEmail;
      private static ArrayList <Integer> studAge; 
      private static ArrayList <String> studCourse; 
      
      // Constructor
      public AssignmentOneProg6112 (ArrayList <String> studName, ArrayList <Integer> studID,
              ArrayList <String> studEmail, ArrayList <Integer> studAge,ArrayList <String> studCourse)
        {
          this.studName = studName;
          this.studID = studID;
          this.studEmail = studEmail;
          this.studAge = studAge;
          this.studCourse = studCourse;
        } // end of constructor
      
     public static void main(String[] args) 
     {
        //declarations 
        int userNum;
        boolean quit = false;
        Scanner kb = new Scanner(System.in);
        
        // Intro to the program
        System.out.println("STUDENT MANAGEMENT APPLICATION");
        System.out.println("**********************************");
        
        // A while loop to run until the user clicks a number other than 1
        while(!quit)
         {
            // Prompting the user
           System.out.println("Enter 1 to launch the menu or any other key to exit");
           userNum = kb.nextInt();
      
           // An if-statement which calls the menu if the user selects 1 and 
           // which exits the program if the user selects anything other than 1
            if (userNum == 1)
                {
                 menu();
                } // end of if-statement
             else 
                {
                  System.out.println("Exiting program...");
                  quit = true;
                  System.exit(0);
                } // end of else statement 
         } // end of while loop
    } // end of main method 
    
     // This method prompts the user and calls a certain method depending upon 
     // which option the user chooses
    public static void menu()
    {
        //declarations
        int menuItem;
        boolean quitMenu = false;
        
        // Scanner object
        Scanner kb = new Scanner(System.in);
        
        // A while loop to run until the user selects 5 to exit 
        while(!quitMenu)
         {
            // prompting the user 
            System.out.println("Please select one of the following menu items:"
                + "\n(1) Capture a new student"
                + "\n(2) Search for a new student"
                + "\n(3) Delete a student"
                + "\n(4) Print student report"
                + "\n(5) Exit application"); 
            menuItem = kb.nextInt();
        
            // A switch case to call a specific method depending on the option the user chooses
            switch(menuItem)
             {
               case 1: saveTheStudent();break;
               case 2: lookForStudent();break;
               case 3: removeStudent();break;
               case 4: report();break;
               case 5: leaveApplication();break;
               
               // A default message is displayed if the user selects a number 
               //other than the ones provided
               default: System.out.println("Invalid Entry");break;
             }// end of switch case
         } // end of while loop 
    } // end of method 
   
    //This is the saveStudent() module which is called if the user selects 1
    public static void saveTheStudent()
     {
        // This calls the constructor from the Student Class
        Student student = new Student(0,"",0,"","");
        
        // This calls the getStudentData() module from the Tasks Class that 
        // allows the user to add the student details 
        student.getStudentData(0); 
        
     }// end of method 
    
    // This is the lookForStudent() method which is called if the user selects 2
    public static void lookForStudent()
     {
         // This calls the constructor from the Student Class
        Student student = new Student(0,"",0,"","");
        
        // This calls the searchStudent() method from the Student class which 
        // allows the user to search for a specific student 
        student.searchStudent(studName,studID,studEmail, studAge, studCourse);
        
     }// end of method 
   
    // This is the removeStudent() method which is called if the user selects 3
    public static void removeStudent()
     {   
         // Scanner Object
        Scanner kb = new Scanner(System.in);
        
        // This calls the constructor from the Student Class
        Student student = new Student(0,"",0,"","");
        
        // This calls the deleteStudent() method from the student class which allows 
        // the user to enter a student ID, which then allows them to delete a student's data
        student.deleteStudent(studName,studID,studEmail, studAge, studCourse,kb );
        
     } // end of method
    
    // This is the report() method which is called if the user selects 4
    public static void report()
    {
        // This calls the constructor from the Student class
        Student student = new Student(0,"",0,"","");
        
        // This calls the studentReport() method from the Student class which 
        // displays a report to the user of the all the students entered
        student.studentReport(studName,studID,studEmail, studAge, studCourse);
        
    }// end of method 
    
    // This is the leaveApplication() method which is called if the user selects 5
    public static void leaveApplication()
    {
        // This calls the constructor from the student class
        Student student = new Student(0,"",0,"","");
        
        // This calls the exitStudentApplication() method from the Student class 
        // which allows the user to exit the application 
        student.exitStudentApplication();
        
    }// end of method 
}// end of class 
