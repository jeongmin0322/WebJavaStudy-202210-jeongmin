package j13_추상화.인터페이스;

/*
 * Interface(인터페이스)
 * 1. 기본적으로 모든 메소드가 추상메소드로 정의된다.
 * 2. 일반 메소드를 정의하기 위해서는 default 키워드를 사용하여야한다.
 * 3. 생성자 정의는 불가능하다 ex) public Switch(){}; <얘처럼
 * 4. 일반 변수 선언도 불가능하다. (3번이 안되니까)
 * 5. 상수는 선언할 수 있다. (접근지정자 public 사용)
 */

public interface Press { //interface를 class로 바꾸면 바뀜 파일자체가
    //interface도 추상화와 마찬가지로 생성이 불가능함

    public final String name = "Press";          //[상수 선언, 초기화] public 대신 private는 안됨, getter setter를 줄게아님

    public void onPressed();
    //class는 abstract가 꼭 들어가야하는데 interface는 생략가능..


//    private String name;                 [변수 선언]


//    public Switch(){                     [생성자]
//
//    }

//    public default void pop(){           [일반메소드]
//    이렇게하면 일반메소드를 정의할 수 있다.
//    }

}
