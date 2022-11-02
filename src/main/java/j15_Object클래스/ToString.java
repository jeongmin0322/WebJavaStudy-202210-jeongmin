package j15_Object클래스;

public class ToString {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("김준일","부산");

        System.out.println(objectTest);
        System.out.println(objectTest.toString()); //7,8번 똑같은데 10번가보면

        String str = objectTest.toString(); //얘는 ToString을 붙여야 출력 가넝, 형변환!!
        System.out.println(str);
        System.out.println(objectTest.showInfo());

        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        Teacher teacher2 = new Teacher("김준이", "부산교육대학원");

        System.out.println(teacher1);
        System.out.println(teacher2);

    }
}
