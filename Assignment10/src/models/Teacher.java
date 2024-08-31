package models;

public class Teacher extends Man{
    private String teacherDepartment;
    private double salary;
    private int empCode;
    public Teacher(String teacherName, String teacherDepartment, String teacherEmail, String teacherAddress, String teacherPhoneNumber, double salary, int empCode) {
        super(teacherName, teacherAddress, teacherEmail, teacherPhoneNumber, empCode);
        this.salary = salary;
        this.teacherDepartment = teacherDepartment;
    }

    public String getTeacherName() {
        return name;
    }

    public String getTeacherDepartment() {
        return teacherDepartment;
    }

    public String getTeacherEmail() {
        return email;
    }

    public String getTeacherAddress() {
        return address;
    }

    public String getTeacherPhoneNumber() {
        return phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public int getEmpCode() {
        return empCode;
    }
    
}
