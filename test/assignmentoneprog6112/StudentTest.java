/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package assignmentoneprog6112;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest 
 {
    /*
    References: 
    -- Geeksforgeeks (2016). ArrayList in Java. [online] GeeksforGeeks. 
       Available at: https://www.geeksforgeeks.org/arraylist-in-java/ 
       [Accessed 20 Sep. 2023].
    -- junit.org. (n.d.). Assert (JUnit API). [online] Available at: 
       https://junit.org/junit4/javadoc/latest/org/junit/Assert.html 
       [Accessed 20 Sep. 2023].
    -- Prasad, R. (2018). Arrays asList() method in Java with Examples. [online]
       GeeksforGeeks. Available at: 
       https://www.geeksforgeeks.org/arrays-aslist-method-in-java-with-examples/ 
       [Accessed 20 Sep. 2023].
    */
    // Student class object 
    Student stud = new Student(0,"",0,"","");
    
    public StudentTest() 
     {
        
     }
    
    @BeforeClass
    public static void setUpClass() 
     {
        System.out.println("Testing has started");
     }
    
    @AfterClass
    public static void tearDownClass() 
     { 
        System.out.println("\nTesting has ended");
     }
    
    @Before
    public void setUp() 
     {
        stud = new Student(0,"",0,"","");
        
        // Populate the student object with test data
        stud.setStudentID(new ArrayList<>(Arrays.asList(10111, 10112, 10113)));
        stud.setStudentName(new ArrayList<>(Arrays.asList("J.Bloggs", "J.Doe", "P.Parker")));
        stud.setStudentAge(new ArrayList<>(Arrays.asList(19, 21, 20)));
        stud.setStudentEmail(new ArrayList<>(Arrays.asList("jbloggs@ymail.com", "jdoe@ymail.com", "spidey@ymail.com")));
        stud.setStudentCourse(new ArrayList<>(Arrays.asList("disd", "disd", "disn")));
     }

    @After
    public void tearDown() 
     {
       // Clean up and reset standard input
        System.setIn(System.in);
     }

    /**
     * Test of checkStudAge method, of class Student.
     * To supply the student ID, name, age, email, course to the save student  method.
     * The test will determine whether the correct student will be saved to memory
    */
    @Test
    public void testStudentAgeValid() 
     {
        System.out.println("\nTest checkStudAge Valid");
        
        // Set the student age to an age that is valid (greater than or equal to 16)
        int studentAge = 18; 
        
        System.out.println("Student Age is: " + studentAge);
        boolean result = stud.checkStudAge(studentAge);
        
        // Using assertTrue to ensure that the condition is true 
        assertTrue(result);   
        
     } // End of test method
    
    /**
     * Test of checkStudAge method, of class Student.
     * To supply an invalid student age to the student age method. 
     * The test will determine that the student’s age is less than 16.
     */
    @Test
    public void testStudentAgeInvalid() 
     {
        System.out.println("\nTest checkStudAge Invalid");
        
        // Sets the student age to an age that is invalid (less than 16)
        int studentAge = 12;
        
        System.out.println("Student Age is: " + studentAge);
        System.out.println("You have entered an Invalid student age!!!"
                            + "\nPlease re-enter the student age >>> ");
        
        boolean result = stud.checkStudAge(studentAge);
        
        // Using assertFalse to verify if the condition is false
        assertFalse(result); 
        
     }// End of test method
    
    /**
     * Test of checkStudAge method, of class Student.
     * To supply an invalid character to the student age method. 
     * The test will determine that the student age supplied is not a number.
     */
    @Test
    public void testStudentAgeInvalidCharacter() 
     {
        System.out.println("\nTest checkStudAge Invalid Character");
        
        // Sets the student age to a letter c to test what would happen if a 
        // character was typed instead of a letter
        char studentAge = 'c';
        
        boolean expected = true;
        System.out.println("Student Age is: " + studentAge);
        System.out.println("You have entered an Invalid student age!!!"
                            + "\nPlease re-enter the student age >>> ");
        boolean result = stud.checkStudAge(studentAge);
        
        //Using assertEquals to check for equality.
        assertEquals(expected, result);
        
     } // End of test method
    
    /**
     * Test of saveStudent method, of class Student.
     * To supply the student ID, name, age, email,course to the save student method.
     * The test will determine whether the correct student will be saved to memory
     */
    @Test
    public void testSaveStudent() 
     {
        System.out.println("\nTest Save Student");
        
        // Created and populated the ArrayLists with test data
        List<Integer> studID = Arrays.asList(10111, 10112, 10113);
        List<String> studName = Arrays.asList("J.Bloggs", "J.Doe", "P.Parker");
        List<Integer> studAge = Arrays.asList(19, 21, 20);
        List<String> studEmail = Arrays.asList("jbloggs@ymail.com", "jdoe@ymail.com", "spidey@ymail.com");
        List<String> studCourse = Arrays.asList("disd", "disd", "disn");

        // Sets the ArrayLists in the Student class
        stud.setStudentID(new ArrayList<>(studID));
        stud.setStudentName(new ArrayList<>(studName));
        stud.setStudentAge(new ArrayList<>(studAge));
        stud.setStudentEmail(new ArrayList<>(studEmail));
        stud.setStudentCourse(new ArrayList<>(studCourse));

        // Call the saveStudent() method
        ArrayList<Object> saveStud = stud.saveStudent();

        // Using assertEquals to verify that the returned studentData contains 
        // the expected ArrayLists
        assertEquals(studID, saveStud.get(0));
        assertEquals(studName, saveStud.get(1));
        assertEquals(studAge, saveStud.get(2));
        assertEquals(studEmail, saveStud.get(3));
        assertEquals(studCourse, saveStud.get(4));
        
        System.out.println("Student Successfully saved");
        
     } // End of test method

    /**
     * Test of searchStudent method, of class Student.
     * To supply the student id to the search student method. 
     * The test will determine that the correct student details have been returned.
     */
    @Test
    public void testSearchStudent() 
     {
        System.out.println("\nTest Search Student");
        
        // Populate the student object with test data
        stud.setStudentID(new ArrayList<>(Arrays.asList(10111, 10112, 10113)));
        stud.setStudentName(new ArrayList<>(Arrays.asList("J.Bloggs", "J.Doe", "P.Parker")));
        stud.setStudentAge(new ArrayList<>(Arrays.asList(19, 21, 20)));
        stud.setStudentEmail(new ArrayList<>(Arrays.asList("jbloggs@ymail.com", "jdoe@ymail.com", "spidey@ymail.com")));
        stud.setStudentCourse(new ArrayList<>(Arrays.asList("disd", "disd", "disn")));

        // The student ID that will be searched for
        int searchQuery = 10113; 
        
        // Call the searchStudent method with a test search query
        Student student = stud.searchforStudent(searchQuery);

        // Verify that the result contains the expected student details
        // assertNotNull to verify that an object is not null
        // assertEquals to Check for equality 
        
        assertNotNull(student);
        assertEquals(Integer.valueOf(10113), student.getStudentID().get(0));
        assertEquals("P.Parker", student.getStudentName().get(0));
        assertEquals(Integer.valueOf(20), student.getStudentAge().get(0));
        assertEquals("spidey@ymail.com", student.getStudentEmail().get(0));
        assertEquals("disn", student.getStudentCourse().get(0));
        
        System.out.println("Student has been found");
        
     }// End of test method
    
    /**
     * Test of searchStudent method, of class Student.
     * To supply an incorrect student ID to the search student method. 
     * The test will determine that no student was found
     */
    @Test
    public void testSearchStudent_StudentNotFound() 
     {
        System.out.println("\nTest SearchStudent_StudentNotFound");
        
        // Populate the student object with test data
        stud.setStudentID(new ArrayList<>(Arrays.asList(10111, 10112, 10113)));
        stud.setStudentName(new ArrayList<>(Arrays.asList("J.Bloggs", "J.Doe", "P.Parker")));
        stud.setStudentAge(new ArrayList<>(Arrays.asList(19, 21, 20)));
        stud.setStudentEmail(new ArrayList<>(Arrays.asList("jbloggs@ymail.com", "jdoe@ymail.com", "spidey@ymail.com")));
        stud.setStudentCourse(new ArrayList<>(Arrays.asList("disd", "disd", "disn")));

        // A student ID that is not in the test data was chosen
        int searchQuery = 10114; 
        System.out.println("The student ID is: " + searchQuery);
        
        // Call the searchStudent method with a test search query that doesn't exist
        Student student = stud.searchforStudent(searchQuery);

        // Using assertNull to verify that the result is null, indicating that 
        // the student was not found
        assertNull(student);
        System.out.println("No Student was found");
        
     } // End of test method

    /**
     * Test of deleteStudent method, of class Student.
     * To supply the student ID to the delete student method. 
     * The test will determine that the student has been successfully deleted. 
     */
    @Test
    public void testDeleteStudent() 
     {
        System.out.println("\nTest Delete Student");
        
        // Create test data
        ArrayList<Integer> studID = new ArrayList<>(Arrays.asList(10111, 10112, 10113));
        ArrayList<String> studName = new ArrayList<>(Arrays.asList("J.Bloggs", "J.Doe", "P.Parker"));
        ArrayList<Integer> studAge = new ArrayList<>(Arrays.asList(19, 21, 20));
        ArrayList<String> studEmail = new ArrayList<>(Arrays.asList("jbloggs@ymail.com", "jdoe@ymail.com", "spidey@ymail.com"));
        ArrayList<String> studCourse = new ArrayList<>(Arrays.asList("disd", "dise", "disn"));

        // Index to delete 
        int indexToDelete = 1;

        // Call the removeStudent method
        Student student = new Student(0,"",0,"",""); // An instance was created of my Student class
        boolean deletionSuccessful = student.removeStudent(studName, studID, studEmail, studAge, studCourse, indexToDelete);

        // Using assertTrue and assertFalse to check if the student data has been removed
        // assertTrue to check that the condition is true
        // assertFalse to verify that a condition is false
        assertTrue(deletionSuccessful);
        assertFalse(studID.contains(10112)); // Check if the student with ID 10112 has been removed
        assertFalse(studName.contains("J.Doe")); // Check if J.Doe's name has been removed
        assertFalse(studAge.contains(21)); // Check if J.Doe's age has been removed
        assertFalse(studEmail.contains("jdoe@ymail.com")); // Check if J.Doe email has been removed
        assertFalse(studCourse.contains("dise")); // Check if J.Doe's course has been removed
        
        System.out.println("Student successfully deleted");
        
      } // End of test method
     
    /**
     * Test of deleteStudent method, of class Student.
     * To supply an incorrect student ID to the delete student method. 
     * The test will determine that no student could be found to delete.
     */
    @Test
    public void testDeleteStudent_StudentNotFound() 
     {
        System.out.println("\nTest deleteStudent");
        
        // Create test data
        ArrayList<Integer> studID = new ArrayList<>(Arrays.asList(10111, 10112, 10113));
        ArrayList<String> studName = new ArrayList<>(Arrays.asList("J.Bloggs", "J.Doe", "P.Parker"));
        ArrayList<Integer> studAge = new ArrayList<>(Arrays.asList(19, 21, 20));
        ArrayList<String> studEmail = new ArrayList<>(Arrays.asList("jbloggs@ymail.com", "jdoe@ymail.com", "spidey@ymail.com"));
        ArrayList<String> studCourse = new ArrayList<>(Arrays.asList("disd", "dise", "disn"));

        // Index to delete 
        int indexToDelete = -1; // Set it to an invalid index

        // Call the deleteStudent method
        Student student = new Student(0,"",0,"",""); // An instance of my Student class
        boolean deletionSuccessful = student.removeStudent(studName, studID, studEmail, studAge, studCourse, indexToDelete);

        // Using assertFalse to check that the deletion was not successful 
        // because the student was not found
        assertFalse(deletionSuccessful);
        System.out.println("Student not found");
        
     } // end of Test method
    
 } // End of test class  