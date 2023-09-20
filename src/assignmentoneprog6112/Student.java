/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignmentoneprog6112;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class Student 
 {
       // Scanner Object 
       Scanner kb = new Scanner(System.in);
       
       // ArrayList Declarations
       private ArrayList<Integer> studID;
       private ArrayList<String> studName;
       private ArrayList<Integer> studAge;
       private ArrayList<String> studEmail;
       private ArrayList<String> studCourse;

       // Declarations
        int studentID;
        String studentName;
        int studentAge;
        String studentEmail;
        String studentCourse;

    // Constructor
    public Student(int studentID, String studentName, int studentAge, 
            String studentEmail, String studentCourse) 
    {
        this.studID = new ArrayList<>();
        this.studID.add(studentID);
        this.studentID = studentID;
        
        this.studName = new ArrayList<>();
        this.studName.add(studentName);
        this.studentName = studentName;
        
        this.studAge = new ArrayList<>();
        this.studAge.add(studentAge);
        this.studentAge = studentAge;
        
        this.studEmail = new ArrayList<>();
        this.studEmail.add(studentEmail);
        this.studentEmail = studentEmail;
        
        this.studCourse = new ArrayList<>();
        this.studCourse.add(studentCourse);
        this.studentCourse = studentCourse;
    } // end of constructor
    
    public ArrayList<Integer> getStudentID() // This is the studentID ArrayList getter
     {
        return studID;
     } // end of getter
    
    public void setStudentID(ArrayList<Integer> studentID) // This is the studentID ArrayList setter
     {
        this.studID = studentID;
     }// end of setter

    public ArrayList<String> getStudentName() // This is the studentName ArrayList getter
     {
        return studName;
     }// End of getter

    public void setStudentName(ArrayList<String> studentName) // This is the studentName ArrayList setter
    {
        this.studName = studentName;
    }// End of setter

    public ArrayList<Integer> getStudentAge() // This is the studentAge ArrayList getter
    {
        return studAge;
    } // end of getter

    public void setStudentAge(ArrayList<Integer> studentAge) // This is the studentAge ArrayList setter
    {
        this.studAge = studentAge;
    }// end of setter

    public ArrayList<String> getStudentEmail() // This is the studentEmail ArrayList getter
    {
        return studEmail;
    }// end of getter

    public void setStudentEmail(ArrayList<String> studentEmail) // This is the studentEmail setter 
    {
        this.studEmail = studentEmail;
    }// End of setter

    public ArrayList<String> getStudentCourse() // This is the studentCourse getter
    {
        return studCourse;
    }// End of getter

    public void setStudentCourse(ArrayList<String> studentCourse) // This is the studentCourse setter
    {
        this.studCourse = studentCourse;
    }// End of getter

    public boolean checkStudAge(int studentAge) // Method to check if age is valid
    {
        return studentAge >= 16;
    }// end of method 
    
    //Method to prompt the user for the number of students they want to add 
    public int numOfStudents()
    {
         System.out.println("Please enter the number of students you would like to add");
          return kb.nextInt();
    }// End of method

    // Method to get student information
    public int getStudentData(int numOfStud) 
    {
        //Declarations 
        studentAge = 0;
        boolean ageValidated;
        
        //Calling the numOfStudents() method and assigning it to a variable
        numOfStud = numOfStudents();
         
        // ArrayList Declarations
        studID = new ArrayList(numOfStud);
        studName = new ArrayList(numOfStud);
        studAge = new ArrayList(numOfStud);
        studEmail = new ArrayList(numOfStud);
        studCourse = new ArrayList(numOfStud);
      
        // A for loop which only loops for the number of students that the user wants to enter
        for (int i = 0; i < numOfStud; i++) {
            
            // Introducing the section to the user 
            System.out.println("\nCAPTURE A NEW STUDENT");
            System.out.println("**********************************");

            // Prompting the user for the student ID - saving the ID in a variable (studentID). 
            // Then saving that variable in an element in the studID arrayList
            System.out.print("Please enter the student ID: ");
            studentID = kb.nextInt();
            studID.add(i,studentID);
            
            kb.nextLine();

            // Prompting the user for the student name - saving the name in a variable (studentName). 
            // Then saving that variable in an element in the studName arrayList
            System.out.print("Please enter the student name: ");
            studentName = kb.nextLine();
            studName.add(i,studentName);

            // setting the ageValidated (boolean) variable to false 
             ageValidated = false;

             // Using a do-while loop to complete the age check
            do {
                // Prompting the user for the student age
                System.out.print("Please enter the student Age: ");
                
                // Saving the userInput as a string variable to complete the character check for the age
                String userInput = kb.nextLine(); 

                // Using an if-statement to convert the string input into a 
                // numeric variable if it is a the userInput is a number. Then calling the checkStudAge() 
                // method by saving it to a variable
                if (userInput.matches("\\d+")) 
                {
                    studentAge = Integer.parseInt(userInput);
                    ageValidated = checkStudAge(studentAge);

                    // Using an if-statement to display an error message if the age is less than 16
                    if (!ageValidated) 
                    {
                        System.out.println("You have entered an Invalid student age!!!"
                            + "\nPlease re-enter the student age >>> ");
                    }// End of if-statement
                } // End of if-statement
                else // an else-statment to display an error message if the age is a character - the user is re-promtped
                {
                    System.out.println("You have entered an Invalid student age!!!"
                            + "\nPlease re-enter the student age >>> ");
                }// end of else-statement
            } while (!ageValidated); // end of do-while statement - the do-while ocntinues to loop until a number is inputted
            
            // After saving the numeric value in a variable (studentAge). 
            // The variable is then saved as an element in the studAge arrayList 
            studAge.add(i,studentAge);

            // Prompting the user for the student's Email - then saving the email in a variable (studentEmail)
            // The value stored in the studentEmail variable is then saved as an element in the studEmail ArrayList
            System.out.print("Please enter the student Email: ");
            studentEmail = kb.nextLine();
            studEmail.add(i,studentEmail);

            // Prompting the user for the student's Course - then saving the course in a variable (studentCourse)
            // The value stored in the studentCourse variable is then saved as an element in the studCourse ArrayList
             System.out.print("Please enter the student Course: ");
            studentCourse = kb.nextLine();
            studCourse.add(i,studentCourse);
        }// end of for loop 

        //Letting the user know that all of their details have been saved
        System.out.println("\nThe student details have been successfully saved");
        
        // Prompting the user and asking them if they want to return to the menu or exit the program 
        // If the user selects 1, the menu is launched again
        // If they select any other numeric value, the program exits 
        System.out.print("\nEnter 1 to launch the menu or any other key to exit: ");
        int userNum = kb.nextInt();

        if (userNum != 1) 
          {
            System.out.println("Exiting Program.....");
            System.exit(0);
          }// end of if-statement
        
        // This calls the ArrayList Constructor from the AssignmentOneProg6112 Class
        AssignmentOneProg6112 assignment = new AssignmentOneProg6112(studName,studID,studEmail, studAge, studCourse);
            return numOfStud;
    }// End of Method
    /*
      -- This method can be used to get all the student data as ArrayLists
      -- A new ArrayList is created and it is called studentData and it is then 
         populated with clones (copies) of the ArrayList objects studID, 
        studName, studAge, studEmail, and studCourse
      */
    public ArrayList<Object> saveStudent() 
    {
        ArrayList<Object> studentData = new ArrayList<>();
        studentData.add(studID.clone());
        studentData.add(studName.clone());
        studentData.add(studAge.clone());
        studentData.add(studEmail.clone());
        studentData.add(studCourse.clone());
        return studentData;
    }// end of Method
   
    // This method is used to search for a student in a collection of student 
    // data and return the student's information if a match is found based on a 
    // search query, which appears to be the student's ID.
    public Student searchforStudent(int searchQuery) 
    {
        // For loop to sift through the arrayList until a match is found
        for (int i = 0; i < studID.size(); i++) 
        {
            // An if-statement which checks the user's searchQuery against the 
            // values stored in the arrayList
            if (studID.get(i).equals(searchQuery)) 
            {
                return new Student(studID.get(i), studName.get(i), studAge.get(i), studEmail.get(i), studCourse.get(i));
            }// End of if-statement
        } // end of for-loop 
        
        // Return null if student is not found
        return null; 
        
    }// end of method
   
    // This method is used to search for a specific student based upon the student ID
    public void searchStudent(ArrayList <String> studName, ArrayList <Integer> studID,
              ArrayList <String> studEmail, ArrayList <Integer> studAge,ArrayList <String> studCourse)
    {
        // Declarations
        int searchQuery;
        int userNum;
        boolean found = false; 
        
        // Scanner Object
        Scanner kb = new Scanner(System.in);
        
        //Get user's search Query 
        System.out.print( "Enter the students ID to search: ");
        searchQuery = kb.nextInt();
        
        System.out.println("--------------------------------------------------");
        
        //A for-loop to search through the array List
        for (int i = 0; i < studID.size(); i++)
        {
            // An if-statement which displays the student's details if the studentID 
            // that the user typed, matches the one stored in the ArrayList
            if (studID.get(i).equals(searchQuery)) 
            {
                System.out.println( "STUDENT ID: " + studID.get(i)
                + "\nSTUDENT NAME: " + studName.get(i)
                + "\nSTUDENT AGE: " + studAge.get(i)
                + "\nSTUDENT EMAIL: " + studEmail.get(i)
                + "\nSTUDENT COURSE: " + studCourse.get(i));  
                
                System.out.println("--------------------------------------------------");
                
                found = true; 
                break;
            }// endif
        
        }//endfor
            // If the student's ID was not found, then an error message is displayed 
            if (!found)
             {
                 System.out.println("Student with Student ID: " + searchQuery
                + " was not found!");
                 System.out.println("--------------------------------------------------");
             } // end of if-statement 
            
        // Prompting the user and asking them if they want to return to the menu or exit the program 
        // If the user selects 1, the menu is launched again
        // If they select any other numeric value, the program exits 
        System.out.print("\nEnter 1 to launch the menu or any other key to exit: ");
        userNum = kb.nextInt();
        if (userNum != 1) 
          {
            System.out.println("Exiting Program.....");
            System.exit(0);  
          }// end of if-statement 
    }// end of method
    
    // This method removes a student's data from multiple ArrayLists based on a 
    // given index and returns a boolean value to indicate whether the removal 
    // was successful or not
    public boolean removeStudent(ArrayList<String> studName, ArrayList<Integer> studID,
                             ArrayList<String> studEmail, ArrayList<Integer> studAge,
                             ArrayList<String> studCourse, int indexToDelete) 
    {
        if (indexToDelete != -1) 
         {
           studID.remove(indexToDelete);
           studName.remove(indexToDelete);
           studAge.remove(indexToDelete);
           studEmail.remove(indexToDelete);
           studCourse.remove(indexToDelete);
           return true;
         }// end of if-statement
        
     return false;
     
    }// end of method

    // This method allows the user to enter a student's ID and delete the 
    // student's data if that ID was found 
    public boolean deleteStudent(ArrayList <String> studName, ArrayList <Integer> studID,
              ArrayList <String> studEmail, ArrayList <Integer> studAge,
              ArrayList <String> studCourse, Scanner inputScanner)
    {         
       // Declarations
       int index = -1; // Initialize index to -1 (invalid index)
       int userNum;
       int deleteStud;
       String deleteID; 
       
       // Setting the deleteID variable to "N" (No)
       deleteID= "N"; 
    
       //Prompting the user and asking them to enter the Student ID they want to delete
       System.out.print("Enter the student ID to delete: ");
       deleteStud = inputScanner.nextInt();
       
       inputScanner.nextLine();        

       // Find the index of the task with the student ID
       for (int i = 0; i < studID.size(); i++) 
        {
          if (studID.get(i).equals(deleteStud)) 
          {
             index = i;
             break;
          }// end of if-statement
        } // end of for-loop 

       // An if-statement which prompts the user and asks them if they want to 
       // delete the student ID once it has been found 
       if (index != -1) 
        {
          System.out.println("Are you sure you want to delete student with student ID: " 
              + deleteStud + " from the system? Yes (Y) to delete");
          deleteID = inputScanner.nextLine();
      
          System.out.println("--------------------------------------------------");
       
          // It checks if the task was found and deletes the student Data
          if (deleteID.equalsIgnoreCase("Y")) 
           {
             // Call removeStudent to remove the student from ArrayLists
             boolean deletionSuccessful = removeStudent(studName, studID, studEmail, studAge, studCourse, index);

             // An if-statement which lets the user know that the student details have been deleted
             if (deletionSuccessful) 
              {
                System.out.println("Student with student ID: " + deleteStud + " WAS deleted");
                System.out.println("--------------------------------------------------");
                return true;
              }// end of If-statement
           } // End of for-loop 
        } // End of If-statement
       
        // If the student ID doesn't match any of the values stored in the 
        // ArrayLists, a message is displayed to the user that the stduent with 
        // that ID was not found 
       else
        {
          System.out.println("Student with student ID: " + deleteStud + " was not found.");
          System.out.println("--------------------------------------------------");
        } // End of else-statement 
    
       // Prompting the user and asking them if they want to return to the menu or exit the program 
       // If the user selects 1, the menu is launched again
       // If they select any other numeric value, the program exits 
       System.out.print("\nEnter 1 to launch the menu or any other key to exit: ");
       userNum = inputScanner.nextInt();
    
       if (userNum != 1) 
        {
          System.out.println("Exiting Program.....");
          System.exit(0);  
        }// End of if-statement 
    
      return false;
    }// End of Method
     
    // This method displays a report to the user with all of the students details 
    public void studentReport(ArrayList <String> studName, ArrayList <Integer> studID,
              ArrayList <String> studEmail, ArrayList <Integer> studAge,ArrayList <String> studCourse)
    {
        //Declarations
        int userNum;
        
        // For loop to loop for the number of student's details entered
        for (int i = 0; i < studID.size(); i++) 
         {
          System.out.println( "STUDENT " + (i+1)
                 + "\n--------------------------------------------------"
                + "\nSTUDENT ID: " + studID.get(i)
                + "\nSTUDENT NAME: " + studName.get(i)
                + "\nSTUDENT AGE: " + studAge.get(i)
                + "\nSTUDENT EMAIL: " + studEmail.get(i)
                + "\nSTUDENT COURSE: " + studCourse.get(i)); 
          System.out.println("--------------------------------------------------");
         }// End of for-loop 
        
        // Scanner Object 
        Scanner kb = new Scanner(System.in);
        
        // Prompting the user and asking them if they want to return to the menu or exit the program 
        // If the user selects 1, the menu is launched again
        // If they select any other numeric value, the program exits 
        System.out.print("\nEnter 1 to launch the menu or any other key to exit: ");
             userNum = kb.nextInt();
              if (userNum != 1) 
             {
                 System.out.println("Exiting Program.....");
               System.exit(0);  
             } // end of-statement 
    } 
    
    // This allows the user to exit the applicationif they want to 
    public void exitStudentApplication()
      {
        System.out.println("Exiting Program.....");
        System.exit(0);
      }// end of method

}// End of class
