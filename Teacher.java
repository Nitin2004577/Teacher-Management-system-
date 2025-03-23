package CourseWprk;

                                                   //COURSE WORK********
                                                   
public class Teacher  // creation of preants class teacher
 {
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;

    public Teacher(int teacherId, String teacherName, String address, String workingType,
    String employmentStatus)  // constoter is created to pass value to the static variables.
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }

    public int getTeacherId() // creating accessor method for each attrubutes.
    {
        return teacherId;
    }

    public String getTeacherName() 
    {
        return teacherName;
    }

    public String getAddress() 
    {
        return address;
    }

    public String getWorkingType() 
    {
        return workingType;
    }

    public String getEmploymentStatus() 
    {
        return employmentStatus;
    }
    public int getWorkingHours()
    {
        return workingHours;
    }

    public void setWorkingHours(int workingHours)  // methode of setting workingHours.
    {
        this.workingHours = workingHours;
    }

    public void display()  // methode to display the details.
    {
        System.out.println("Teacher ID: " + this.teacherId);
        System.out.println("Teacher Name: " + this.teacherName);
        System.out.println("Address: " + this.address);
        System.out.println("Working Type: " + this. workingType);
        System.out.println("Employment Status: " + this. employmentStatus);
        if (workingHours == 0) {
               System.out.println("Working Hours: Not assigned");
        } else {
             System.out.println("Working Hours: " + workingHours);
        }
    }
}
