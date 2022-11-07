package j10_접근지정자.j15_Object클래스.equals;

import java.util.Objects;

public class Teacher {

    private String name;
    private String schoolName;

    public Teacher(String name, String schoolName) {
        this.name = name;
        this.schoolName = schoolName;
    }


//    객체 비교하는 방법
//    @Override //컨트롤o..
//    public boolean equals(Object obj) {
//
//        if(this == obj) return true;
//        if(obj == null) return false;
//        if(getClass() != obj.getClass()) return false;
//
//        Teacher other = (Teacher) obj;
//        return Objects.equals(name, other.name) && Objects.equals(schoolName, other.schoolName);
//    }


// 객체비교하는방법2 인텔리j 자체에서
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name) && Objects.equals(schoolName, teacher.schoolName);
    }
    

    @Override
    public int hashCode() {
        return Objects.hash(name, schoolName);
    }

    @Override //바로 만드는 방법 알트+인설트 > ToString
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
