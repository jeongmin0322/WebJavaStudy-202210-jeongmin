package j11_배열.StudentManagement;
//서비스들이 들어감
import java.util.Scanner;

public class StudentService {
    private Scanner scanner;
    private StudentRepository studentRepository;

    public StudentService(Scanner scanner, StudentRepository studentRepository) {
        this.scanner = scanner;
        this.studentRepository = studentRepository;
    }



    public void registerStudent() { //호출되면 입력받아서 학생1명을 생성

        String name;
        int kor;
        int eng;
        int math;

        System.out.println("[학생정보 등록]");
        System.out.print("이름: ");
        name = scanner.nextLine();
        System.out.print("국어: ");
        kor = scanner.nextInt();
        System.out.print("영어: ");
        eng = scanner.nextInt();
        System.out.print("수학: ");
        math = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(name,kor,eng,math);

        studentRepository.addStudent(student);

    }

    public void showStudents(){
        Student[] students = studentRepository.getStudents();

        for(int i=0; i<students.length; i++){
            Student student = students[i];
            student.showStudentInfo();
        }
    }
    public void showStudent(){
        String name;
        System.out.println("[학생 정보 이름으로 조회]");
        System.out.print("이름을 입력하세요: ");
        name = scanner.nextLine();

        int index = studentRepository.findStudentByName(name); //인덱스 번호를 찾아줌
        if (index == -1){
            System.out.println("입력한 이름의 학생이 등록되어 있지 않습니다.");
            return; //return 걸리면 이 메소드를 바로 빠져나감
        }

        studentRepository.getStudent(index).showStudentInfo();
    }
}
