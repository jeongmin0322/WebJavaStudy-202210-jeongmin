package j11_배열.StudentManagement;


import java.util.Scanner;

public class StudentManagementApplication {

    public static void main(String[] args) {

        StudentService studentService = new StudentService(new Scanner(System.in), new StudentRepository());


        studentService.registerStudent();
        studentService.registerStudent();
        studentService.showStudents();
        studentService.showStudent();
    }
}
