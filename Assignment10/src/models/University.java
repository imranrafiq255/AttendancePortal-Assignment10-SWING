
package models;

import java.util.ArrayList;

public class University {

    private ArrayList<Teacher> teachers;
    private ArrayList<CourseEnrollment>courseEnrollments;
    private ArrayList<CourseEnrollment>courseEnrollments;
    private ArrayList<StudentEnrollment> studentEnrollments;
    private ArrayList<Attendance>attendances;
    private ArrayList<Course> courses;
    private ArrayList<Student> students;
    private ArrayList<Section> sections;
    private ArrayList<TeacherAssignment> teacherAssignments;
    public University()
    {
        students = new ArrayList();
        courses = new ArrayList();
        teachers = new ArrayList();
        courseEnrollments = new ArrayList();
        attendances = new ArrayList();
        sections = new ArrayList();
        studentEnrollments = new ArrayList();
        teacherAssignments = new ArrayList();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public boolean removeStudent(String studentName)
    {
        return students.removeIf(r->r.getStudentName().equals(studentName));
    }
    public Student searchStudent(Student student)
    {
        students.forEach(s->{
        if (s.getStudentName() == student.getStudentName()) return student;
        })
        return null;
    }
    public ArrayList<Student> displayStudents()
    {
       return students;
    }
    public void addCourse(Course course)
    {
        courses.add(course);
    }
    public Course removeCourse(Course course)
    {
        return courses.removeIf((c) -> {
        c.getCourseCode() == course.getCourseCode()
        }) 
    }
    public boolean searchCourse(Course course)
    {
        courses.forEach(c->{
        if(c.getCourseCode() == course.getCourseCode()) return course;
        });
        return null;
    }
    public ArrayList<Course> displayCourses()
    {
        return courses;
    }
    public void addTeacher(Teacher teacher)
    {
        teachers.add(teacher);
    }
    public boolean removeTeacher(Teacher teacher)
    {   
        return teachers.removeIf(t->{t.getEmpCode() == teacher.getEmpCode()});
    }
    public Teacher searchTeacher(Teacher teacher)
    {
        teachers.forEach(t->{
        if (t.getEmpCode() == teacher.getEmpCode()) return teacher;
        })
        return null;
    }
    public void displayTeacher()
    {
        return teachers;
    }
    public void addCourseEnrollment(CourseEnrollment courseEnrollment)
    {
        courseEnrollments.add(courseEnrollment);
    }
    public boolean removeCourseEnrollment(CourseEnrollment courseEnrollment)
    {
       return courseEnrollments.removeIf(c->{c.getCourse().getCourseCode() == courseEnrollment.getCourse().getCourseCode()});
    }
    public CourseEnrollment searchCourseEnrollment(CourseEnrollment courseEnrollment)
    {
        courseEnrollments.forEach(c->{
        if (c.getCourse().getCourseCode() === courseEnrollment.getCourse().getCourseCode())
        {
            return courseEnrollment;
        }
        });
        return null;
    }
    public ArrayList<CourseEnrollment> displayCourseEnrollment()
    {
        return courseEnrollments;
    }
    
    public void takeAttendance(Attendance attendance)
    {
        attendances.add(e);
    }
    public void addSection(Section section)
    {
        sections.add(section);
    }
    public boolean removeSection(Section section)
    {
        return sections.removeIf(s->s.getSectionName() == section.getSectionName());
    }
    public Section searchSection(Section section)
    {
        sections.forEach(s->{
        if (s.getSectionName() == section.getSectionName())
        {
            return section;
        }
        })
        return null;
    }
    public ArrayList<Section> displaySection()
    {
        return sections;
    }
    public void addStudentEnrollment(StudentEnrollment studentEnrollment)
    {
        studentEnrollments.add(studentEnrollment);
    }
    public boolean removeStudentEnrollment(StudentEnrollment studentEnrollment)
    {
        return studentEnrollments.removeIf(s->s.getStudent().getStudentId() == studentEnrollment.getStudent().getStudentId());
    }
    public StudentEnrollment searchEnrolledStudent(StudentEnrollment studentEnrollment)
    {
        studentEnrollments.forEach(s->{
        if (s.getStudent().getStudentId() == studentEnrollment.getStudent().getStudentId())
        {
            return studentEnrollment;
        }
        });
        return null;
    }
    public ArrayList<StudentEnrollment> displayEnrolledStudent()
    {
        return studentEnrollments;
    }
    public void assignTeacher(Teacher teacher)
    {
        teacherAssignments.add(teacher);
    }
}
