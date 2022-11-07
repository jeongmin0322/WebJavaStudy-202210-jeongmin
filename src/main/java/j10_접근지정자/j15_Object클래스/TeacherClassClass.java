package j10_접근지정자.j15_Object클래스;

import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class TeacherClassClass {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("김준일", "코리아아이티");
        Teacher teacher2 = new Teacher("김준일", "코리아아이티");

        Class t_class = teacher1.getClass(); //getClass 정보들을 담는 클래스

        System.out.println(t_class.getSimpleName());
        System.out.println(t_class.getName());

        Field[] field = t_class.getDeclaredFields();
        for(int i=0; i<field.length; i++) {
            System.out.println(field[i].getName());
            System.out.println(field[i].getType().getSimpleName());
        }

        Method[] methods = t_class.getDeclaredMethods();
        for(int i=0; i<methods.length; i++){
            System.out.println(methods[i].getReturnType());
        }

        System.out.println(teacher1.getClass() == teacher2.getClass());
        System.out.println(teacher1 instanceof Teacher);
        System.out.println(teacher1.getClass() == Teacher.class); //이렇게하면 instanceof 안써도됨 이걸로 대체
        System.out.println(teacher2.getClass() == Teacher.class);

        //System.out.println(t_class.getFields());


    }
}