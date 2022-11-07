package j10_접근지정자.j15_Object클래스;

public class TeacherEquals {
//    @Override //컨트롤o..
//    public boolean equals(Object obj) {
//        return super.equals(obj);
//    }


    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("김준일","코리아아이티");
        j10_접근지정자.j15_Object클래스.equals.Teacher teacher2 = new j10_접근지정자.j15_Object클래스.equals.Teacher("김준일","코리아아이티");
        //컨트롤스페이스 하면됨,,


//        System.out.println(teacher1 == teacher2); //주소값 다르니까 false
        System.out.println(teacher1.equals(teacher2)); //얘도 false equals 타고 들어가보면 다름

        System.out.println(teacher1.hashCode() == teacher2.hashCode()); //true나옴 안에 들어가있는 값이 같기때문에

    }
}
