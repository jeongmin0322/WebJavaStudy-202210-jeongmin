package j21_익명클래스;

public class AdditionMain1 {
    public static void main(String[] args) {
//        Addition<String> stringAddition = new Addition<String>();
        //생성할 수 없다 왜냐 interface라서 그래서 implements해서 구현해줘야함 < 중요!!


        Addition<String> stringAddition = new AdditionImpl<String>();
        //Addition<String>으로 업캐스팅하는중

        String str = stringAddition.add("문자열");
        System.out.println(str);

        Addition<Integer> integerAddition = new Addition<Integer>(){
            //클래스 이름 조차 없어서 익명클래스 -> 그러나 구현,생성은 됨

            //재정의하는 이유-> 해당 메소드를 오버라이드하기 위해서
            @Override //(임시)클래스를 바로 정의함 그리고 integer로 생성까지
            //클래스는 틀인데 이건 일회용 틀이라고 생각하면됨.. 재사용은 안됨
            public Integer add(Integer values) {
                return null;
            }
        };

    }
}
