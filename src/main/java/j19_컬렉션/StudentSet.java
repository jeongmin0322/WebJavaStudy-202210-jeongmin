package j19_컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentSet {
    public static void main(String[] args) {
        Set<Student> studentSet = new HashSet<Student>();
        List<Student> students = new ArrayList<Student>();
        students.add(new Student(20220001, "김준일"));
        students.add(new Student(20220002, "정빈"));
        students.add(new Student(20220003, "김규민"));
        students.add(new Student(20220004, "박경효"));
        students.add(new Student(20220005, "김혜진"));
        students.add(new Student(20220006, "김지향"));


        /*
                1. 김혜진 학생의 학번을 출력하세요.
                2. 20220004 학번을 가진 학생의 이름을 설민수로 변경하세요.
                3. 20220001 학번이 존재하면 해당 학생을 삭제하세요.

                <숙제다하고 난뒤> - 심화
                set를 list로 변환하기 << 그럼 뒤죽박죽된 순서대로 들어감
                해당 list를 학번 순서에 맞게 정렬하시오.
         */
    }
}
