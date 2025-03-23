package CourseWprk;


                //COURSEWORK......................

public class Tutor extends Teacher  // CREATING SUB-CLASS OF TUTOR
{
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    public Tutor(int teacherId, String teacherName, String address, String workingType, String employmentStatus, 
    int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex) //creating constrtor and writting parent's class variables to acces due to encluption

    {
        super(teacherId, teacherName, address, workingType, employmentStatus);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }

    public double getSalary() // creating accessor methode for each attribute
    {
        return salary;
    }

    public String getSpecialization() 
    {
        return specialization;
    }

    public String getAcademicQualifications() 
    {
        return academicQualifications;
    }

    public int getPerformanceIndex() 
    {
        return performanceIndex;
    }

    public boolean isCertified() 
    {
        return isCertified;
    }

    public void setSalary(double newSalary, int newPerformanceIndex) // ceating methode for srtting the tutor salary
    {
        if ( newPerformanceIndex  > 5 && getWorkingHours()> 20)
        
        {
            double appraisal = 0.0;
            if (newPerformanceIndex >= 5 && newPerformanceIndex <= 7) 
            {
                appraisal = 0.05;
            } else if (newPerformanceIndex >= 8 && newPerformanceIndex <= 9) 
            {
                appraisal = 0.10;
            } else if (newPerformanceIndex == 10) 
            {
                appraisal = 0.20;
            }
            double salaryIncrease = appraisal * salary;
            salary += salaryIncrease;
            isCertified = true;
            System.out.println("Congratulations! Your salary has been approved. Your new salary is: " + salary);
        } else {
            System.out.println("Sorry, your salary cannot be approved at the moment.");
        }
    }

    public void removeTutor() // methode to set the salary and cerlify the tutor
    {
        if (!isCertified) {
            // Code to remove the tutor
            System.out.println("The tutor has been removed successfully.");
        } else {
            System.out.println("The tutor has been removed successfully.");
        }
        
    }
}
