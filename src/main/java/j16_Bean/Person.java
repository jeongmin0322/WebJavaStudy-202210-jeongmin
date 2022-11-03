package j16_Bean;

public class Person {
    private final String name;          // 맴버변수에 final을 선언하면 필수값이 된다.
    private int age;

//    public Person(){} 얘는 생성할 수 없음       <- NoArgsConstructor는 RequiredArgsConstructor와 함께 쓸 수 없다.

    //final은 초기화가 필수여서 constructor가 꼭 있어야함
    public Person(String name, int age) {      // <- AllArgsConstructor
        this.name = name;
        this.age = age;
    }

//    이런식으로하면 나중에 오류생길수도 있어서 private String name; 이었지만 final 붙임
    public Person(String name){       // <- requiredArgsConstructor
        this.name = name;
    }

}
