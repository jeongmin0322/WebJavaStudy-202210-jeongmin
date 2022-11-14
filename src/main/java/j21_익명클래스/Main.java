package j21_익명클래스;

public class Main {
    public static void main(String[] args) {
        Interface1 interface1 = new Class1();
        Interface1 interface2 = new Class1();
        Interface1 interface3 = new Class1();
        Interface1 interface4 = new Class1();
        Interface1 interface5 = new Class1();

        interface1.methodName();
        interface2.methodName();
        interface3.methodName();
        interface4.methodName();
        interface5.methodName();

        Interface1 interface6 = new Interface1() { //얘는 위에와 달리 Class1파일이 없어도 사용 가능
            //interface를 쓸려하는데!! 얘를 implements을 임시로 구현하겠따
            //다른 클래스에서는 못씀
            //한번정도만 쓸거면 클래스파일로 늘리지말고 메인문안에서 쓰고 버려라 느낌
            @Override
            public void methodName() {
                System.out.println("익명클래스로 정의한 메소드");
            }

            @Override
            public void methodName2() {
                System.out.println("재정의");
            }
        };

        interface6.methodName();
        interface6.methodName2();

        Interface1 interface7 = new Interface1() {
            @Override
            public void methodName() {
                System.out.println("익명클래스로 정의한 메소드");
            }
        };
        interface7.methodName();
        interface7.methodName2();
    }
}
