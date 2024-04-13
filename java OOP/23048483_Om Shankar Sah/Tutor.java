
/**
 * Write a description of class Tutor here.
 *
 * @author (OM SHANKAR SAH)
 * @version (2024-01-06)
 */
public class Tutor extends Teacher//Define tutor subclass of Parent class Teacher
{
    //Declare attributes
    private double salary;
    private String speci,acaQual;
    private int performIndex;
    private boolean isCertified;
    
    //Define constructor of tutor class
    public Tutor(int teacherId,String teacherName,String address,String workingType,
    String empStatus,int workingHour,double salary,String speci,String acaQual,int performIndex)
    {
        //Call the teacher class constructor and setter method
        super(teacherId,teacherName,address,workingType,empStatus);
        this.setWorkingHour(workingHour);
        //Assign the salary ,specilization ,academic qualification,performance index with parameter values
        this.salary=salary;
        this.speci=speci;
        this.acaQual=acaQual;
        this.performIndex=performIndex;
        this.isCertified=false;//Set iscertified to false
    }
    //Define accessor methods for each attributes
    public double getSalary()
    {
        return this.salary;
    }
    public String getSpeci()
    {
        return this.speci;
    }
    public String getAcaQual()
    {
        return this.acaQual;
    }
    public int getPerformIndex()
    {
        return this.performIndex;
    }
    public boolean getIsCertified()
    {
        return this.isCertified;
    }
    //Define setter method for new salary
    public void setSalary(double newSalary,int newPerformIndex)
    {
        //Check if the perfomance index is greater than 5 and working hour is greater than 20 hour or not.
        if(newPerformIndex>=5 && getWorkingHour()>20)
        {
            //Calculate the appraisal percentage according to perfomance index
            double appraisalPer;
            if(newPerformIndex>=5 && newPerformIndex<=7)
            {
                appraisalPer=0.05;            
            }
            else if(newPerformIndex>=8 && newPerformIndex<=9)
            {
                appraisalPer=0.1;
            }
            else
            {
                appraisalPer=0.2;
            }
            //Calculate the new salary
            this.salary=newSalary+(appraisalPer*newSalary);
            this.performIndex=newPerformIndex;
            this.isCertified=true;//Set the iscertified to true
        }
        else
        {
            //If not cerified then print suitable message and set is cerified to false
            System.out.println("The Tutor isn't Certified yet so that Salary cannot be appraised");
            this.isCertified=false;
        }
        
    }
    public void removeTutor()//Define removetutor method
    {
        if(!isCertified)//Check if the tutor is certified yet or not
        {
            /*If not certified then set salary,perfomance to zero and specification,
            academic qualification to null and is certified to false*/
            this.salary=0;
            this.speci="";
            this.acaQual="";
            this.performIndex=0;
            this.isCertified=false;
        }
        else
        {
            //Print suitable message
            System.out.println("The Tutor is Certified and Salary is Appraised");
        }
    }
    //Define display method
    public void Display()//method overridding
    
    {
        System.out.println("\n-------------------------Tutor---------------------------");
        //Check if the tutor is certified then print all the detail from parent class and subclass
        if(isCertified)
        {
            super.Display();//Call the display method from teacher class
            //Print salary,specification,academic qualification,performance index
            System.out.println("Salary of Tutor : "+this.getSalary());
            System.out.println("Specilization : "+this.getSpeci());
            System.out.println("Academic Qualification : "+this.getAcaQual());
            System.out.println("Performance Index :"+this.getPerformIndex());
            System.out.println("**********************************************************");
            
        }
        //If not certified then call the display method of parent class only
        else
        {
            super.Display();
            System.out.println("**********************************************************");
        }
    }

}

