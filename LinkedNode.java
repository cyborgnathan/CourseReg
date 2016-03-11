package CourseReg;

/**
 * Created by Nathan on 2/21/2016.
 */
public class LinkedNode {
    //Declarations
    private int ID;// course number must be positive
    private String name;
    public LinkedNode next; // ask about this in class

    //Constructor
    public LinkedNode(int ID, String name){
        //initialize all variables
        setID(ID);
        setName(name);

    }//end LinkedNode

    //Getters/Setters

    public String getName(){
        return name;
    }//end getCourseName

    public void setName(String name){
        this.name = name;
    }//end setCourseName


    public int getID(){
        return ID;
    }//end getCourseNum

    public void setID(int ID){
        this.ID = ID;
    }//end setCourseNum

    public void conDisplay(){
        System.out.println(name +":"+ ID);

    }//end conDisplay

   @Override
    public String toString(){

        String S = name+":"+ID;
        return S;

    }//end makeStrring


}//end class LinkedNode

