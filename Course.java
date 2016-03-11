package CourseReg;

/**
 * Created by Nathan on 2/22/2016.
 */
public class Course {

    //Declarations
    private int courseID;
    private int studentTotal;
    private String courseName;
    LinkedList StudentList = new LinkedList();
    LinkedList WaitingList = new LinkedList();
    //Constructor base

    public Course() {

        //initialize all variable
        setCourseID(0);
        studentTotal = 0;
        courseName = "";

    }//end Student Constructor base

    //Constructor full
    public Course(int courseID,String courseName) {

        //initialize all variable
        setCourseID(courseID);
        studentTotal = 0;
        setCourseName(courseName);

    }//end Student Constructor full

    public int getCourseID(){
        return courseID;
    }//end getStudentID
    public void setCourseID(int courseID){
        this.courseID = courseID;
    }//end setCourseID

    public String getCourseName(){
        return courseName;
    }//end getCourseName
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }//end setCourseName

    public void AddStudent(String name, int ID){
        if(studentTotal<=25) {
            StudentList.insertFirstLink(name, ID);
        }//end if

        else{
            WaitingList.insertFirstLink(name,ID);
        }//end else

        studentTotal++;

    }// end AddCourse

    //Remove a student and check the waiting list
    public void RemoveStudent(String name, int ID){

        if(studentTotal<=25) {
            StudentList.RemoveLink(name);

        }//end if

        else{
            StudentList.RemoveLink(name);
            StudentList.insertFirstLink(WaitingList.TopName(),WaitingList.TopID());
        }//end else

        studentTotal--;

    }// end AddCourse

    public void conDisplay(){
        StudentList.conDisplay();
    }//end conDisplay



}//end class Course
