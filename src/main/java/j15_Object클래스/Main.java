package j15_Object클래스;

public class Main {
    public static void main(String[] args) {
        ObjectTest objectTest = new ObjectTest("김준일","부산");

        int hashCode = objectTest.hashCode();

        System.out.println(hashCode); //주소값
        System.out.println(Integer.toHexString(hashCode)); //toHexString > integer를 16진수로 바꿔라

        System.out.println(objectTest);


    }
}
