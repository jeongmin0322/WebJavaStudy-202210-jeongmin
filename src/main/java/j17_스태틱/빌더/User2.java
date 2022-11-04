package j17_스태틱.빌더;


import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class User2 {
    private String username;
    private String password;
    private String email;
    private String name;


    //to메소드 많이 사용함 100번지의 주소안에 각각의 값들이 들어있는데 to메소드를 통해 유저객체를 생성함. 100번지안에 있는애들!!
    public User to(){
        return User.builder()
                .username(username)
                .password(password)
                .email(email)
                .name(name)
                .build();
    }
}
