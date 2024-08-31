
package models;

import java.time.LocalDate;

public class Attendance {
    private boolean mark;
    private LocalDate date;
    private Course course;
    public Attendance(boolean mark, LocalDate date, Course course)
    {
        this.mark = mark;
        this.date = date;
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public boolean isMark() {
        return mark;
    }

    public void setMark(boolean mark) {
        this.mark = mark;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
}
