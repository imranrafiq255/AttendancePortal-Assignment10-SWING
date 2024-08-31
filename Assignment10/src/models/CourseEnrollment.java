
package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class CourseEnrollment {
    private LocalDate date;
    private LocalTime time;
    private Course course;
    private Section section;
    private Teacher teacher;
    public CourseEnrollment(LocalDate date, LocalTime time, Course course, Section section, Teacher teacher) {
        this.date = date;
        this.time = time;
        this.course = course;
        this.section = section;
        this.teacher = teacher;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    
}
