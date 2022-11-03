package j16_Bean;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //name만 초기화하는 생성자만 만들어짐
@AllArgsConstructor
public class PersonRequired {
    private final String name;
    private int age;


}
