package j16_Bean;


import lombok.*;

import java.util.Objects;

// 정보를 담는 객체를 Entity Class라고 한다.
/*
    맴버변수 선언
    생성자 정의
    Getters and Setters 정의
    Equals and HashCode 정의
    toString 정의

 */
@NoArgsConstructor //기본 생성자 - 이게  public Person(){} 이런느낌
@AllArgsConstructor //전체 생성자 - 모든 값을 초기화/ 얘는 this...어쩌고,,
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString //이렇게하면 아까 그 긴 코드들을 대체해줌... lombok을 쓰면!!!
@Data //위에 주석 단 애들을 다 포함시킴 앞으로 이 3개만 적으면 됨
//왜이렇게하냐면 자료형이나 변수 이름이 바뀌면 하나하나 다 바꿔줘야하는데 이렇게 적어주면 안바꿔적어도 돼서 편함


public class UserEntityLombok {
    private String username;
    private String password;
    private String email;
    private String name;

}