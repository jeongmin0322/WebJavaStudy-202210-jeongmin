package j19_컬렉션;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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


        /**
         * id = 20220003학생을 찾아서 그 학생의 이름이 김규민이면 김경민으로 바꿔라
         */


//        int searchId = 20220003;
//        System.out.println(students);
//
//        for(Student student : students) {
//            if (student.getId() == (searchId) && student.getName().equals("김규민")) {
//                student.setName("김경민");
//                break;
//            }
//        }
//            System.out.println(students);

        int searchId = 20220004;
        //박경효를 박창우로 바꿈
        System.out.println(students);

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == searchId) {
                student.setName("박창우");
                break;
            }
        }
        System.out.println(students);


        List<Student> reverseStudents = new ArrayList<Student>();

//        for(int i=0; i <students.size(); i++){
//            reverseStudents.add(students.get(students.size()-1-i));
//        }
//        System.out.println(reverseStudents);

        for (Student student : students) {
            reverseStudents.add(0, student);
        }

        System.out.println(reverseStudents);

        Collections.reverse(reverseStudents);
        System.out.println(reverseStudents+"\n\n\n");



        /*
        idList
        nameList
         */


        List<Integer> idList = new ArrayList<Integer>();
        List<String> nameList = new ArrayList<String>();

        for(Student student : students){
            idList.add(student.getId());
            nameList.add(student.getName());
        }
        System.out.println(idList);
        System.out.println(nameList);

        students.clear();

        System.out.println(students);

        for(int i=0; i<idList.size(); i++){
            Student student = new Student(idList.get(i), nameList.get(i));
            students.add(student);
        }
        System.out.println(students);



    }



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

//        //일반for문 < 좀 더 간단하게 정의하고!!!!
//        for (int i = 0; i < students.size(); i++) {
//            Student student = students.get(i);
//            if (student.getName().equals(searchName)) {//equals로 문자열3을 찾아라
//                System.out.println(searchName + "학생의 학번: " + student.getId());
//                break;
//            }
//        }


//        //id로 찾기
//        int searchId = 20220002;
//        int index = students.indexOf(20220002);
//        System.out.println(students);
//        for (Student student : students) {
//            if (student.getId()==(searchId)) {
//                System.out.println(searchId + "학생의 이름: " + student.getName());
//                students.remove(students.indexOf(student));
//                break;
//            }
//
//        }
//        System.out.println(students);


//        //id 찾기 > 일반 for문
//        for(int i=0; i< students.size(); i++){
//            Student student = students.get(i);
//            if(student.getId()==searchId){
//                students.remove(i);
//                break;
//            }
        }
