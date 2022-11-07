package j19_컬렉션;

import java.util.ArrayList;
import java.util.List;


public class StudentList {
    public static void main(String[] args) {

        //ArrayList 라는..말임 앞으로 이걸 자주씀
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));

        String searchName = "김규민";

        //이름으로만 학번찾기
//        for(Student student : students){
//            if(student.getName().equals(searchName)){//
//                System.out.println(searchName+"학생의 학번: "+student.getId());
//                break;

        //일반for문으로 만들기
//        for(int i=0; i<students.size(); i++){
//            if(students.get(i).getName().equals(searchName)){//equals로 문자열3을 찾아라
//                System.out.println(searchName+"학생의 학번: "+students.get(i).getId());
//                break;

        //일반for문 < 좀 더 간단하게 정의하고!!!!
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getName().equals(searchName)) {//equals로 문자열3을 찾아라
                System.out.println(searchName + "학생의 학번: " + student.getId());
                break;
            }
        }


        //id로 찾기
        int searchId = 20220002;
        int index = students.indexOf(20220002);
        System.out.println(students);
        for (Student student : students) {
            if (student.getId()==(searchId)) {
                System.out.println(searchId + "학생의 이름: " + student.getName());
                students.remove(students.indexOf(student));
                break;
            }

        }
        System.out.println(students);


        //id 찾기 > 일반 for문
        for(int i=0; i< students.size(); i++){
            Student student = students.get(i);
            if(student.getId()==searchId){
                students.remove(i);
                break;
            }
        }
    }
}