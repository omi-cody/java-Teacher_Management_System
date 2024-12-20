
/**
 * Write a description of class Lecturer here.
 *
 * @author (OM SHANKAR SAH)
 * @version (2023-01-06)
 */
public class Lecturer extends Teacher// Define lecturer class as sublclass of Teacher class.
{
    private String department;// Declare instance varibale or attribute.
    private int yearOfExp, gradedScore;
    private boolean hasGraded;

    // Define a contructor for Leceturer subclass.
    public Lecturer(int teacherId, String teacherName, String address, String workingType, String empStatus,
            String department, int yearOfExp, int workingHour) {
        super(teacherId, teacherName, address, workingType, empStatus);// Call the parent class constructor (teacher)
                                                                       // with five parameters.
        // Asignining the parameter values for department and year of experience.
        this.department = department;
        this.yearOfExp = yearOfExp;
        this.gradedScore = 0;// Assign graded score to 0.
        this.hasGraded = false;// Assign hasgraded to false.
        this.setWorkingHour(workingHour);// Calling setter method of parent class

    }

    public String getDepartment()// Define accessor method for department
    {
        return this.department;
    }

    public int getYearOfExp()// Define accessor method for year of experience.
    {
        return this.yearOfExp;
    }

    public int getGradedScore()// Define accessor method for graded score.
    {
        return this.gradedScore;
    }

    public boolean getHasGraded()// Define accessor method for hasgraded.
    {
        return this.hasGraded;
    }

    public void setGradedScore(int gradedScore)// Define getter or mutator method for graded Score.
    {
        this.gradedScore = gradedScore;
        this.hasGraded = true;// Set the hasgraded to true.
    }

    // Define method for grade assignment.
    String fgrade;
    public String gradeAssignment(int gradedScore,String department,int yearOfExp)
    {
        //Check if the lecturer has enough experience and same department
        if(yearOfExp>=5 && this.getDepartment().equals(department))
  
        {
            if(gradedScore>=0 && gradedScore<=100)
            {
            this.hasGraded=true;//Set the hasGraded to true
            this.gradedScore=gradedScore;
            this.yearOfExp=yearOfExp;
            //Grade the assignments according to criteria given

            if(gradedScore>=70 && gradedScore<=100)
            {
                fgrade="A";
                
                return "The Grade :"+fgrade;
            }
            else if(gradedScore>=60 && gradedScore<=69)
            {
                fgrade="B";
                return "The Grade :"+fgrade;
            }
            else if(gradedScore>=50 && gradedScore<=59)
            {
                fgrade="C";
                return "The Grade :"+fgrade;
            }
            else if(gradedScore>=40 && gradedScore<=49)
            {
                fgrade="D";
                return "The Grade :"+fgrade;
            }
            else
            {
                fgrade="E";
                return "The Grade :"+fgrade;
            } 
            
          }
          else{
                return "Invalid GradeScore";
            }
            
            
        }
        
        else
        {
            this.hasGraded=false;
            //Print the suitable message if conditioon doesn't match
            String message="The Lecturer Isn't Qualified To Grade  Assignments";
            return message;
        }
            
    }

    public void Display()// Define display method with the help of method overriding
    {
        System.out.println("\n-------------------------Lecturer---------------------------");
        super.Display();// Invoke display from parent class
        // Print the department and year of experience
        System.out.println("Departments : " + this.getDepartment());
        System.out.println("Year Of Experience: " + this.getYearOfExp());
        // Check if the score is graded or not
        if (hasGraded) {
            System.out.println("The Graded Score : " + this.getGradedScore());
            System.out.println("The Grade :"+fgrade);
            System.out.println("**********************************************************");

        } else {
            // If not,print the suitable message
            System.out.println("Score has not been Graded Yet");
            System.out.println("**********************************************************");
        }

    }
}
