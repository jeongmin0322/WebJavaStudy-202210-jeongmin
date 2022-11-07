package j10_접근지정자.j15_Object클래스;

public class StringEquals {
    public static void main(String[] args) {
        String name1 = "김준일";
        String name2 = "김준일";
        String name3 = new String("김준일"); //new 라는건 메모리를 새로 할당받는것
        String name4 = new String("김준일"); //String도 클래스라서 new해서 생성가능

        System.out.println(name1 + ", "+name2+", "+name3);

        System.out.println(name1 == name2); //얘는 True
        System.out.println(name1 == name3); //얘는 False
        System.out.println(name3 == name4); //얘도 False -> 값을 비교하는게 아니라 주소를 비교하는거임

        System.out.println(name1.equals(name3)); //얘네는 문자열 그자체를 비교해주는것!!!!
    }

}
