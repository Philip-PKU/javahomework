public class Course implements Cloneable{
    private String courseName; //课程名称
    private String[] students = new String[100];
    private int numberOfStudents=0;

    public Course(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return numberOfStudents;
    }

    public String getCourseName(){
        return courseName;
    }

    public void dropStudent(String student){

    }

    //@Override
    protected Object clone() throws CloneNotSupportedException{
        Course courseclone = (Course)super.clone();
        courseclone.students =(String[])(students.clone());
        return courseclone;
    }

    public static void main(String[] args) {
        Course course1 = new Course("chemistry");
        course1.addStudent("Peter");
        course1.addStudent("James");
        course1.addStudent("Wallece");
        course1.addStudent("Han");
        course1.addStudent("Sam");
       // System.out.println(students[0]+", ");
        Course course2 = null;
        try {
            course2 = (Course)course1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        String[] ss = course2.getStudents();
        for(int i=0;i<5;i++) {
            System.out.print(ss[i] + ", ");
            //System.out.println(course2.getCourseName());
        }
    }
}
