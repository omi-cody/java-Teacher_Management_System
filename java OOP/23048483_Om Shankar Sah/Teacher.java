
/**
 * Write a description of class Teacher here.
 *
 * @author (OM SHANKAR SAH)
 * @version (2023-01-06)
 */
public class Teacher//Defined a class Teacher.
{
    private int teacherId,workingHour;//Declare instance Variables or attributes.
    private String teacherName,address,workingType,empStatus;
    public Teacher(int teacherId,String teacherName,String address,
    String workingType,String empStatus)//define a contructor method
    {
        this.teacherId=teacherId;//Initilizing the instance variable.
        this.teacherName=teacherName;
        this.address=address;
        this.workingType=workingType;
        this.empStatus=empStatus;
        this.workingHour=0;//Assigned the parameter of working hour as 0 as it is not assigned yet.
    }
   
    public int getTeacherId()//Define accessor method for teacher ID.
    {
        return this.teacherId;
    }
    
    public int getWorkingHour()//Define accessor method for working Hour.
    {
        return this.workingHour;
    }
    public String getTeacherName()//Define accessor method for teacher name.
    {
        return this.teacherName;
    }
    public String getAddress()//Define accessor method for address.
    {
        return this.address;
    }
    public String getWorkingType()//Define accessor method for working type.
    {
        return this.workingType;
    }
    public String getEmpStatus()//Define accessor method for employment status.
    {
        return this.empStatus;
    }
    public void setWorkingHour(int workingHour)//Define setter or mutator method for working hour
    {
        this.workingHour=workingHour;//assigning the parameter value to working hour.
    }
    public void Display()//Define the display method
    {//Print the teacherid,teacher name,address ,working type and employment status.
        System.out.println("Teacher ID : "+this.getTeacherId());
        System.out.println("Teacher Name : "+this.getTeacherName());
        System.out.println("Address : "+this.getAddress());
        System.out.println("Working Type : "+this.getWorkingType());
        System.out.println("Employment Status: "+this.getEmpStatus());
        if(workingHour==0)//Check if the working hour is assigned or not.
        {
            System.out.println("Teacher working Hour isn't assigned yet");//if not then suitable message is printed.
        }
        else if(workingHour>0)
        {
            System.out.println("Working Hour is: "+this.getWorkingHour());//if yes,working hour is printed.
        }
    }
}


