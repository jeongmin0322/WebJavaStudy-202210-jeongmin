package j17_스태틱.빌더;

public class UserMain {
    public static void main(String[] args) {
        User user = User.builder() //빌더는 스태틱메소드라서 언제든지 호출가능
                .email("skjil1218@gmail.com")
                .username("junil") //순서노상관-이런형식임
                .build();

        System.out.println(user);

//AllArgsConstructor는 순서도지켜야하고 null값..등등해야하는데 얘는 그냥 맘대로 순서상관없이 넣어도됨

        User2 user2 = User2.builder()
                .name("김준일")
                .build();
        System.out.println(user2);

        User u = user2.to();
        System.out.println(u);
    }
}
