package CourseReg;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Test T1 = new Test();
        boolean testbool1= true;

        T1.SetupMenu();

        do {
            if (testbool1 ==false) {
                testbool1 = T1.TestMenu();
                System.out.println("the test proved: " + testbool1);
                testbool1 = T1.RunMenu();
            }//end if

            else {
                testbool1 = T1.RunMenu();
            }//end else

        }while (testbool1 == true);

    }//end main

}//end class Main

/***********************************************************************************************************************
 int ID1 = 0;
 int ID2 = 0;
 String name1 ="";
 String name2 ="";
 String SE150NAME ="SE basic JAVA";
 String SE160NAME ="SE intermediate JAVA";
 String SE210NAME ="SE basic C++";
 String SE220NAME ="SE intermediate C++";
 int tempX = 1;
 Scanner Input= new Scanner(System.in);
 boolean tempBool =  false;

 Student S1 = new Student(15,"nathan");
 Course C1 = new Course(330, "SE Database");
 C1.AddStudent(S1.getStudentName(),S1.getStudentID());
 S1.AddCourse(C1.getCourseName(),C1.getCourseID());
 LinkedList CourseList = new LinkedList();


 //fill the CourseList for testing
 CourseList.insertFirstLink(SE150NAME, 150);
 CourseList.insertFirstLink(SE160NAME, 160);
 CourseList.insertFirstLink(SE210NAME, 210);
 CourseList.insertFirstLink(SE220NAME, 220);

 Course SE150 = new Course(150, SE150NAME);
 Course SE160 = new Course(160, SE160NAME);
 Course SE210 = new Course(210, SE210NAME );
 Course SE220 = new Course(220, SE220NAME);
 //in this loop go through the menue and allow the user to enter their name student number
 //Second let the user look at a list of courses
 // and third add let the student add up to 4 courses

 System.out.println("Pleas enter Your name:");
 name1 = Input.nextLine();
 System.out.println("Pleas enter your student number:");
 ID1 = Input.nextInt();
 System.out.println( name1 + " " + ID1);
 Student S2 = new Student(ID1,name1);

 do{
 System.out.printf("Pleas pay attian as our menu has changed%n" +
 "1: course list%n" +
 "2: add course%n" +
 "3: delete course%n" +
 "4: check course roster%n" +
 "0: To exit the program%n" +
 ":");
 tempX = Input.nextInt();
 switch(tempX)
 {

 case 1:
 CourseList.conDisplay();
 break;
 case 2:
 System.out.printf("Witch course would you register for%n" +
 "1.SE150: %s%n" +
 "2.SE160: %s%n" +
 "3.SE210: %s%n" +
 "4.SE220: %s%n", SE150NAME,SE160NAME,SE210NAME,SE220NAME);
 ID2 = Input.nextInt();
 //use a switch in order to use Add a student to each course
 switch (ID2){
 case 1:
 SE150.AddStudent(name1,ID1);
 break;
 case 2:
 SE160.AddStudent(name1,ID1);
 break;
 case 3:
 SE210.AddStudent(name1,ID1);
 break;
 case 4:
 SE220.AddStudent(name1,ID1);
 break;
 }//end inner switch
 break;
 case 3:
 System.out.println("Pleas enter course name:");
 name2 = Input.nextLine();
 System.out.println("Pleas enter course number:");
 ID2 = Input.nextInt();
 break;
 case 4:
 SE150.conDisplay();
 SE160.conDisplay();
 SE210.conDisplay();
 SE220.conDisplay();
 break;
 //use this for testing the program
 case 5:

 break;
 }//end switch



 } while(tempX != 0 );
 ***********************************************************************************************************************/