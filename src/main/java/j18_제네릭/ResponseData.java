package j18_제네릭;
//제네릭 > 자료형이 맞게 자동으로 변함
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ResponseData<T> { //제네릭 방법 <T> 적음 -> String도 됐다가... int도 됐다가 integer도 됐다가~
    private String message;
    private T data;

}
