package CourseWprk;

                           //COURSEWORK ------
                           
// creation of Sub-class: Lecturer of parents cass Teacher.
public class Lecturer extends Teacher 
{
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    public Lecturer(int teacherId, String teacherName, String address, String workingType,
    String employmentStatus, String department, int yearsOfExperience,int workingHours) 
    //While passing preameters  the variables of teachers are written as the variables of teacher are peivate
    {
        super(teacherId, teacherName, address, workingType, employmentStatus); // super helps to declare veriable from parent class all at once
        super.setWorkingHours(workingHours);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        
        this.gradedScore = 0;
        this.hasGraded = false;
    }

    public String getDepartment() // Creating accesor methods for each attributes 
    {
        return department;
    }

    public int getYearsOfExperience() 
    {
        return yearsOfExperience;
    }
    

    public int getGradedScore()
    {
        return gradedScore;
    }

    public boolean hasGraded() 
    {
        return hasGraded;
    }

    public void setGradedScore(int gradedScore) 
    {
        this.gradedScore = gradedScore;
    }

    public void gradeAssignment(int gradedScore, String department, int yearsOfExperience) // mutator methods for creating gradeAssingment
    {
        if (yearsOfExperience >= 5 && this.department.equals(department)) 
        {
            if (gradedScore >= 70) 
            {
                System.out.println("Assignments graded: A (70 and above)");
            } else if (gradedScore >= 60) 
            {
                System.out.println("Assignments graded: B (60 and above)");
            } else if (gradedScore >= 50) 
            {
                System.out.println("Assignments graded: C (50 and above)");
            } else if (gradedScore >= 40) 
            {
                System.out.println("Assignments graded: D (40 and above)");
            } else 
            {
                System.out.println("Assignments graded: E (Less than 40)");
            }
            hasGraded = true;
        } else {
            System.out.println("Sorry, assignments cannot be graded at the moment.");
        }
    }

    public void display()//Display method
    {
        System.out.println("Lecturer Details:");
        System.out.println("Teacher ID: " + getTeacherId());
        System.out.println("Teacher Name: " +getTeacherName());
        System.out.println("Address: " +getAddress());
        System.out.println("Working Type: " +getWorkingType());
       
        System.out.println("Employment Status");
    }
}
