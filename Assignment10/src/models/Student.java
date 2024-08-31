
package models;

public class Student extends Man{


    public Student(String studentName, String studentAddress, String studentEmail, String studentPhoneNumber, int studentId) {
        super(studentName, studentAddress, studentEmail, studentPhoneNumber, studentId);
    }

    public String getStudentName() {
        return name;
    }

    public String getStudentAddress() {
        return address;
    }


    public String getStudentEmail() {
        return email;
    }


    public String getStudentPhoneNumber() {
        return phoneNumber;
    }


    public int getStudentId() {
        return id;
    }

    
}
