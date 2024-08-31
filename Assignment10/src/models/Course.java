
package models;

public class Course {
   private int courseCode;
   private String courseName;

    public Course() {
        this(0, "");
    }
   
    public Course(int courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
   
}
